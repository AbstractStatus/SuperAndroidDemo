package com.nouser666.superdemo.main

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.nouser666.superdemo.R
import com.nouser666.superdemo.base.BaseActivity
import com.nouser666.superdemo.common.MainIntentKey
import com.nouser666.superdemo.databinding.ActivityMainOnlyTextBinding
import com.nouser666.superdemo.view.titlebar.TitleBarOnlyBackup

class MainOnlyTextActivity : BaseActivity() {
    private lateinit var title: String
    private lateinit var introduction: String
    private lateinit var textView: TextView
//    private lateinit var titleBar: TitleBarOnlyBackup



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_only_text)


        title = intent.getStringExtra(MainIntentKey.INTENT_KEY_MODULE_TITLE).toString()
        introduction = intent.getStringExtra(MainIntentKey.INTENT_KEY_MODULE_INTRODUCTION).toString()

        textView = findViewById(R.id.main_only_text)

        textView.text = introduction
    }


    companion object{
        fun startActivity(activity: Activity, title: String, introduction: String): Boolean{
            val intent = Intent(activity, MainOnlyTextActivity::class.java)
            intent.putExtra(MainIntentKey.INTENT_KEY_MODULE_TITLE, title)
            intent.putExtra(MainIntentKey.INTENT_KEY_MODULE_INTRODUCTION, introduction)
            activity.startActivity(intent)
            return true
        }
    }
}