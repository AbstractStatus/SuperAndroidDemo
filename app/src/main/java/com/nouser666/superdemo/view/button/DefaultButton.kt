package com.nouser666.superdemo.view.button

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity

import com.nouser666.superdemo.R

class DefaultButton @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatTextView(context, attrs, defStyleAttr) {
    init {
        this.setBackgroundResource(R.drawable.ripple_bg_white)
        this.textSize = 18F
        this.setPadding(0, 16, 0, 16)
        this.isClickable = true
        this.gravity = Gravity.CENTER


    }
}