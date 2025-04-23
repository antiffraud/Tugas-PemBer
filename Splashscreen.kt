package com.example.projectmobiles

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splashscreen : AppCompatActivity(), View.OnClickListener {
    private lateinit var splButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        splButton = findViewById(R.id.btn_splash)
        splButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_splash -> {
                val klikSpl = Intent(this@Splashscreen, Login::class.java)
                startActivity(klikSpl)
            }
        }
    }
}