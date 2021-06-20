package com.nouser666.superdemo.maindemo.personcard

import com.nouser666.superdemo.common.MainIntegerValue
import com.nouser666.superdemo.main.MainInfo

class PersonCardDemoInfo{
    companion object : MainInfo{
        override fun getId(): String {
            return "000000"
        }

        override fun getTitle(): String {
            return "个人名片"
        }

        override fun getTime(): String {
            return "2021-05-17"
        }

        override fun getType(): Int {
            return MainIntegerValue.TYPE_MODULE_DEMO
        }

        override fun getIntroduction(): String {
            return "super.getIntroduction()!!!"
        }

        override fun getInfoMaps(): Map<String, String> {
            return HashMap()
        }

    }
}