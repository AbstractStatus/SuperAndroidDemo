package com.nouser666.superdemo.mainutil.qrencryptionsys

import com.nouser666.superdemo.common.MainIntegerValue
import com.nouser666.superdemo.main.MainInfo

class QREncryptionSysInfo {
    companion object: MainInfo{
        override fun getId(): String {
            return "0000001"
        }

        override fun getTitle(): String {
            return "QR密码系统"
        }

        override fun getTime(): String {
            return "2021-06-11"
        }

        override fun getType(): Int {
            return MainIntegerValue.TYPE_MODULE_UTIL
        }

        override fun getIntroduction(): String {
            return "这是QR密码系统"
        }

        override fun getInfoMaps(): Map<String, String> {
            return HashMap()
        }

    }
}