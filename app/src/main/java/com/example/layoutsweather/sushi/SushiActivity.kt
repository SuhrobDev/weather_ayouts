package com.example.layoutsweather.sushi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.layoutsweather.R
import com.example.layoutsweather.sushi.adapters.FoodAdapter1
import com.example.layoutsweather.sushi.models.FoodData

class SushiActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var adapter: FoodAdapter1
    private lateinit var data : ArrayList<FoodData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sushi)
        appData()
        listView = findViewById(R.id.sushiView)
        adapter = FoodAdapter1(data)
        listView.adapter=adapter
    }

    private fun appData() {
        data = arrayListOf()
        data.add(FoodData("SUSHI", R.drawable.sushi, "a japanese dish consisting of small balls  or rolls of vinegar-flavored cold cooked rice served with a gamish of raw fish, vegetables, or egg."))
        data.add(FoodData("DIM SUM", R.drawable.dim_sum, "a Chinese dish of small stearned of fried savory dumplings containing varicus fillings, served  as  a snack or main course."))
        data.add(FoodData("PASTA", R.drawable.pasta, "a dish originally form italy consisting of dhough made from durum wheat and water, extruded or stamped into various shapes and typically cooked in booling water."))
        data.add(FoodData("CURRY", R.drawable.curry, "a dish of meat, vegtables, etc. cooked in an Indian style sauce of strong spices and turmeric and typically served with rice."))
        data.add(FoodData("PALOV", R.drawable.palov, "Taom asosini guruch tashkil etadi. Ushbu masalliqdan tashqari yogʻ, goʻsht, sabzi, piyoz va boshqa masalliqlar ishlatiladi."))
        data.add(FoodData("LAVASH", R.drawable.lavash, "Лаваш представляет собой плоскую, очень тонкую, 2-5 мм, или менее стандартного размера, около 90-110 см длиной, шириной — около 40-50 см, весом — не более 250 грамм"))
        data.add(FoodData("SUMALAK", R.drawable.sumalak, "Tayyorlash usuli: jaydari qizil, qayroqi bugʻdoy tozalanib, sovuq suv bilan yuviladi. Zanglamaydigan idishga solinib, uch kun ivitib qoʻyiladi."))
    }
}