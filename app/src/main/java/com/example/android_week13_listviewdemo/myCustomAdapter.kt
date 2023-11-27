package com.example.android_week13_listviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myCustomAdapter(val ctx:Context, var ourResource:Int, var items: MutableList<Model>):ArrayAdapter<Model>(ctx, ourResource, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflator = LayoutInflater.from(ctx)
        val view = layoutInflator.inflate(ourResource, null)

        //goto layout and get links the items
        val name = view.findViewById<TextView>(R.id.txtName)
        val extraTextView = view.findViewById<TextView>(R.id.extraText)
        val image = view.findViewById<ImageView>(R.id.img1)

        name.text = items[position].name
        extraTextView.text = items[position].extraText
        image.setImageDrawable(ctx.resources.getDrawable(items[position].image))


        //set the view items data to the data passed in

        return view
    }






}