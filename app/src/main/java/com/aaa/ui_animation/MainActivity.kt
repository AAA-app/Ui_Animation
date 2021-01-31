package com.aaa.ui_animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declare the animation
        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb)

        val btt = AnimationUtils.loadAnimation(this, R.anim.btt)
        val btt2 = AnimationUtils.loadAnimation(this, R.anim.btt2)
        val btt3 = AnimationUtils.loadAnimation(this, R.anim.btt3)
        val bttCourse = AnimationUtils.loadAnimation(this, R.anim.btt_course)

        val headerTitle = findViewById<TextView>(R.id.headertitle)
        val subtitle = findViewById<TextView>(R.id.subtitle)

        val cards = findViewById<ImageView>(R.id.ic_cards)

        val resultOne = findViewById<LinearLayout>(R.id.resultOne)
        val resultTwo = findViewById<LinearLayout>(R.id.resultTwo)
        val resultThree = findViewById<LinearLayout>(R.id.resultThree)

        val btnNextCourse = findViewById<Button>(R.id.btn_next_course)

        //set the animation
        headerTitle.startAnimation(ttb)
        subtitle.startAnimation(ttb)
        cards.startAnimation(stb)

        resultOne.startAnimation(btt)
        resultTwo.startAnimation(btt2)
        resultThree.startAnimation(btt3)

        btnNextCourse.startAnimation(bttCourse)

        btnNextCourse.setOnClickListener{
            val intent = Intent(this, CourseActivity2::class.java)
            startActivity(intent)
        }
    }
}