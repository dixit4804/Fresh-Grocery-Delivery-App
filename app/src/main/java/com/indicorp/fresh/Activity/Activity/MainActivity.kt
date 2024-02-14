package com.indicorp.fresh.Activity.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.indicorp.fresh.Activity.Fragments.FragmentAccount
import com.indicorp.fresh.Activity.Fragments.FragmentCart
import com.indicorp.fresh.Activity.Fragments.FragmentCategory
import com.indicorp.fresh.Activity.Fragments.FragmentDelivery
import com.indicorp.fresh.Activity.Fragments.FragmentHome
import com.indicorp.fresh.R

class MainActivity : AppCompatActivity() {

    private val homeFragment = FragmentHome()
    private val cartFragment = FragmentCart()
    private val accountFragment = FragmentAccount()
    private val categoryFragment = FragmentCategory()
    private val deliveryFragment = FragmentDelivery()

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Navhome -> {
                    switchFragment(homeFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.NavCategories -> {
                    switchFragment(categoryFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.Navdelivery -> {
                    switchFragment(deliveryFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.Navcart -> {
                    switchFragment(cartFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.NavAccount -> {
                    switchFragment(accountFragment)
                    return@OnNavigationItemSelectedListener true
                }
                // Add cases for additional menu items if needed
                else -> false
            }
        }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        // Set the default fragment
        switchFragment(homeFragment)
    }
}

