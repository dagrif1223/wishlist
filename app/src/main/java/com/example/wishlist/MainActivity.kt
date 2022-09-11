package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
     var wishes: MutableList<Wish> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val listRv = findViewById<RecyclerView>(R.id.listRv)
        // Fetch the list of emails
        //wishes = WishFetcher.getWishes()
        // Create adapter passing in the list of emails
        val adapter = WishAdapter(wishes)
        // Attach the adapter to the RecyclerView to populate items
        listRv.adapter = adapter
        // Set layout manager to position the items
        listRv.layoutManager = LinearLayoutManager(this)
        findViewById<Button>(R.id.btnSubmit).setOnClickListener{
            var itemName = findViewById<EditText>(R.id.editName).text.toString()
            var itemPrice = findViewById<EditText>(R.id.editPrice).text.toString()
            var itemUrl = findViewById<EditText>(R.id.editUrl).text.toString()
            var item = Wish(itemName, itemPrice,itemUrl)
            wishes.add(item)
            findViewById<EditText>(R.id.editName).text.clear()
            findViewById<EditText>(R.id.editPrice).text.clear()
            findViewById<EditText>(R.id.editUrl).text.clear()
            adapter.notifyDataSetChanged()
        }
    }

    }


