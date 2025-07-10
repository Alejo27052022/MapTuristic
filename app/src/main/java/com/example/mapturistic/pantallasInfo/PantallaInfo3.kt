package com.example.mapturistic.pantallasInfo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mapturistic.R
import com.example.mapturistic.pantallaAuthentication.Login

class PantallaInfo3 : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantallainfo3)

        val layout_pantallaInfo3 : ConstraintLayout = findViewById(R.id.layout_pantallainfo3)

        layout_pantallaInfo3.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}