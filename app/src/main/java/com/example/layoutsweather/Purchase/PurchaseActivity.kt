package com.example.layoutsweather.Purchase

import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutsweather.Purchase.adapter.ContactRecycleAdapter
import com.example.layoutsweather.Purchase.models.ContactData
import com.example.layoutsweather.R

class PurchaseActivity : AppCompatActivity() {
    private lateinit var data:ArrayList<ContactData>
    private lateinit var adapter: ContactRecycleAdapter
    private lateinit var listView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchases)
        listView = findViewById(R.id.recycle)
        addData()
        adapter = ContactRecycleAdapter(data)
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = adapter
    }

    private fun addData(){
        data = ArrayList()
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
        data.add(ContactData(R.drawable.star,"Blue MountainS Day Tour","12.03.2022","$45","Redeemed"))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)

        val search = menu?.findItem(R.id.search_action)
        val searchView = search?.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                adapter.getFilter().filter(p0)
                return false
            }

        })

        return super.onCreateOptionsMenu(menu)
    }

}