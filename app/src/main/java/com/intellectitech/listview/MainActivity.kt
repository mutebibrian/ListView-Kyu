package com.intellectitech.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        //Function<*, *> means Function<in Nothing, out Any?> . note. Star-projections are very much like Java's raw types, but safe.
        val users = arrayOf(
            "Brian Tom", "Ronny wim", "Steve alex",
            "Kanny William", "Ross Tonny"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }
}

