package com.example.layoutsweather.LinerRecycleViewLayout.Followers.Purchase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutsweather.LinerRecycleViewLayout.Followers.Purchase.models.ContactData
import com.example.layoutsweather.R
import com.google.android.material.imageview.ShapeableImageView

class ContactRecycleAdapter(data: ArrayList<ContactData>): RecyclerView.Adapter<ContactRecycleAdapter.ContactViewHolder>() ,Filterable{
    private var     data: ArrayList<ContactData>? = null
    private var datafull: ArrayList<ContactData>? = null
    lateinit var filter:ContactData

    init {
        this.data = data
        this.datafull = ArrayList(data)
    }

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ShapeableImageView = itemView.findViewById(R.id.image)
        private val name: TextView = itemView.findViewById(R.id.name)
        private val date: TextView = itemView.findViewById(R.id.date)
        private val mooney: TextView = itemView.findViewById(R.id.money)
        private val exception: TextView = itemView.findViewById(R.id.exception)

        fun bind(contactData: ContactData) {
            image.setImageResource(contactData.image)
            name.text = contactData.name
            date.text = contactData.date
            mooney.text = contactData.money
            exception.text = contactData.exception

            itemView.setOnClickListener {

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
//        val view = ContactViewHolder(itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_purchase, parent, false)
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_purchase, parent, false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(data!![position])
    }

    override fun getItemCount(): Int {
        return data!!.size
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                var filteredList = java.util.ArrayList<String>()

                if (constraint.toString().isEmpty()){
                    filteredList.addAll(listOf(filter.name))
                }
                else{
                    filteredList.forEach {
                        if (it.lowercase().contains(constraint.toString().lowercase())){
                            filteredList.add(it)
                        }
                    }
                }

                val filterResult = FilterResults()
                filterResult.values = filteredList
                return filterResult
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                data!!.clear()
                data!!.addAll(results!!.values as Collection<ContactData>)
                notifyDataSetChanged()
            }
        }
    }
}

