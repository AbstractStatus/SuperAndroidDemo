package com.nouser666.superdemo.view.button

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

import com.nouser666.superdemo.R

class DefaultButton @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr){
    private lateinit var textView: TextView
    private lateinit var container: ConstraintLayout
    private lateinit var buttonName: String
    private lateinit var callback: Callback
    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.DefaultButton, 0, 0)
                .apply {
                    try {
                        buttonName = getString(R.styleable.DefaultButton_button_name).toString()
                    }finally {
                        recycle()
                    }
                }

        LayoutInflater.from(context).inflate(R.layout.default_button, this)
        textView = findViewById(R.id.button_default_title)
        container = findViewById(R.id.button_default_container)
        textView.text = buttonName
        container.isClickable = true
        container.setOnClickListener {
            callback.callback()
        }
    }

    fun buttonClick(callback: Callback){
        this.callback = callback
    }

    interface Callback{
        fun callback()
    }
}