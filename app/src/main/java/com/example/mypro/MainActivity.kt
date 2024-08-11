package com.example.mypro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.mypro.DataBase.Data
import com.example.mypro.DataBase.DealerAdapter
import com.example.mypro.DataBase.DealerDetails
import com.example.mypro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    var list= arrayListOf<DealerDetails>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        navController=findNavController(R.id.nav_Controller)
        navController.addOnDestinationChangedListener{navController,desttination,argument->

        }
        binding?.main?.setonItemSelectrdListner{
            when(it.itemId){
                R.id.BottomNavDealer->
                    navController.navigate(R.id.dealerNav)
                R.id.BottomNavClients->
                    navController.navigate(R.id.clientNav)
            }
            return@setonItemSelectrdListner true
        }

    }
}