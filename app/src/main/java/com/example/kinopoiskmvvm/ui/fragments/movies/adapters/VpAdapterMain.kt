package com.example.kinopoiskmvvm.ui.fragments.movies.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kinopoiskmvvm.ui.fragments.movies.MoviesFragment

class VpAdapterMain (fa: MoviesFragment, private val list: List<Fragment>) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = list.size

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}