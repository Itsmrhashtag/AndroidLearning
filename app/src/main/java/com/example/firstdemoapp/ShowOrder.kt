package com.example.firstdemoapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.firstdemoapp.databinding.ActivityShowOrderBinding

class ShowOrder : AppCompatActivity() {
    lateinit var binding:ActivityShowOrderBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_order)

        binding=ActivityShowOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ordersOfCustomer=intent.getStringExtra(MainActivity3.KEY)
        binding.tVOrder.text=ordersOfCustomer.toString()
//        val tv=findViewById<TextView>(R.id.tVOrder)
//        tv.text=ordersOfCustomer.toString()
    }
}