package com.example.alertboxdemo

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alertBoxOne = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setIcon(R.drawable.ic_person_add)
            .setMessage("You want to add MR. Poop?")
            .setPositiveButton("Yes"){ _,_ ->
                Toast.makeText(this,"You added Mr. Poop",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){_,_ ->
                Toast.makeText(this, "You not add Mr. Poop",Toast.LENGTH_SHORT).show()
            }.create()


        findViewById<Button>(R.id.btn1).setOnClickListener {
            alertBoxOne.show()
        }

        val choises = arrayOf("first choise","second choise","third choise")
        val alertBoxTwo = AlertDialog.Builder(this)
            .setTitle("Choise any of the one")
            .setSingleChoiceItems(choises,0){dialogInterface,i ->
                Toast.makeText(this,"you clicked on ${choises[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){_,_->
                Toast.makeText(this,"your choise Accepted",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_,_->
                Toast.makeText(this,"You decline choises",Toast.LENGTH_SHORT).show()
            }.create()

        findViewById<Button>(R.id.btn2).setOnClickListener {
            alertBoxTwo.show()
        }

        val alerBoxThree = AlertDialog.Builder(this)
            .setTitle("Chosie multipal options ")
            .setMultiChoiceItems(choises, booleanArrayOf(false,false,false)){ _,i,ischeked ->
                if(ischeked){
                    Toast.makeText(this,"${choises[i]} is cheked",Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept"){_,_->
                Toast.makeText(this,"Your order accepted",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_,_->
                Toast.makeText(this,"Your order not placed",Toast.LENGTH_SHORT).show()
            }.create()

        findViewById<Button>(R.id.btn3).setOnClickListener {
            alerBoxThree.show()
        }

    }
}