package com.example.layoutsweather.LinerRecycleViewLayout.Followers

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutsweather.LinerRecycleViewLayout.Followers.adapters.ContactAdapter
import com.example.layoutsweather.LinerRecycleViewLayout.Followers.models.ContactData
import com.example.layoutsweather.R

class FollowersActivity : AppCompatActivity() {
    private lateinit var data : ArrayList<ContactData>
    private lateinit var adapter : ContactAdapter
    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_followers)
        addData()
        listView = findViewById(R.id.listView)
        adapter = ContactAdapter(data)
        listView.adapter = adapter
        //        listView.setDividerHeight(16);
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView , view , i , l ->
            Toast.makeText(
                this@FollowersActivity ,
                data[i].name ,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun addData() {
        data = ArrayList()
        data.add(ContactData("Azizbek" , "4" , R.drawable.image,R.color.blue))
        data.add(ContactData("Bobur" , "32" , R.drawable.image,R.color.purple_200))
        data.add(ContactData("Komiljon" , "23" , R.drawable.image,R.color.white))
        data.add(ContactData("Samandar" , "54" , R.drawable.image,R.color.purple_500))
        data.add(ContactData("Mustafo" , "123" , R.drawable.image,R.color.teal_700))
        data.add(ContactData("Sardor" , "5" , R.drawable.image,R.color.color1))
        data.add(ContactData("Nurdiyor" , "654" , R.drawable.image,R.color.color2))
        data.add(ContactData("Azizbek" , "777" , R.drawable.image,R.color.color3))
        data.add(ContactData("Bobur" , "65" , R.drawable.image,R.color.color4))
        data.add(ContactData("Komiljon" , "1" , R.drawable.image,R.color.color5))
        data.add(ContactData("Samandar" , "8" , R.drawable.image,R.color.color6))
        data.add(ContactData("Mustafo" , "9" , R.drawable.image,R.color.color1))
        data.add(ContactData("Sardor" , "5" , R.drawable.image,R.color.color2))
        data.add(ContactData("Nurdiyor" , "6" , R.drawable.image,R.color.color3))
        data.add(ContactData("Azizbek" , "23" , R.drawable.image,R.color.color4))
        data.add(ContactData("Bobur" , "65" , R.drawable.image,R.color.color5))
        data.add(ContactData("Komiljon" , "87" , R.drawable.image,R.color.color6))
        data.add(ContactData("Samandar" , "11" , R.drawable.image,R.color.color1))
        data.add(ContactData("Mustafo" , "655" , R.drawable.image,R.color.color2))
        data.add(ContactData("Sardor" , "76" , R.drawable.image,R.color.color3))
        data.add(ContactData("Nurdiyor" , "73" , R.drawable.image,R.color.color4))
    }
}