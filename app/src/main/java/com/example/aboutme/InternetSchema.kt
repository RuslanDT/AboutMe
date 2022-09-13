package com.example.aboutme

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InternetSchema : AppCompatActivity() {
    lateinit var btnI1 : Button
    lateinit var btnI2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_schema)

        btnI1 = findViewById(R.id.btnInternet1)
        btnI2 = findViewById(R.id.btnInternet2)

        //URI: son cadenas que indican la ubicacion de un recurso
        btnI1.setOnClickListener{
            val action_dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 445 125 95 18"))

            startActivity(action_dial)
        }

        btnI2.setOnClickListener{
            val action_view = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://youtube.com")
            )
        }
    }
}