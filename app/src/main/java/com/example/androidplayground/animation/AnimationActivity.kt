package com.example.androidplayground.animation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidplayground.R
import com.example.androidplayground.animation.motion.MotionActivity
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        btnOpenMotion.setOnClickListener {
            startActivity(Intent(this, MotionActivity::class.java))
        }
    }
}
