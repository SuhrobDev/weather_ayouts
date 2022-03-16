package com.example.layoutsweather.agenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.appcompat.widget.AppCompatButton
import com.example.layoutsweather.R

class AgendaActivity : AppCompatActivity() {
    lateinit var first:AppCompatButton
    lateinit var second:AppCompatButton
    lateinit var third:AppCompatButton
    lateinit var fourth:AppCompatButton
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)
//        first=findViewById(R.id.first)
//        second=findViewById(R.id.second)
//        third=findViewById(R.id.third)
//        fourth=findViewById(R.id.fourth)
//        first.text = Html.fromHtml("Monday 1:15 PM to 1:45 PM<br/><small>Monday 1:15 PM to 1:45 PM</small>")
//        second.text = Html.fromHtml("Monday 1:15 PM to 1:45 PM<br/><small>Monday 1:15 PM to 1:45 PM</small>")
//        third.text = Html.fromHtml("Monday 1:15 PM to 1:45 PM<br/><small>Monday 1:15 PM to 1:45 PM</small>")
//        fourth.text = Html.fromHtml("Wednesday<br/><small>Damolish</small>")
    }
}