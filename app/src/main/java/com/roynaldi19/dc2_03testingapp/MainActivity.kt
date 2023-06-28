package com.roynaldi19.dc2_03testingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.roynaldi19.dc2_03testingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.btnSetValue.setOnClickListener(this)

        names.add("Roy")
        names.add("Naldi")
        names.add("Kidd")
    }

    override fun onClick(view: View) {
        if (view.id == binding.btnSetValue.id) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            binding.tvText.text = name.toString()
        }
    }
}