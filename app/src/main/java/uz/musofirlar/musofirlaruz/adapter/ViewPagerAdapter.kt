package uz.musofirlar.musofirlaruz.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment)  {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        val fragment = AdapterObjectFragment()
        val bundle = Bundle().apply {
            putInt("key",position)
        }
        fragment.arguments = bundle
        return fragment
    }




}