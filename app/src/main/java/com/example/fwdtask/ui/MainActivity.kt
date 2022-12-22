package com.example.fwdtask.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fwdtask.R
import com.example.fwdtask.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel by lazy {
        ViewModelProvider(this)[ShoeViewModel::class.java]
    }
    private val navHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as
                NavHostFragment
    }
    private val navController by lazy {
        navHostFragment.navController
    }

    private val appBarConfiguration by lazy {
        AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.loginFragment
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        setSupportActionBar(binding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        setupActionBarWithNavController(navController)
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)

        viewModel.setShoes()
        Timber.plant(Timber.DebugTree())
    }
}