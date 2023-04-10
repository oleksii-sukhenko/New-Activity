package com.example.activitylessons

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val firstPerson = intent.extras?.getParcelable("key_oleksii") as Person?
        val  secondPerson= intent.extras?.getParcelable("key_oleksandra") as Person?
        val secondActivityTextView = findViewById<TextView>(R.id.secondActivity_textView)
        secondActivityTextView.text = "${firstPerson.toString()}\n${secondPerson.toString()}"

    }
}