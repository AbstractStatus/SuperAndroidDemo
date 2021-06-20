package com.nouser666.superdemo.base

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nouser666.superdemo.R


open class BaseActivity : AppCompatActivity() {
    open val TAG = "default TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //设置黑色字体的状态栏
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility =
                (View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
        }

        //设置底部导航栏颜色
        window.navigationBarColor = getColor(R.color.status_bar_common)

        //activity日志
        Log.d("cur_activity: ", componentName.className)


    }


}