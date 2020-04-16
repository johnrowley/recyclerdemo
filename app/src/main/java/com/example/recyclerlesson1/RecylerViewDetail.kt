package com.example.recyclerlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recycler_view_detail.*

class RecyclerViewDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_detail)

        // NOTICE USING THE CONSTANT FROM COMPANION OBJECT
        supportActionBar?.title = intent.getStringExtra(CustomViewHolder.DETAIL_TITLE_KEY)
    }
}
