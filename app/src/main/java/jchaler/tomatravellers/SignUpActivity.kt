package jchaler.tomatravellers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        val tornarLogin: TextView = findViewById(R.id.textTornarLogin);
        tornarLogin.setOnClickListener { view: View? ->
            startActivity(
                Intent(
                    this,
                    LoginActivity::class.java
                )
            )
        }


    }
}
