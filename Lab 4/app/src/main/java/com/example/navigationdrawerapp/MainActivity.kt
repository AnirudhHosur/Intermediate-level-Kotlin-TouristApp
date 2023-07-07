package com.example.navigationdrawerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.navigationdrawerapp.cities.CitiesActivity
import com.example.navigationdrawerapp.provinceInfo.ProvinceInfoActivity
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    // representing three dashes
    // allows the user to click on them to display the navigation
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout : DrawerLayout

    /*
    Purpose:
        Represents the main activity of the application where the navigation drawer is displayed.
        Provides functionality to navigate to different activities based on the selected menu item.
    Functions:
        onCreate: void - Called when the activity is created.
            Sets the layout of the activity, initializes the toolbar, drawer layout, and toggle,
            and handles the navigation drawer functionality.
        onOptionsItemSelected: Boolean - Called when a menu item is selected.
            Handles the selection of items in the navigation drawer.
    Params:
        savedInstanceState: Bundle? - The previously saved state of the activity, or null if it is the first creation.
    Return:
        None (onCreate) or Boolean (onOptionsItemSelected)
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open,
            R.string.close
        )

        // if the user clicks back it will close
        // if the user click on the toggle it will open
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Home fragment will be enabled and displayed first
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // functionality for the nav drawer items
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.provinceInfo -> {
                    startActivity(ProvinceInfoActivity.newIntent(this@MainActivity))
                }
                R.id.cities -> {
                    startActivity(CitiesActivity.newIntent(this@MainActivity))
                }
            }
            true
        }
    }

    // to display our menu that we've created
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}