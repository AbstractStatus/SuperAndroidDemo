package com.nouser666.superdemo.mainutil.qrencryptionsys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nouser666.superdemo.R
import com.nouser666.superdemo.base.BaseActivity
import com.nouser666.superdemo.view.button.DefaultButton

class EncryptionResultActivity : BaseActivity() {
    private lateinit var btnSaveResult: DefaultButton
    private lateinit var resultCard: QRPasswordCard
    private var resultText = ""
    private val KEY_INTENT_RESULT_TEXT = "resultText"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encryption_result)

        btnSaveResult = findViewById(R.id.btn_save_result)
        resultCard = findViewById(R.id.encryption_result_card)

        resultText = intent.getStringExtra(KEY_INTENT_RESULT_TEXT).toString()

        resultCard.setQRCode(resultText)
        resultCard.setTintImage(R.drawable.qr_lock_article)
        resultCard.setTitle("超简示例")
        resultCard.setCodeId(resultText.substring(0, 5))

        btnSaveResult.buttonClick(object : DefaultButton.Callback{
            override fun callback() {

            }

        })

    }

    public fun start(activity: BaseActivity, text: String){
        val intent = Intent(activity, EncryptionResultActivity::class.java)
        intent.putExtra(KEY_INTENT_RESULT_TEXT, text)
        activity.startActivity(intent)

    }


}