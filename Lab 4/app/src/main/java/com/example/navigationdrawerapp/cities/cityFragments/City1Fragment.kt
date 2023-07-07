package com.example.navigationdrawerapp.cities.cityFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawerapp.R

/*
Purpose:
    Represents the fragment for City 1, displaying its specific content and layout.

Functions:
    onCreateView: View? - Called to create and return the fragment's view hierarchy.
        Inflates the layout for this fragment and returns the root view.

Params:
    inflater: LayoutInflater - The LayoutInflater object that can be used to inflate any views in the fragment.
    container: ViewGroup? - The parent view that the fragment's UI should be attached to, or null if there is no parent.
    savedInstanceState: Bundle? - The previously saved state of the fragment, or null if it is the first creation.

Return:
    View? - The root View of the fragment's layout or null if the fragment does not have a UI.
*/
class City1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city1, container, false)
    }
}
