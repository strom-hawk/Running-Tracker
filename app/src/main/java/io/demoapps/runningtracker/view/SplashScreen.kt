package io.demoapps.runningtracker.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.demoapps.runningtracker.ui.layout.SplashScreenParentLayout

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenParentLayout()
        }
    }
}