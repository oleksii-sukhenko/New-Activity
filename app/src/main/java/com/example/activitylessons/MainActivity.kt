package com.example.activitylessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.parcelize.Parcelize


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.mainConstraintLayout)
        constraintLayout.setOnClickListener {

            val oleksii = Person(
                firstName = "Oleksii",
                lastName = "Sukhenko",
                age = 28,
                prof = "non-working"
            )
            val oleksandra = Person(
                firstName = "Oleksandra",
                lastName = "Sukhenko",
                age = 24,
                prof = "HR"
            )
            val bundle = Bundle()
            bundle.putParcelable("key_oleksii", oleksii)
            bundle.putParcelable("key_oleksandra", oleksandra)
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}

@Parcelize
data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val prof: String
) : Parcelable