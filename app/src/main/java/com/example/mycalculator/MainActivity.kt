package com.example.mycalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//Declaring variables
        val firstValue = findViewById<EditText>(R.id.editText1)
        val secondValue = findViewById<EditText>(R.id.editText2)
        val result = findViewById<TextView>(R.id.textViewResult)
        val add = findViewById<Button>(R.id.btnAdd)
        val minus = findViewById<Button>(R.id.btnMinus)
        val multiply = findViewById<Button>(R.id.btnMultiply)
        val divide = findViewById<Button>(R.id.btnDivide)
        val clear = findViewById<Button>(R.id.btnClear)

        //Give operators function
        add!!.setOnClickListener{
            val num1 = firstValue.text.toString().toInt()
            val num2 = secondValue.text.toString().toInt()
            val addition = num1 + num2
            result.text = "$addition"
        }
        minus!!.setOnClickListener {
            val num1 = firstValue.text.toString().toInt()
            val num2 = secondValue.text.toString().toInt()
            val subtraction = num1 - num2
            result.text = "$subtraction"
        }
        multiply!!.setOnClickListener {
            val num1 = firstValue.text.toString().toInt()
            val num2 = secondValue.text.toString().toInt()
            val multiplication = num1 * num2
            result.text = "$multiplication"
        }
        divide!!.setOnClickListener {
            val num1 = firstValue.text.toString().toInt()
            val num2 = secondValue.text.toString().toInt()
            val division = num1 / num2
            result.text = "$division"
        }
        clear!!.setOnClickListener {
            firstValue.text.clear()
            secondValue.text.clear()
            result.text = " "
        }
    }


}