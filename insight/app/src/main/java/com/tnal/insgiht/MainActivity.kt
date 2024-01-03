package com.tnal.insgiht

import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.tnal.insgiht.base.BaseActivity
import com.tnal.insgiht.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun setLayout() {
        val bottomNavigationView = binding.bottomNavigationMain
        val navController =
            supportFragmentManager.findFragmentById(R.id.container_main)?.findNavController()
        navController?.let {
            bottomNavigationView.setupWithNavController(it)
        }
    }
}