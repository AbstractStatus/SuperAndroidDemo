package com.nouser666.superdemo.view.titlebar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.nouser666.superdemo.R

open class TitleBarWithSearchAndAdd @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    val searchView: SearchView
    private var imageView: ImageView
    init {
        LayoutInflater.from(context).inflate(R.layout.bar_title_search_and_add, this)
        searchView = findViewById(R.id.searchView)
        imageView = findViewById(R.id.imageView2)
    }
}


