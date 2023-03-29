package com.mini_chal_bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mini_chal_bottomnav.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    lateinit var binding :FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomIdProfile.bottomNavgationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.Home_menu -> {
                    findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
                    true
                }
                R.id.search_menu -> {
                    findNavController().navigate(R.id.action_profileFragment_to_searchFragment)
                    true
                }
                else -> false
            }
        }

    }



}