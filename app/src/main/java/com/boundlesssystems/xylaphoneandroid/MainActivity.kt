package com.boundlesssystems.xylaphoneandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    val noteList = arrayOf("note1" , "note2" , "note3" ,"note4", "note5" ,"note6" , "note7")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
