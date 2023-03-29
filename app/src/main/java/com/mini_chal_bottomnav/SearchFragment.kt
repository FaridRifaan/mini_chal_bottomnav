package com.mini_chal_bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mini_chal_bottomnav.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomIdSearch.bottomNavgationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.Home_menu -> {
                    findNavController().navigate(R.id.action_searchFragment_to_homeFragment)
                    true
                }
                R.id.profile_menu -> {
                    findNavController().navigate(R.id.action_searchFragment_to_profileFragment)
                    true
                }
                else -> false
            }
        }
    }


}