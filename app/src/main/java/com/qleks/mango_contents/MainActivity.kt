package com.qleks.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkButton.setOnClickListener {

            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "1마라도 회식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "2마라도 회식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "3마라도 회식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "4마라도 회식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "5마라도 회식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "6마라도 회식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "7마라도 회식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wlvp5j7mpA",
                "https://mp-seoul-image-production-s3.mangoplate.com/594757_1641012345552863.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "8마라도 회식당"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(this,items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object: RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)

                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)
                intent.putExtra("ImageUrl", items[position].ImageUrl)
                startActivity(intent)
            }

        }

        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}