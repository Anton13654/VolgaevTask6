package com.aeincprojects.volgaevtask6

import android.graphics.drawable.DrawableContainer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {

    private lateinit var container: FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container = findViewById(R.id.fragmentContainerView)
        container.getFragment<MainFragment>()

/*
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val mainFragment = MainFragment()
        fragmentTransaction.replace(R.id.fragmentContainerView, mainFragment)
        fragmentTransaction.commit()

 */
    }
}