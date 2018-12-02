package com.waytojava.recyclerviewkotlinmvvm.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.waytojava.recyclerviewkotlinmvvm.R
import com.waytojava.recyclerviewkotlinmvvm.databinding.ActivityMainBinding
import com.waytojava.recyclerviewkotlinmvvm.model.Employee

/**
 * Created by Manish Kumar on 12/2/2018
 */

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val emp = Employee(1, "Manish Kumar", "javatech147@gmail.com")
        binding.employee = emp
    }
}