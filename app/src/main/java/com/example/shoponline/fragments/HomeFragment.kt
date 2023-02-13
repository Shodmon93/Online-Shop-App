package com.example.shoponline.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoponline.R
import com.example.shoponline.adapters.HomeFragmentAdapter
import com.example.shoponline.databinding.ActivityMainBinding
import com.example.shoponline.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeFragmentAdapter: HomeFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //Init adapter
        homeFragmentAdapter = HomeFragmentAdapter()
        binding.homeFragmentRecyclerView.layoutManager =
            LinearLayoutManager(requireContext(),
                LinearLayoutManager.VERTICAL,
                false)

        //Passing Home recycler adapter to recyclerview adapter
        binding.homeFragmentRecyclerView.adapter = homeFragmentAdapter

        return binding.root
    }


}