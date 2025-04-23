package com.example.projectmobiles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class landing : AppCompatActivity() {

    private lateinit var navBar: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        navBar = findViewById(R.id.bottomNavigationView)

        // Default fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, explore())
            .commit()

        navBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_explore -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, explore())
                        .commit()
                    true
                }
                R.id.nav_favorite -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, favorite())
                        .commit()
                    true
                }
                R.id.nav_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, profile())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}

