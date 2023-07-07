package com.example.navigationdrawerapp.provinceInfo

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationdrawerapp.R
import com.example.navigationdrawerapp.provinceInfo.adapter.ProvinceAdapter

class ProvinceInfoActivity : AppCompatActivity() {

    private lateinit var myAdapter: ProvinceAdapter
    private lateinit var viewPager: ViewPager2

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ProvinceInfoActivity::class.java)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_province_info)

        viewPager = findViewById(R.id.viewPager)

        myAdapter = ProvinceAdapter(this)

        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // binding view pager with adapter
        viewPager.adapter = myAdapter
    }
}