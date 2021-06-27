package io.demoapps.runningtracker.router

import android.content.Context
import android.content.Intent
import io.demoapps.runningtracker.view.SignUp

object SignUpRouter {

    fun startSignUpFlow(context: Context){
        val intent = Intent(context, SignUp::class.java)
        context.startActivity(intent)
    }
}