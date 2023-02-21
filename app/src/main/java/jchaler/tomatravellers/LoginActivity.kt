package jchaler.tomatravellers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        val btnAlta: TextView = findViewById(R.id.textAlta);
        btnAlta.setOnClickListener { view: View? ->
            startActivity(
                Intent(
                    this@LoginActivity,
                    SignUpActivity::class.java
                )
            )
        }
        println("test")
    }
}