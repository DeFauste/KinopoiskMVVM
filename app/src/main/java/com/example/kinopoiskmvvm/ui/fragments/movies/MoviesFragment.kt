package com.example.kinopoiskmvvm.ui.fragments.movies

import android.content.res.TypedArray
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kinopoiskmvvm.R
import com.example.kinopoiskmvvm.databinding.FragmentMoviesBinding
import com.example.kinopoiskmvvm.ui.fragments.movies.adapters.VpAdapterMain
import com.example.kinopoiskmvvm.ui.fragments.movies.innerFragments.NewMoviesFragment
import com.example.kinopoiskmvvm.ui.fragments.movies.innerFragments.SeriesMoviesFragment
import com.example.kinopoiskmvvm.ui.fragments.movies.innerFragments.TopMoviesFragment
import com.google.android.material.tabs.TabLayoutMediator


class MoviesFragment : Fragment() {

    private var _binding: FragmentMoviesBinding? = null
    private val binding get() = _binding!!

    lateinit var resArrayTab: TypedArray
    private val fragList = listOf(
        NewMoviesFragment.newInstance(),
        TopMoviesFragment.newInstance(),
        SeriesMoviesFragment.newInstance()
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resArrayTab = resources.obtainTypedArray(R.array.tab_layout)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoviesBinding.inflate(inflater, container, false)
        initTabLayout()
        return binding.root
    }

    private fun initTabLayout() {
        val adapter = VpAdapterMain(this, fragList)
        binding.viewPagMain.adapter = adapter
        TabLayoutMediator(binding.tabLayoutMain, binding.viewPagMain) { tab, pos ->
            tab.text = resArrayTab.getString(pos)
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = MoviesFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}