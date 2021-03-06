package com.beyondthebrushmobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.beyondthebrushmobile.classes.ArmorProfile

class ArmorAdapter (var itemList:ArrayList<ArmorProfile>,var context:Context) : BaseAdapter(){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val gridItem = itemList[position]

        val inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val itView = inflater.inflate(R.layout.armor_item,null)

        itView.findViewById<ImageView>(R.id.armor_image).setImageResource(gridItem.armorImage)
        itView.findViewById<TextView>(R.id.armor_name).text = gridItem.armorName

        return itView

    }

    override fun getItem(position: Int): Any {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return itemList.size
    }


}