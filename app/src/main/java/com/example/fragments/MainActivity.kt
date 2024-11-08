package com.example.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClock = findViewById<Button>(R.id.btnTime)
        val btnExam = findViewById<Button>(R.id.btnExam)
        val btnValidate = findViewById<Button>(R.id.btnValidate)

        btnClock.setOnClickListener {
            replaceFrameWithFragment(ClockFragment())
        }

        btnExam.setOnClickListener{
            replaceFrameWithFragment(Exam_Fragment())
        }

        btnValidate.setOnClickListener {
            replaceFrameWithFragment(LoginFragment())
        }

    }

    @SuppressLint("CommitTransaction")
    private fun replaceFrameWithFragment(frag: Fragment) {

        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.frameLayout,frag)
        fragTransaction.commit()
    }
}