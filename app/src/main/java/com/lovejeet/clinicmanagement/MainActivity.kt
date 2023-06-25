package com.lovejeet.clinicmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.lovejeet.clinicmanagement.R

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    var clientList = arrayListOf<ClientInfo>()
    var appList = arrayListOf<AppInfo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.navController)
    }
}