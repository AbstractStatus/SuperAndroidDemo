package com.nouser666.superdemo.mainview.rotatevecview

import com.nouser666.superdemo.common.MainIntegerValue
import com.nouser666.superdemo.main.MainInfo

class RotateVecViewInfo {
    companion object: MainInfo{
        override fun getId(): String {
            return "0000002"
        }

        override fun getTitle(): String {
            return "旋转矢量View"
        }

        override fun getTime(): String {
            return "2021-06-11"
        }

        override fun getType(): Int {
            return MainIntegerValue.TYPE_MODULE_VIEW
        }

        override fun getIntroduction(): String {
            return "这是旋转矢量View"
        }

        override fun getInfoMaps(): Map<String, String> {
            return HashMap()
        }


    }
}