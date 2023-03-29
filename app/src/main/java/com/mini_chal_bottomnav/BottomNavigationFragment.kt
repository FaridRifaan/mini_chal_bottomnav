package com.mini_chal_bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mini_chal_bottomnav.databinding.FragmentBottomNavigationBinding


class BottomNavigationFragment : Fragment() {

    lateinit var binding : FragmentBottomNavigationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomNavigationBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomNavgationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.Home_menu ->{
                    findNavController().navigate(R.id.action_bottomNavigationFragment_to_homeFragment)
                    true
                }
                R.id.search_menu ->{
                    findNavController().navigate(R.id.action_bottomNavigationFragment_to_searchFragment)
                    true
                }
                R.id.profile_menu ->{
                    findNavController().navigate(R.id.action_bottomNavigationFragment_to_profileFragment)
                    true
                }
                else -> false
            }
        }
    }



}