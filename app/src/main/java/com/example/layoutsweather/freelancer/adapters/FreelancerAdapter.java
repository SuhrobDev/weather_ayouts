package com.example.layoutsweather.freelancer.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.layoutsweather.R;
import com.example.layoutsweather.freelancer.models.FreelancerData;
import java.util.ArrayList;

public class FreelancerAdapter extends BaseAdapter{
    ArrayList<FreelancerData> data;
    public FreelancerAdapter(ArrayList<FreelancerData> data){
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
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_freelancer, viewGroup, false);
        TextView category = view.findViewById(R.id.categry);
        FreelancerData freelancerData = (FreelancerData) getItem(i);
        category.setText(freelancerData.getCategory());
        return view;
    }
}
