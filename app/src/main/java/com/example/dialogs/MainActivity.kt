package com.example.dialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Osayi to your contact list?")
            .setIcon(R.drawable.ic_ladd_contact_foreground)
            .setPositiveButton("Yes") {_, _ ->
                Toast.makeText(this, "You have successfully added Osayi to your contact list", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this, "Osayi was not added to contact", Toast.LENGTH_LONG).show()
            }.create()

        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options,0) { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_LONG).show()
            }
            .setPositiveButton("Yes") {_, _ ->
                Toast.makeText(this, "Accepted", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this, "Declined", Toast.LENGTH_LONG).show()
            }.create()

        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){_, i, isChecked ->
                if (isChecked){
                    Toast.makeText(this,"You checked ${options[i]}", Toast.LENGTH_SHORT).show()
                }else
                    Toast.makeText(this,"You un checked ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Yes") {_, _ ->
                Toast.makeText(this, "Accepted", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this, "Declined", Toast.LENGTH_LONG).show()
            }.create()

        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}