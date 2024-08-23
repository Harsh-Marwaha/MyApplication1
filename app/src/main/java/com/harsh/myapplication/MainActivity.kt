package com.harsh.myapplication

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var tvAnim : TextView? = null
    var btnTranslate : Button? = null
    var btnAlpha : Button? = null
    var btnRotate : Button? = null
    var btnScale : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var move  = AnimationUtils.loadAnimation(applicationContext,R.anim.move)
        var alpha  = AnimationUtils.loadAnimation(applicationContext,R.anim.alpha)
        var rotate  = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate)
        var scale  = AnimationUtils.loadAnimation(applicationContext,R.anim.scale)

        tvAnim=findViewById(R.id.tvAnim)
        btnTranslate=findViewById(R.id.btnTranslate)
        btnAlpha=findViewById(R.id.btnAlpha)
        btnRotate=findViewById(R.id.btnRotate)
        btnScale=findViewById(R.id.btnScale)

        btnTranslate?.setOnClickListener(){
            tvAnim?.startAnimation(move)
        }

        btnAlpha?.setOnClickListener(){
            tvAnim?.startAnimation(alpha)
        }

        btnRotate?.setOnClickListener(){
            tvAnim?.startAnimation(rotate)
        }

        btnScale?.setOnClickListener(){
            tvAnim?.startAnimation(scale)
        }

    }
}