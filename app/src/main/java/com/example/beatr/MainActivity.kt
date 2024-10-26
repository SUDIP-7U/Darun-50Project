package com.example.beatr

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.beatr.uicontrolller.HomeController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val controller = HomeController()

        findViewById<EpoxyRecyclerView>(R.id.rcv).setController(controller)

        controller.setTitle("Recent Chat")

        //  controller.allMessages = Data.messages
        // controller.recentlyActive = Data.recentlyActive



    }
}