package com.nouser666.superdemo.mainview.surfaceview

import com.nouser666.superdemo.common.MainIntegerValue
import com.nouser666.superdemo.main.MainInfo

class SurfaceViewInfo {

    companion object : MainInfo{
        override fun getId(): String {
            return ""
        }

        override fun getTitle(): String {
            return "SurfaceView"
        }

        override fun getTime(): String {
            return ""
        }

        override fun getType(): Int {
            return MainIntegerValue.TYPE_MODULE_VIEW
        }

        override fun getIntroduction(): String {
            return ""
        }

        override fun getInfoMaps(): Map<String, String> {
            return HashMap()
        }

    }
}