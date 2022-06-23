package uz.musofirlar.musofirlaruz.adapter

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.databinding.IntroScreenBinding
import uz.musofirlar.musofirlaruz.model.SetViewPagerData

class AdapterObjectFragment : Fragment() {
    private var _binding: IntroScreenBinding? = null
    private val binding get() = _binding!!
    private val name = "Safety"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = IntroScreenBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val position = requireArguments().getInt("key")
        val list = SetViewPagerData().getVPData()
        binding.img1.setImageResource(list[position].headImage)
        binding.text2.text = getString(list[position].desc1)
        binding.text3.text = getString(list[position].desc2)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}