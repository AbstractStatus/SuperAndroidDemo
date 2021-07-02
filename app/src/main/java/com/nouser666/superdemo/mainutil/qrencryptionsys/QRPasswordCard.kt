package com.nouser666.superdemo.mainutil.qrencryptionsys

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.drawToBitmap
import com.king.zxing.util.CodeUtils
import com.nouser666.superdemo.R

class QRPasswordCard @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private lateinit var titleTextView: TextView
    private lateinit var codeImageView: ImageView
    private lateinit var tintImageView: ImageView
    private lateinit var idTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.card_qr_password, this)
        titleTextView = findViewById(R.id.card_qr_password_title)
        codeImageView = findViewById(R.id.card_qr_password_code)
        tintImageView = findViewById(R.id.card_qr_password_tint)
        idTextView = findViewById(R.id.card_qr_password_id)
    }

    fun setQRCode(code: String){
        codeImageView.setImageBitmap(CodeUtils.createQRCode(code, 600, R.drawable.qr_lock_key))
    }

    fun setTitle(title: String){
        titleTextView.text = title
    }

    fun setTintImage(resource: Int){
        tintImageView.setImageResource(resource)
    }

    fun setCodeId(id: String){
        idTextView.text = id
    }

    fun saveCard(){
        val bitmap = this.drawToBitmap()

    }
}