package com.example.firstdemoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstdemoapp.ui.theme.FirstDemoAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonIntent=findViewById<Button>(R.id.button)
        buttonIntent.setOnClickListener {

            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }

        val buttoOrder=findViewById<Button>(R.id.buttonOrder)
        buttoOrder.setOnClickListener {
            intent=Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }

        val buttonWeb=findViewById<Button>(R.id.buttonWeb)
        val buttonCamera=findViewById<Button>(R.id.buttonCamera)

        buttonCamera.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        buttonWeb.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://github.com/Itsmrhashtag")
            startActivity(intent)
        }
//        val buttonDark=findViewById<Button>(R.id.buttonDownload)
//        val layout =findViewById<LinearLayout>(R.id.lLayout)
//
//        buttonLight.setOnClickListener {
//            layout.setBackgroundResource(R.color.teal_200)
//        }
//        buttonDark.setOnClickListener {
//            layout.setBackgroundResource(R.color.black)
//        }
    }
}

