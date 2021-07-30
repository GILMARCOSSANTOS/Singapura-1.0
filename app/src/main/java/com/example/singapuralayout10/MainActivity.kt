package com.example.singapuralayout10

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        val botaoEstrela = findViewById<ImageButton>(R.id.estrelaImageViewId)
        botaoEstrela.setOnClickListener {
            if (botaoEstrela.isClickable){
                Toast.makeText(this, "Gilmarcos Santos ", Toast.LENGTH_LONG).show()

            }
        }

        val botaoDiscard = findViewById<Button>(R.id.dicardButtonId)
        botaoDiscard.setOnClickListener {
            if (botaoDiscard.isClickable){
                Toast.makeText(this, "Gilmarcos Santos ", Toast.LENGTH_LONG).show()

            }
        }

        val botaoUpload = findViewById<Button>(R.id.uoploadButtonId)
        botaoUpload.setOnClickListener {
            if (botaoUpload.isClickable){
                Toast.makeText(this, "Gilmarcos Santos ", Toast.LENGTH_LONG).show()

            }
        }


    }
}