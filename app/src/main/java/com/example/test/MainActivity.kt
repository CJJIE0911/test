package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO :Continue here
        //Java int x; vs Kotlin var x : Int
        //val = value and var = variable
        //findViewByID = link UI to code
        val buttonDonClickMe : Button = findViewById(R.id.buttonDonClickMe);
        buttonDonClickMe.setOnClickListener { showMessage() }
        val buttonClickMe : Button = findViewById(R.id.buttonClickMe);
        buttonClickMe.setOnClickListener { showMessage1() }

    }

    private fun showMessage() {
        textViewMessage.setText(getString(R.string.warning_message))
    }
    private fun showMessage1() {
        textViewMessage.setText(getString(R.string.correct_message))
    }
}
