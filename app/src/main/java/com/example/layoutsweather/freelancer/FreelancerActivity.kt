package com.example.layoutsweather.freelancer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutsweather.Purchase.adapter.ContactRecycleAdapter
import com.example.layoutsweather.Purchase.models.ContactData
import com.example.layoutsweather.R
import com.example.layoutsweather.freelancer.adapters.FreelancerAdapter
import com.example.layoutsweather.freelancer.models.FreelancerData

class FreelancerActivity : AppCompatActivity() {
    private lateinit var data : ArrayList<FreelancerData>
    private lateinit var adapter : FreelancerAdapter
    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freelancer)
        listView = findViewById(R.id.freelancerview)
        addData()
        adapter = FreelancerAdapter(data)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView , view , i , l ->
            Toast.makeText(
                this@FreelancerActivity ,
                data[i].category ,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun addData() {
        data = ArrayList()
        data.add(FreelancerData("The Idea"))
        data.add(FreelancerData("The Market"))
        data.add(FreelancerData("The Product"))
        data.add(FreelancerData("Business Model"))
        data.add(FreelancerData("Execution"))
        data.add(FreelancerData("Something"))
    }
}