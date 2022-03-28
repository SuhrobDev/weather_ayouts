package com.example.layoutsweather.LinerRecycleViewLayout.Followers.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.appcompat.widget.AppCompatTextView;

import com.example.layoutsweather.LinerRecycleViewLayout.Followers.models.ContactData;
import com.example.layoutsweather.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {
    private final ArrayList<ContactData> data;

    public ContactAdapter(ArrayList<ContactData> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public ContactData getItem(int index) {
        return data.get(index);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_followers, viewGroup, false);
        ShapeableImageView image = view.findViewById(R.id.image);
        AppCompatTextView name = view.findViewById(R.id.name);
        AppCompatTextView countFollower = view.findViewById(R.id.numfollower);
        ContactData contactData = getItem(index);
        //view.findViewById(R.id.back).setBackgroundColor(Color.parseColor("#000000"));
        image.setImageResource(contactData.getImage());
        name.setText(contactData.getName());
        countFollower.setText(contactData.getCountF());
        return view;
    }
}
