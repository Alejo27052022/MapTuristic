package com.example.mapturistic

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import com.example.mapturistic.pantallasInfo.PantallaInfo1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_carga)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, PantallaInfo1::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }
}
