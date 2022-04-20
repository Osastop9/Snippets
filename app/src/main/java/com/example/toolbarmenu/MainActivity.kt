package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miAddContact -> Toast.makeText(this, "You can add contacts", Toast.LENGTH_LONG).show()
            R.id.miFavorites -> Toast.makeText(this, "You can add Favorites", Toast.LENGTH_LONG).show()
            R.id.miSettings -> Toast.makeText(this, "Enter Settings", Toast.LENGTH_LONG).show()
            R.id.miFeedback -> Toast.makeText(this, "You can give Feedback", Toast.LENGTH_LONG).show()
            R.id.miClose -> finish()
        }
        return true
    }
}