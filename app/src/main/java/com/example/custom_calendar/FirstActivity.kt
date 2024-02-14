package com.example.custom_calendar

import android.R
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class FirstActivity : AppCompatActivity() {
lateinit var myLayout:LinearLayout
    lateinit var nums_Array:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.custom_calendar.R.layout.first_activity)
init()

    }
    private fun init(){
        myLayout=findViewById(com.example.custom_calendar.R.id.layout)
        nums_Array=getResources().getStringArray(com.example.custom_calendar.R.array.Days)
        val lp = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        val pairs = arrayOfNulls<TextView>(6*7)

        for (l in nums_Array.indices) {
            pairs[l] = TextView(this)
            pairs[l]!!.textSize = 15f
            pairs[l]!!.layoutParams = lp
            pairs[l]!!.id = l
            pairs[l]!!.text = (l + 1).toString()
            myLayout.addView(pairs[l])
        }
    }
}