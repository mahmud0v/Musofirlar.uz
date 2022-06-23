package uz.musofirlar.musofirlaruz.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.databinding.RegistrScreenBinding
import uz.musofirlar.musofirlaruz.dialogs.VerifyDialog

class RegisterScreen : Fragment() {
    private var _binding: RegistrScreenBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RegistrScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.registerText.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.regBtn.setOnClickListener {
          val dialog = VerifyDialog()
            dialog.isCancelable = false
            dialog.show(requireActivity().supportFragmentManager,"dialog")
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}