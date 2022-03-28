package com.example.layoutsweather.LinerRecycleViewLayout.Followers;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.layoutsweather.LinerRecycleViewLayout.Followers.adapters.ContactRecycleAdapter;
import com.example.layoutsweather.LinerRecycleViewLayout.Followers.models.ContactData;
import com.example.layoutsweather.R;

import java.util.ArrayList;

public class RecyleActivity extends AppCompatActivity {
    private ArrayList<ContactData> data;
    //    private ContactRecycleAdapter adapter;
    //    private RecyclerView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyle);
        RecyclerView listView = findViewById(R.id.list);
        addData();
        ContactRecycleAdapter adapter = new ContactRecycleAdapter(data);
//        listView.setLayoutManager(new LinearLayoutManager(this));
//        listView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,true));
//        listView.setLayoutManager(new StaggeredGridLayoutManager(2,LinearLayoutManager.HORIZONTAL));
        listView.setLayoutManager(new GridLayoutManager(this,3));
        listView.setAdapter(adapter);
        adapter.setOnItemClickListener(new ContactRecycleAdapter.OnItemClickListener() {
            @Override
            public void onClick(String name) {
                Toast.makeText(RecyleActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addData() {
        data = new ArrayList<>();
        data.add(new ContactData("Azizbek" , "4" , R.drawable.image,R.color.blue));
        data.add(new ContactData("Bobur" , "32" , R.drawable.image,R.color.purple_200));
        data.add(new ContactData("Komiljon" , "23" , R.drawable.image,R.color.white));
        data.add(new ContactData("Samandar" , "54" , R.drawable.image,R.color.purple_500));
        data.add(new ContactData("Mustafo" , "123" , R.drawable.image,R.color.teal_700));
        data.add(new ContactData("Sardor" , "5" , R.drawable.image,R.color.color1));
        data.add(new ContactData("Nurdiyor" , "654" , R.drawable.image,R.color.color2));
        data.add(new ContactData("Azizbek" , "777" , R.drawable.image,R.color.color3));
        data.add(new ContactData("Bobur" , "65" , R.drawable.image,R.color.color4));
        data.add(new ContactData("Komiljon" , "1" , R.drawable.image,R.color.color5));
        data.add(new ContactData("Samandar" , "8" , R.drawable.image,R.color.color6));
        data.add(new ContactData("Mustafo" , "9" , R.drawable.image,R.color.color1));
        data.add(new ContactData("Sardor" , "5" , R.drawable.image,R.color.color2));
        data.add(new ContactData("Nurdiyor" , "6" , R.drawable.image,R.color.color3));
        data.add(new ContactData("Azizbek" , "23" , R.drawable.image,R.color.color4));
        data.add(new ContactData("Bobur" , "65" , R.drawable.image,R.color.color5));
        data.add(new ContactData("Komiljon" , "87" , R.drawable.image,R.color.color6));
        data.add(new ContactData("Samandar" , "11" , R.drawable.image,R.color.color1));
        data.add(new ContactData("Mustafo" , "655" , R.drawable.image,R.color.color2));
        data.add(new ContactData("Sardor" , "76" , R.drawable.image,R.color.color3));
        data.add(new ContactData("Nurdiyor" , "73" , R.drawable.image,R.color.color4));
    }
}