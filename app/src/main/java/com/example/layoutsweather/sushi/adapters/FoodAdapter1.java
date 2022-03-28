package com.example.layoutsweather.sushi.adapters;
//
////

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.layoutsweather.R;
import com.example.layoutsweather.sushi.models.FoodData;

import java.util.ArrayList;

public class FoodAdapter1 extends BaseAdapter{
    ArrayList<FoodData> data;
    public FoodAdapter1(ArrayList<FoodData> data){
        this.data = data;
    }
    @Override
    public int getCount() {
         return  data.size();
    }

    @Override
    public Object getItem(int index) {
        return data.get(index);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sushi, viewGroup, false);
        ImageView image = view.findViewById(R.id.image);
        TextView name = view.findViewById(R.id.name);
        TextView about = view.findViewById(R.id.about);
        FoodData foodData = (FoodData) getItem(i);
        image.setImageResource(foodData.getImage());
        name.setText(foodData.getName());
        about.setText(foodData.getAbout());
        return view;
    }
}
