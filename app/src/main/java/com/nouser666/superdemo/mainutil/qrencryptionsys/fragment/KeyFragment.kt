package com.nouser666.superdemo.mainutil.qrencryptionsys.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.nouser666.superdemo.R
import com.nouser666.superdemo.mainutil.qrencryptionsys.PasswordSys
import com.nouser666.superdemo.mainutil.qrencryptionsys.QRPasswordCard
import com.nouser666.superdemo.view.button.DefaultButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [KeyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class KeyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var qrPasswordCard: QRPasswordCard
    private lateinit var btnGetKey: DefaultButton
    private lateinit var btnSaveKey: DefaultButton
    private var key = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_key, container, false)
        qrPasswordCard = view.findViewById(R.id.qr_password_card)
        btnGetKey = view.findViewById(R.id.btn_get_key)
        btnSaveKey = view.findViewById(R.id.btn_save_key)

        btnGetKey.buttonClick(object : DefaultButton.Callback{
            override fun callback() {
                key = PasswordSys.generate()
                qrPasswordCard.setQRCode(key)
                qrPasswordCard.setTintImage(R.drawable.qr_lock_key)
                qrPasswordCard.setTitle("超简示例")
                qrPasswordCard.setCodeId(key.substring(0, 5))
            }

        })

        btnSaveKey.buttonClick(object : DefaultButton.Callback{
            override fun callback() {

            }

        })

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment KeyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            KeyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}