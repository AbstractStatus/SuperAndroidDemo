package com.nouser666.superdemo.main

import android.app.Activity

//模块列表的数据实体
class MainEntity(val info: MainInfo, val activity: Class<out Activity>,
                 var visible: Boolean = true) {

}