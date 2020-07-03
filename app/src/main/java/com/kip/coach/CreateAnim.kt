package com.kip.coach

import android.content.Context
import android.view.animation.Animation
import android.view.animation.AnimationUtils

object CreateAnim {
    fun createAnimation(applicationContext: Context, animFile: Int): Animation {
        return AnimationUtils.loadAnimation(
            applicationContext,
            animFile
        )
    }
}