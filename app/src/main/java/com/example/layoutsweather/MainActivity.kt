package com.example.layoutsweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layoutsweather.weather.agenda.AgendaActivity
import com.example.layoutsweather.weather.email_app.EmailActivity
import com.example.layoutsweather.weather.home.HomeActivity
import com.example.layoutsweather.weather.kirish_oynasi.KirishActivity
import com.example.layoutsweather.weather.weather1.WeatherActivity1
import com.example.layoutsweather.weather.weather2.WeatherAcitvity2
import com.example.layoutsweather.weather.weather4.Weather4Activity

class MainActivity : AppCompatActivity() {
    lateinit var weather1:Button
    lateinit var weather2:Button
    lateinit var weather3:Button
    lateinit var weather4:Button
    lateinit var weather5:Button
    lateinit var weather6:Button
    lateinit var weather7:Button
    lateinit var weather8:Button
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



    }
}