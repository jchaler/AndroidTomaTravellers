package jchaler.tomatravellers

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.util.Pair


class MainActivity : AppCompatActivity() {

    private val EXTRA_MESSAGE = "jonatanchaler.ioc.cat.comunicador.MESSAGE"
    private val LOGO_TO_TRANSITION_ID = "logoTextTransition"
    private var logo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logo = findViewById(R.id.logoTomaTravellers)

        //hide top info bar of device.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        logo?.setAnimation(animation)

        Handler().postDelayed({
            goToLogin()
        }, 2000)
    }

    private fun goToLogin() {
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        // Assign the transition to the TextEdit that has the property as logoTextTransition;
        val pair1 = Pair.create<View, String>(logo, LOGO_TO_TRANSITION_ID)
        val options = ActivityOptions.makeSceneTransitionAnimation(
            this@MainActivity,
            pair1)
        startActivity(intent, options.toBundle())
    }
}