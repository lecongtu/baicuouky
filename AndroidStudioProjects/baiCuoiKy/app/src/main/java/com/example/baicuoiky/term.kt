package com.example.baicuoiky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.core.view.setPadding
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_term.*
import kotlin.math.abs

class term : AppCompatActivity() {

    private lateinit var actionBar:ActionBar
    private lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_term)


        loadCards()

    }

    private fun loadCards() {
        myModelList = ArrayList()

        myModelList.add(
            MyModel(
            "lambogini",
            "Description22222222222222222222222222",
            R.drawable.home)
        )
        myModelList.add(
                MyModel(
                        "lambogini",
                        "Description22222222222222222222222222",
                        R.drawable.plus)
        )
        myModelList.add(MyModel(
            "audi",
            "Description3333333333333333333",
            R.drawable.eeee))

        myAdapter = MyAdapter(this, myModelList)

        viewPager.adapter = myAdapter

        viewPager.setPadding(100,0,100,0)
    }
}