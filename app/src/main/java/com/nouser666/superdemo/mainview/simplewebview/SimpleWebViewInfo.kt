package com.nouser666.superdemo.mainview.simplewebview

import com.nouser666.superdemo.common.MainIntegerValue
import com.nouser666.superdemo.main.MainInfo

class SimpleWebViewInfo {
    companion object: MainInfo{
        override fun getId(): String {
            return "000000003"
        }

        override fun getTitle(): String {
            return "简单web view"
        }

        override fun getTime(): String {
            return "2021-06-21"
        }

        override fun getType(): Int {
            return MainIntegerValue.TYPE_MODULE_VIEW
        }

        override fun getIntroduction(): String {
            return "这是简单的web view"
        }

        override fun getInfoMaps(): Map<String, String> {
            return HashMap()
        }

    }
}