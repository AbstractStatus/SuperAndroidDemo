package com.nouser666.superdemo.mainutil

import com.nouser666.superdemo.main.MainEntity
import com.nouser666.superdemo.mainutil.qrencryptionsys.QREncryptionSysActivity
import com.nouser666.superdemo.mainutil.qrencryptionsys.QREncryptionSysInfo

class MainUtilInfo {
    companion object{
        private val list: ArrayList<MainEntity> = ArrayList()

        init {
            list.add(
                    //QR密码系统
                MainEntity(QREncryptionSysInfo,
                        QREncryptionSysActivity::class.java)
            )
        }

        fun getMainEntities(): List<MainEntity>{


            return list
        }
    }
}