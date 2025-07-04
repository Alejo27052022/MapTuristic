package com.example.mapturistic.pantallasInfo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mapturistic.R

class PantallaInfo2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantallainfo2)

        val layout_pantallaInfo2 : ConstraintLayout = findViewById(R.id.layout_pantallainfo2)

        layout_pantallaInfo2.setOnClickListener {
            val intent = Intent(this, PantallaInfo3::class.java)
            startActivity(intent)
        }
    }
}