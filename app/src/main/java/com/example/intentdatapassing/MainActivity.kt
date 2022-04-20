package com.example.intentdatapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnApply.setOnClickListener {
        val name = etName.text.toString().trim()
        val age = etAge.text.toString().trim().toInt()
        val country = etCountry.text.toString().trim()
        val person = Person(name,age,country)

        Intent(this, SecondActivity::class.java).also {
//            it.putExtra("EXTRA_NAME", name)
//            it.putExtra("EXTRA_AGE", age)
//            it.putExtra("EXTRA_COUNTRY", country)
            it.putExtra("EXTRA_PERSON", person)
            startActivity(it)
        }
    }
    }
}