package com.example.navigationdrawerapp.provinceInfo.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.navigationdrawerapp.provinceInfo.ProvinceInfoActivity
import com.example.navigationdrawerapp.provinceInfo.provinceFragments.ProvinceFragmentOne
import com.example.navigationdrawerapp.provinceInfo.provinceFragments.ProvinceFragmentThree
import com.example.navigationdrawerapp.provinceInfo.provinceFragments.ProvinceFragmentTwo

class ProvinceAdapter(provinceInfoActivity: ProvinceInfoActivity): FragmentStateAdapter(provinceInfoActivity) {

    // number of fragments
    private val FRAGMENTSIZES = 3

    /*
    Purpose:
        Adapter class used to populate a ViewPager2 with province fragments for ProvinceInfoActivity.

    Params:
        provinceInfoActivity: ProvinceInfoActivity - The ProvinceInfoActivity that contains the ViewPager2.

    Functions:
        getItemCount: Int - Returns the number of fragments in the adapter.
        createFragment: Fragment - Creates and returns the fragment at the specified position.

    Return:
        FragmentStateAdapter - An adapter that provides province fragments to a ViewPager2.
    */

    override fun getItemCount(): Int {
        return this.FRAGMENTSIZES
    }

    override fun createFragment(position: Int): Fragment {

        // ordering the fragments how to appear on display
        when(position){
            0 -> {
                return ProvinceFragmentOne()
            }
            1 -> {
                return ProvinceFragmentTwo()
            }
            2 -> {
                return ProvinceFragmentThree()
            }
        }
        // FragmentOne is home fragment when app starts
        return ProvinceFragmentOne()
    }
}