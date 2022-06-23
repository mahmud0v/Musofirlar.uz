package uz.musofirlar.musofirlaruz.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.adapter.CustomViewHolder
import uz.musofirlar.musofirlaruz.adapter.RecyclerViewAdapter

class HomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val rv = view.findViewById<RecyclerView>(R.id.rv_id)
//        val adapter = RecyclerViewAdapter()
//        rv.adapter = adapter
//        rv.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }
}