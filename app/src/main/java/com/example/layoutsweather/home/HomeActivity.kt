package com.example.layoutsweather.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.appcompat.widget.AppCompatButton
import com.example.layoutsweather.R

class HomeActivity : AppCompatActivity() {
    lateinit var battery: AppCompatButton
    lateinit var alarm: AppCompatButton
    lateinit var camera: AppCompatButton
    lateinit var quick: AppCompatButton
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        battery=findViewById(R.id.btnbattery)
        alarm=findViewById(R.id.btnalarm)
        camera=findViewById(R.id.btncamera)
        quick=findViewById(R.id.btnquick)
        battery.text = Html.fromHtml("Battery<br/><small>58. 33 D 13n reminding</small>")
        alarm.text = Html.fromHtml("Alarm<br/><small>Monday 1:15 PM to 1:45 PM</small>")
        camera.text = Html.fromHtml("Camera<br/><small>Monday 1:15 PM to 1:45 PM</small>")
        quick.text = Html.fromHtml("QuickPic<br/><small>View images</small>")
    }
}