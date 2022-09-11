package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class WishAdapter(private val wishes: List<Wish>): RecyclerView.Adapter<WishAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Your holder should contain a member variable for any view that will be set as you render
        // a row
        val nameTextView: TextView
        val priceTextView: TextView
        val urlTextView: TextView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            nameTextView = itemView.findViewById(R.id.txtName)
            priceTextView = itemView.findViewById(R.id.txtPrice)
            urlTextView = itemView.findViewById(R.id.txtUrl)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wish_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val wishes = wishes.get(position)
        // Set item views based on views and data model
        holder.nameTextView.text = wishes.name
        holder.priceTextView.text = wishes.price
        holder.urlTextView.text = wishes.url
    }
    override fun getItemCount(): Int {
        return wishes.size
    }
}