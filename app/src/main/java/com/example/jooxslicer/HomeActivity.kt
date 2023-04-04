package com.example.jooxslicer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home)
        Topintent()
    }

    fun Topintent(){
        var top: LinearLayout =  findViewById(R.id.top)

        top.setOnClickListener{
            val intent = Intent(this, PlaylistActivity::class.java)
            startActivity(intent)
        }
    }
}