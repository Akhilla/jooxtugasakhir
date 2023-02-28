package com.example.jooxslicer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.cardview.widget.CardView

class JooxLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_joox_login)
        mobileintent()
        emailintent()
        facebookintent()
    }

    fun mobileintent(){
        var mobile: CardView =  findViewById(R.id.mobilecard)

        mobile.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    fun emailintent(){
        var mobile: CardView =  findViewById(R.id.emailcard)

        mobile.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    fun facebookintent(){
        var mobile: Button =  findViewById(R.id.btn_facebook)

        mobile.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

}