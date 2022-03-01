package com.example.experiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.experiment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val layouts =
            intArrayOf(R.layout.welcome_slide1, R.layout.welcome_slide2, R.layout.welcome_slide3)

        mainBinding.vPager.adapter = VAdapter(layouts)

    }
}