package com.example.increment_decrement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView = findViewById<TextView>(R.id.number)
        textView.text = count.toString()

        buttonMinus.setOnClickListener(){
            count--
            textView.text = count.toString()
        }

        buttonPlus.setOnClickListener(){
            count++
            textView.text = count.toString()
        }

    }

}
