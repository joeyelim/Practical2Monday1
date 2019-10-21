package com.example.practical2monday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
    }
    private fun rollDice(){
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
        roll_button.setOnClickListener{rollDice()}
    }
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val rollButton : Button = findViewById(R.id.roll_button)
            roll_button.setOnClickListener{ rollDice()}
        }

        private fun rollDice(){



            Toast.makeText(this,"button clicked",
                Toast.LENGTH_SHORT).show()

            val resultText: TextView = findViewById(R.id.result_text)
            resultText.text = "Dice Rolled!"

            val randomInt = Random().nextInt(6)+1
            resultText.text = randomInt.toString()




        }
    }
}
