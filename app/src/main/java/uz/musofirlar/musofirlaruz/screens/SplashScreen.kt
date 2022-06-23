package uz.musofirlar.musofirlaruz.screens

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.databinding.SplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment() {
    private var _binding: SplashScreenBinding? = null
    private val binding get() = _binding!!
    private val name = "Safety"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SplashScreenBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val sharedPref = requireActivity().getSharedPreferences(name, Context.MODE_PRIVATE)
        val position = sharedPref.getInt(name, -1)
        countTimer(position)
    }

    private fun countTimer(position: Int) {
        val timer = object : CountDownTimer(2000, 1000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                if (position == 3) {
                    findNavController().navigate(R.id.action_splashScreen_to_mainScreen)
                } else {
                    findNavController().navigate(R.id.action_splashScreen_to_viewPagerHome)
                }
            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}