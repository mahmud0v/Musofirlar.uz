package uz.musofirlar.musofirlaruz.dialogs

import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import uz.musofirlar.musofirlaruz.R
import java.lang.ClassCastException


class VerifyDialog : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.verify_register_dialog, container, false)
        dialog?.window?.setBackgroundDrawableResource(R.drawable.verify_dialog_bg)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      val btn = view.findViewById<LinearLayout>(R.id.continue_btn)
        btn.setOnClickListener {
           findNavController().navigate(R.id.action_registerScreen_to_homeScreen2)
            dismiss()
        }
    }




}