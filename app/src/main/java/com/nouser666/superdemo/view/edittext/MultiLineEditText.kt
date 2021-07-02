package com.nouser666.superdemo.view.edittext

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import com.nouser666.superdemo.R


class MultiLineEditText @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private lateinit var editText: EditText
    private var maxLines = 6
    private var hint = ""
    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.MultiLineEditText, 0, 0)
            .apply {
                try {
                    maxLines = getInt(R.styleable.MultiLineEditText_maxLines, 6)
                    hint = getString(R.styleable.MultiLineEditText_input_hint).toString()
                }
                finally {
                    recycle()
                }
            }

        LayoutInflater.from(context).inflate(R.layout.default_multi_edit, this)
        editText = findViewById(R.id.editText)
        editText.setBackgroundResource(R.drawable.edit_radius_shape)
        editText.minLines = maxLines
        editText.maxLines = maxLines
        editText.hint = hint
    }
}