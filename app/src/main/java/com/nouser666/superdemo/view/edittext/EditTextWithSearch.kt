package com.nouser666.superdemo.view.edittext

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.nouser666.superdemo.R

class EditTextWithSearch @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatEditText(context, attrs, defStyleAttr) {
    private val iconDrawable = ContextCompat.getDrawable(context, R.drawable.icon_bottom_main_demo)
    override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
        toggleSearchIcon()
    }


    private fun toggleSearchIcon(){
        val icon = if(text?.isNotEmpty()!!) iconDrawable else null

    }
}