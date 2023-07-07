package com.example.navigationdrawerapp.cities.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.navigationdrawerapp.cities.cityFragments.City1Fragment
import com.example.navigationdrawerapp.cities.cityFragments.City2Fragment
import com.example.navigationdrawerapp.cities.cityFragments.City3Fragment

/*
Purpose:
    Adapter class used to populate a ViewPager2 with city fragments.
Params:
    fragmentManager: FragmentManager - The fragment manager to handle fragment transactions.
    lifecycle: Lifecycle - The lifecycle of the adapter's owner (e.g., an activity or fragment).
Functions:
    getItemCount: Int - Returns the number of city fragments to be displayed.
    createFragment: Fragment - Creates and returns a new instance of the specified city fragment based on its position.
Return:
    FragmentStateAdapter - An adapter that provides city fragments to a ViewPager2.
*/
class CityAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return City1Fragment()
            1 -> return City2Fragment()
        }
        return City3Fragment()
    }
}
