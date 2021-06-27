package io.demoapps.runningtracker.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.compose.setContent
import io.demoapps.runningtracker.router.SignUpRouter
import io.demoapps.runningtracker.ui.layout.SplashScreenParentLayout

class SplashScreen : BaseActivity() {
    val delayToStartActivity = 2000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenParentLayout()
        }

        checkSignUpData()
    }

    private fun checkSignUpData(){
        Handler(Looper.getMainLooper()).postDelayed({
            SignUpRouter.startSignUpFlow(this)
        }, delayToStartActivity)
    }
}