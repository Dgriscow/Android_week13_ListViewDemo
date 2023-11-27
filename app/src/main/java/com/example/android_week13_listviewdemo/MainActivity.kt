package com.example.android_week13_listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val listView1 = findViewById<ListView>(R.id.listView)

        val stuff = arrayOf("item 1", "joe", "mamma", "item2", "apple", "orange", "pear", "item 5", "item J", "item M","item 1", "joe", "mamma", "item2", "apple", "orange", "pear", "item 5", "item J", "item M")

        //adapter
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            stuff)

        listView1.adapter = arrayAdapter

        //use a ON ITEM CLICK listener to get clickabily for items
        //inside the list,
        //per click it retrives its  parent, its view, its position, and its ID
        listView1.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, "Selected " + stuff[position], Toast.LENGTH_LONG).show()
        }





    }
}