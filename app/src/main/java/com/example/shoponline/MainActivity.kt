package com.example.shoponline


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.shoponline.databinding.ActivityMainBinding
import com.example.shoponline.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //   private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        supportFragmentManager.beginTransaction()
//            .setReorderingAllowed(true)
//            .add(R.id.fragment_navigation,HomeFragment())



        // Getting  Nav Host and setting to it a Nav Controller
        // If in XML fragment container view is not set to NavHostFragment this approach is not
        // going to work
        val navFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_navigation) as NavHostFragment
        val navController = navFragment.navController

        //Implementing navigation between fragments on item click
      binding.bottomNav.setupWithNavController(navController)

        val appBarConfig = AppBarConfiguration(setOf(R.id.Home,R.id.Search,R.id.Saved))
        setupActionBarWithNavController(navController,appBarConfig)

//         This approach worked only whit <fragment> but not with fragment container view
//        val navigationController = findNavController(R.id.fragment_navigation)
//
//        binding.bottomNav.setupWithNavController(navigationController)


    }
}