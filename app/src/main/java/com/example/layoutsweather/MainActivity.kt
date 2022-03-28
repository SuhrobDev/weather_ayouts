package com.example.layoutsweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layoutsweather.LinerRecycleViewLayout.Followers.FollowersActivity
import com.example.layoutsweather.Purchase.PurchaseActivity
import com.example.layoutsweather.freelancer.FreelancerActivity
import com.example.layoutsweather.sushi.SushiActivity
import com.example.layoutsweather.weather.agenda.AgendaActivity
import com.example.layoutsweather.weather.email_app.EmailActivity
import com.example.layoutsweather.weather.home.HomeActivity
import com.example.layoutsweather.weather.kirish_oynasi.KirishActivity
import com.example.layoutsweather.weather.weather1.WeatherActivity1
import com.example.layoutsweather.weather.weather2.WeatherAcitvity2
import com.example.layoutsweather.weather.weather4.Weather4Activity

class MainActivity : AppCompatActivity() {
    private lateinit var weather1:Button
    private lateinit var weather2:Button
    private lateinit var weather3:Button
    private lateinit var weather4:Button
    private lateinit var weather5:Button
    private lateinit var weather6:Button
    private lateinit var weather7:Button
    private lateinit var weather8:Button
    lateinit var freelancer:Button
    lateinit var followers:Button
    lateinit var sushi:Button
    lateinit var purchase:Button
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weather1=findViewById(R.id.weather1)
        weather2=findViewById(R.id.weather2)
        weather3=findViewById(R.id.weather3)
        weather4=findViewById(R.id.weather4)
        weather5=findViewById(R.id.weather5)
        weather6=findViewById(R.id.weather6)
        weather7=findViewById(R.id.weather7)
        weather8=findViewById(R.id.weather8)
        freelancer=findViewById(R.id.freelancer)
        followers=findViewById(R.id.followers)
        sushi=findViewById(R.id.sushi)
        purchase=findViewById(R.id.purchase)
        weather1.setOnClickListener {
            val intent = Intent(this , WeatherActivity1::class.java)
            startActivity(intent)
        }
        weather2.setOnClickListener {
            val intent = Intent(this , WeatherAcitvity2::class.java)
            startActivity(intent)
        }
        weather3.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }
        weather4.setOnClickListener {
            val intent = Intent(this , Weather4Activity::class.java)
            startActivity(intent)
        }
        weather5.setOnClickListener {
            val intent = Intent(this , HomeActivity::class.java)
            startActivity(intent)
        }
        weather6.setOnClickListener {
            val intent = Intent(this , AgendaActivity::class.java)
            startActivity(intent)
        }
        weather7.setOnClickListener {
            val intent = Intent(this , EmailActivity::class.java)
            startActivity(intent)
        }
        weather8.setOnClickListener {
            val intent = Intent(this , KirishActivity::class.java)
            startActivity(intent)
        }
        freelancer.setOnClickListener {
            val intent = Intent(this , FreelancerActivity::class.java)
            startActivity(intent)
        }
        followers.setOnClickListener {
            val intent = Intent(this , FollowersActivity::class.java)
            startActivity(intent)
        }
        sushi.setOnClickListener {
            val intent = Intent(this , SushiActivity::class.java)
            startActivity(intent)
        }
        purchase.setOnClickListener {
            val intent = Intent(this , PurchaseActivity::class.java)
            startActivity(intent)
        }
    }
}