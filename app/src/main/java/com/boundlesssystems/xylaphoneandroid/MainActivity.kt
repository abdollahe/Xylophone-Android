package com.boundlesssystems.xylaphoneandroid

import android.content.ContentResolver
import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.io.File
import java.net.URI

class MainActivity : AppCompatActivity() {


    val noteList = arrayOf("note1" , "note2" , "note3" ,"note4", "note5" ,"note6" , "note7")
    lateinit var mediaPlayer : MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun noteClicked(view : View) {

        val index = (view.tag as String).toInt()

        val uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + File.pathSeparator + "//" + packageName + "/raw/${noteList[index - 1]}")

        mediaPlayer = MediaPlayer.create(this, uri)

        mediaPlayer.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        // Release the media player when closing the applications
        mediaPlayer?.release()
    }
}
