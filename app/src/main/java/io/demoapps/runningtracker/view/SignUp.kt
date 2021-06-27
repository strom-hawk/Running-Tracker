package io.demoapps.runningtracker.view

import android.os.Bundle
import androidx.activity.compose.setContent
import io.demoapps.runningtracker.ui.layout.SignUpParentLayout

class SignUp : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUpParentLayout()
        }
    }
}