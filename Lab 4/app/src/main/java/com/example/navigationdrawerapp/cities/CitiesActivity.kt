package com.example.navigationdrawerapp.cities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationdrawerapp.R
import com.example.navigationdrawerapp.cities.adapter.CityAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class CitiesActivity : AppCompatActivity() {

    private val tabsArray = arrayOf("Halifax", "Peggys Cove", "Sydney")

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CitiesActivity::class.java)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cities)

        val viewPager = findViewById<ViewPager2>(R.id.viewpager)
        val tabLayout = findViewById<TabLayout>(R.id.tablayout)

        val my_adapter = CityAdapter(
            supportFragmentManager,
            lifecycle
        )
        viewPager.adapter = my_adapter

        // Connecting the viewpager with tab layout
        TabLayoutMediator(tabLayout, viewPager) {
                tab, position -> tab.text = tabsArray[position]
        }.attach()
    }
}