package uz.musofirlar.musofirlaruz.screens

import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.text.method.TransformationMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.databinding.LoginScreenBinding

class LoginScreen : Fragment() {
    private var _binding: LoginScreenBinding? = null
    private val binding get() = _binding!!
    private var counter = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LoginScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.passwordEye.setOnClickListener {
            val str = binding.loginEdittext2.text.toString()
            if  (counter % 2 == 0) {
                binding.loginEdittext2.transformationMethod =
                 PasswordTransformationMethod.getInstance()
                binding.passwordEye.setImageResource(R.drawable.ic_close_eye)
            }
            else{
               binding.loginEdittext2.transformationMethod = HideReturnsTransformationMethod.getInstance()
                binding.passwordEye.setImageResource(R.drawable.ic_open_eye)
            }
            binding.loginEdittext2.setSelection(str.length)
            counter++
        }

        binding.registerText.setOnClickListener {
            findNavController().navigate(R.id.action_loginScreen_to_registerScreen)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}