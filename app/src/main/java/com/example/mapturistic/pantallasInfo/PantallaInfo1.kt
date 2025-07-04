package com.example.mapturistic.pantallasInfo

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import com.example.mapturistic.R

class PantallaInfo1 : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantallainfo1)

        val btn_getStarted : LinearLayout = findViewById(R.id.btn_getstarted)

        btn_getStarted.setOnClickListener {
            val intent = Intent(this, PantallaInfo2::class.java)
            startActivity(intent)
        }
    }
}