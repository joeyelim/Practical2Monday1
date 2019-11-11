package com.example.practical2monday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        lateinit var diceImage : ImageView
        roll_button.setOnClickListener{ rollDice()}
        add_button.setOnClickListener{ addCount()}
    }

        private fun rollDice(){

            Toast.makeText(this,"button clicked",
                Toast.LENGTH_SHORT).show()

            val diceImage: ImageView = findViewById(R.id.dice_Image)
            val diceImage1: ImageView = findViewById(R.id.dice_Image1)
            val resultText2: TextView = findViewById(R.id.result_text2)



            val randomInt = Random().nextInt(6)+1
            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)

            val randomInt1 = Random().nextInt(6)+1
            val drawableResource1 = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource1)

            val randomInt2 = Random().nextInt(6)+1
            resultText2.text = randomInt2.toString()

        }

        private fun addCount(){
            val resultText2: TextView = findViewById(R.id.result_text2)
            val parseInt = (resultText2.text.toString().toInt())+1

            resultText2.text= parseInt.toString()


        }


    }

