package com.example.practical4_mad_20012531007

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Browser
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {

    lateinit var btn_ref_browser: Button
    lateinit var btn_ref_map : Button
    lateinit var  btn_ref_gallary : Button
    lateinit var btn_ref_camera : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_ref_browser = findViewById(R.id.browse)
        btn_ref_map = findViewById(R.id.MAP)
        btn_ref_gallary = findViewById(R.id.Gallary)
        btn_ref_camera = findViewById(R.id.camera)
        implicit_intent()
    }

    fun implicit_intent(){
        btn_ref_browser.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")).also {
                startActivity(it)
            }
        }
        btn_ref_map.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com")).also {
                startActivity(it)
            }
        }

        btn_ref_camera.setOnClickListener {
            intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
                startActivity(it)
            }
        }

        btn_ref_gallary.setOnClickListener {
            //intent = Intent(Intent.ACTION_GET_CONTENT,intent.setType("image/*")).also {
            //  startActivity(it)
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this)
            }

        }
    }


    fun openloca(view: View) {

    }
}