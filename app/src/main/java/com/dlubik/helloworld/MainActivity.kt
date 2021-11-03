package com.dlubik.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timesClicked = 0

        val btnPeopleCounter = findViewById<Button>(R.id.peopleCounter)
        val btnReset = findViewById<Button>(R.id.resetButton)
        val txtPeopleCount = findViewById<TextView>(R.id.textView)

        btnReset.setOnClickListener {
            btnPeopleCounter.text = "You just reseted me :<"
            txtPeopleCount.text = "Start over"
            timesClicked = 0
        }

        btnPeopleCounter.setOnClickListener {
            timesClicked++
            btnPeopleCounter.text = "You just clicked me :>"
            txtPeopleCount.text = "Number of pepole: " + timesClicked.toString()

            Toast.makeText(this, "Count faster human!", Toast.LENGTH_LONG).show()
        }

    }
}