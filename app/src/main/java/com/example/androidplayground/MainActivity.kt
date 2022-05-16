package com.example.androidplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidplayground.animation.AnimationActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialView()
    }
    private fun initialView() {
        btnOpenAnimationSession.setOnClickListener {
            startActivity(Intent(this, AnimationActivity::class.java))
        }
    }
}
