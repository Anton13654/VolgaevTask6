package com.aeincprojects.volgaevtask6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.aeincprojects.volgaevtask6.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentManager = childFragmentManager

        binding.firstLetterButton.setOnClickListener {
            val fragment = FirstLetterFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.letters_container, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.steckButton.setOnClickListener {
            fragmentManager.popBackStackImmediate()
        }
        binding.secondLetterButton.setOnClickListener {
            val fragment = SecondLetterFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.letters_container, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.thirdLetterButton.setOnClickListener {
            val fragment = ThirdLetterFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.letters_container, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.firstNumberButton.setOnClickListener {
            val fragment = FirstNumberFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.numbers_container, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.secondNumberButton.setOnClickListener {
            val fragment = SecondNumberFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.numbers_container, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.thirdNumberButton.setOnClickListener {
            val fragment = ThirdNumberFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.numbers_container, fragment)
                .addToBackStack(null)
                .commit()
        }
    }

}