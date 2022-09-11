package com.example.wishlist

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class WishFetcher : AppCompatActivity(){
    //companion object {
        val name = findViewById<EditText>(R.id.editName).text.toString()
        val price = findViewById<EditText>(R.id.editPrice).text.toString()
        val url = findViewById<EditText>(R.id.editUrl).text.toString()
        fun getWishes(): Wish {
            var wishes: MutableList<Wish> = ArrayList()

            val wish = Wish(name, price, url)
            wishes.add(wish)

            return wish
        }
    //}
}