package com.chinkyfamily.pagination_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chinkyfamily.pagination_android.R
import com.chinkyfamily.pagination_android.databinding.ActivityMainBinding

/**
 * MainActivity
 * */
class MainActivity : AppCompatActivity()
{
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding

    /**
     * onCreate callback method of the Activity.
     * */
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}