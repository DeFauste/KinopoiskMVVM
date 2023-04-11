package com.example.kinopoiskmvvm.ui.fragments.description

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kinopoiskmvvm.R
import com.example.kinopoiskmvvm.databinding.FragmentBookmarksBinding
import com.example.kinopoiskmvvm.databinding.FragmentDescriptionBinding

class DescriptionFragment : Fragment() {
    private var _binding: FragmentDescriptionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDescriptionBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = DescriptionFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}