package uz.musofirlar.musofirlaruz.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.adapter.NearRoomAdapter
import uz.musofirlar.musofirlaruz.adapter.RentRoomAdapter
import uz.musofirlar.musofirlaruz.databinding.HomeScreenBinding
import uz.musofirlar.musofirlaruz.model.InitData

class HomeScreen : Fragment(R.layout.home_screen) {

    private val binding: HomeScreenBinding by viewBinding()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data = InitData.getList()
        val adapter = RentRoomAdapter()
        adapter.differ.submitList(data)
        binding.rv1Id.adapter = adapter
        binding.rv1Id.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

       val adapter2 = NearRoomAdapter()
        adapter2.differ.submitList(data)
        binding.rv2Id.adapter = adapter2
        binding.rv2Id.layoutManager = LinearLayoutManager(requireContext())
    }

}