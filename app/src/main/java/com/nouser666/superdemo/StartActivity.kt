package com.nouser666.superdemo

import android.content.Intent
import android.os.Bundle
import com.nouser666.superdemo.main.MainActivity
import com.nouser666.superdemo.base.BaseActivity
import com.nouser666.superdemo.util.WindowUtil


class StartActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowUtil.setImmerseStatusFullScreen(window)

        setContentView(R.layout.activity_start)

        startup()
    }

    private fun startup(){
        Thread{
            Thread.sleep(1000)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }.start()
    }


}