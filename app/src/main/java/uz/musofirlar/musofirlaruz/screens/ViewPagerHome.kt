package uz.musofirlar.musofirlaruz.screens

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.snackbar.Snackbar
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.adapter.AdapterObjectFragment
import uz.musofirlar.musofirlaruz.adapter.ViewPagerAdapter
import uz.musofirlar.musofirlaruz.databinding.ActivityMainBinding
import uz.musofirlar.musofirlaruz.databinding.IntroScreenBinding
import uz.musofirlar.musofirlaruz.databinding.ViewPagerHomeBinding
import uz.musofirlar.musofirlaruz.model.SetViewPagerData

class ViewPagerHome : Fragment() {
    private var _binding: ViewPagerHomeBinding? = null
    private val binding get() = _binding!!
    private val name = "Safety"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ViewPagerHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = adapter
        binding.dotsIndicator.setViewPager2(binding.viewPager)
        val sharedPref = requireActivity().getSharedPreferences(name,Context.MODE_PRIVATE)
        binding.text1.setOnClickListener {
            sharedPref.edit().putInt(name,3).apply()
            findNavController().navigate(R.id.action_viewPagerHome_to_mainScreen)
        }


        binding.nextBtn.setOnClickListener {
            var currentItem = binding.viewPager.currentItem
            if (currentItem<3){
                 binding.viewPager.currentItem++
            }
            else {
                sharedPref.edit().putInt(name,3).apply()
                findNavController().navigate(R.id.action_viewPagerHome_to_mainScreen)
            }
        }

    }
}