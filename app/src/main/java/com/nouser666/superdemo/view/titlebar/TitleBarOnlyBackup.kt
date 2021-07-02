package com.nouser666.superdemo.view.titlebar

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.nouser666.superdemo.R

class TitleBarOnlyBackup @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    private lateinit var titleName: String
    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.TitleBarOnlyBackup, 0, 0)
            .apply {
                try {
                    titleName = getString(R.styleable.TitleBarOnlyBackup_title_name).toString()
                }finally {
                    recycle()
                }
            }

        LayoutInflater.from(context).inflate(R.layout.bar_title_only_backup, this)
        textView = findViewById(R.id.textView)
        textView.text = titleName

        imageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            context as Activity
            context.finish()
        }
    }

}