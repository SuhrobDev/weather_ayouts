package com.example.layoutsweather.LinerRecycleViewLayout.Followers.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.layoutsweather.LinerRecycleViewLayout.Followers.models.ContactData;
import com.example.layoutsweather.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;

public class ContactRecycleAdapter extends RecyclerView.Adapter<ContactRecycleAdapter.ContactViewHolder> {
    private final ArrayList<ContactData> data;
    private OnItemClickListener onItemClickListener;

    public ContactRecycleAdapter(ArrayList<ContactData> data) {
        this.data = data;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.
                from(parent.getContext()).inflate(R.layout.item_followers, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
//        holder.number.setText(data.get(position).getName());
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public interface OnItemClickListener {
        void onClick(String name);
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {
        private final ShapeableImageView image;
        private final AppCompatTextView name;
        private final AppCompatTextView countFollower;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            countFollower = itemView.findViewById(R.id.numfollower);
        }

        void bind(ContactData contactData) {
            image.setImageResource(contactData.getImage());
            name.setText(contactData.getName());
            countFollower.setText(contactData.getCountF());
            itemView.setOnClickListener(view -> onItemClickListener.onClick(contactData.getName()));
        }
    }
}