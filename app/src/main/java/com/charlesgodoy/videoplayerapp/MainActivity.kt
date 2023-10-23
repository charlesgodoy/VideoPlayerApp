package com.charlesgodoy.videoplayerapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // From local storage
        val videoView1 : VideoView = findViewById(R.id.video_view_1)
        videoView1.setVideoPath("android.resource://${this.packageName}/${R.raw.play_piano}")

        // Media Controller 1 - Local
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView1)
        mediaController.setMediaPlayer(videoView1)
        videoView1.setMediaController(mediaController)
        videoView1.start()   // enables it to start on startup



        // From the internet
        val videoVideo2 : VideoView = findViewById(R.id.video_view_2)
        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")

        videoVideo2.setVideoURI(uri)

        // Media Controller 2 - Internet
        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoVideo2)
        mediaController2.setMediaPlayer(videoVideo2)
        videoVideo2.setMediaController(mediaController2)
        videoVideo2.start()

    }
}