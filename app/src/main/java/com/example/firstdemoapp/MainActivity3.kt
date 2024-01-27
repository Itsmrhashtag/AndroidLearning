package com.example.firstdemoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    //creating key
    companion object{
        const val KEY="com.example.firstdemoapp.MainActivity3.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnOrder=findViewById<Button>(R.id.button2)
        val eT1=findViewById<TextView>(R.id.eTText)
        val eT2=findViewById<TextView>(R.id.eTText2)
        val eT3=findViewById<TextView>(R.id.eTText3)
        val eT4=findViewById<TextView>(R.id.eTText4)
        btnOrder.setOnClickListener {
            val message=eT1.text.toString()+" "+eT2.text.toString()+" "+eT3.text.toString()+" "+eT4.text.toString()

            intent= Intent(this,ShowOrder::class.java)
            intent.putExtra(KEY,message)
            startActivity(intent)
        }
    }

//    override fun onStart() {
//        super.onStart()
//    }
//
//    override fun onPause() {
//        super.onPause()
//    }
}