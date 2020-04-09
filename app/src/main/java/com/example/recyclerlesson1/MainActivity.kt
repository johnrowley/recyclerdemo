package com.example.recyclerlesson1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.user_row.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // appRecyclerTitle.text="Recycler Demo Application"



        // Test and run with a coloured background
        recyclerView_Main.setBackgroundColor(Color.YELLOW)

        //Add a layout
        recyclerView_Main.layoutManager = LinearLayoutManager(this)

        recyclerView_Main.adapter = MainAdapter()
    }
}

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {
   //val users = listOf(User("John", 58), User("Bob", 25), User("Sue", 43))

    val users = listOf(

        User("Orson", 25),User("Clark", 25),User("Martin", 25),User("Kenneth", 25),User("Caleb", 25),User("Chaney", 25),User("Henry", 25),User("Lane", 25),User("Otto", 25),User("Alec", 25),User("Channing", 25),User("Alfonso", 25),User("Porter", 25),User("Roth", 25),User("Gregory", 25),User("Lamar", 25),User("Conan", 25),User("Basil", 25),User("Giacomo", 25),User("Rogan", 25),User("Donovan", 25),User("Buckminster", 25),User("Jermaine", 25),User("Yasir", 25),User("Galvin", 25),User("Samuel", 25),User("Cameron", 25),User("Griffin", 25),User("Cyrus", 25),User("Dennis", 25),User("Adam", 25),User("Oscar", 25),User("Kadeem", 25),User("Hiram", 25),User("Amos", 25),User("Noble", 25),User("Caesar", 25),User("Garrison", 25),User("Tyrone", 25),User("Victor", 25),User("Clinton", 25),User("Cruz", 25),User("Randall", 25),User("Lamar", 25),User("Griffin", 25),User("Lester", 25),User("Moses", 25),User("Brennan", 25),User("Carl", 25),User("Wyatt", 25),User("Hamish", 25),User("Joseph", 25),User("George", 25),User("Aladdin", 25),User("Emmanuel", 25),User("Joel", 25),User("Stewart", 25),User("Elvis", 25),User("Omar", 25),User("Channing", 25),User("Kelly", 25),User("Brock", 25),User("Tucker", 25),User("Bert", 25),User("Elijah", 25),User("Steven", 25),User("Duncan", 25),User("Quamar", 25),User("Fulton", 25),User("Levi", 25),User("Steven", 25),User("Lewis", 25),User("Zane", 25),User("Nash", 25),User("Noah", 25),User("Colt", 25),User("Cyrus", 25),User("Abdul", 25),User("Lamar", 25),User("Kibo", 25),User("Zeph", 25),User("Clayton", 25),User("Fulton", 25),User("Colin", 25),User("Jonas", 25),User("Judah", 25),User("Adrian", 25),User("Isaac", 25),User("Ryder", 25),User("Reese", 25),User("Kuame", 25),User("Reuben", 25),User("Blake", 25),User("Clinton", 25),User("Mark", 25),User("Nehru", 25),User("Nash", 25),User("James", 25),User("Cullen", 25),User("Abraham", 25)
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
       // TODO("Not yet implemented")

        // We need to create a view here - similar to a template that will be reused
        // Create a new Layout resource that will be populated


        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.user_row, parent, false)
        println("Hello")
        return CustomViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
       // TODO("Not yet implemented")

        return users.size;
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
      //  TODO("Not yet implemented")

            holder.itemView.textView1.text = users[position].name
            holder.itemView.textView2.text = users[position].age.toString()
    }


}

class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}
