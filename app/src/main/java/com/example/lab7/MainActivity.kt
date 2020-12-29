package com.example.lab7

import android.content.Intent
import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var addStudent : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addStudent = findViewById(R.id.addStudent)

        addStudent.setOnClickListener{
            var req = 1;
            startActivityForResult(Intent(this, formActivity::class.java),req)
        }
       


    }

    private fun checkGender(){

    }

    override fun onClick(v: View?) {

    }
}
