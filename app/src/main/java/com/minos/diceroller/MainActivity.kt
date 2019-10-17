package com.minos.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {      //AppCompatActivity为Activity的子类，提供最大兼容

    //var diceImage : ImageView? = null   //声明为空
    lateinit var diceImage: ImageView    //直到有相关操作时才初始化

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //R类会在build时产生

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = this.findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }


    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1

//        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when(randomInt) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        diceImage.setImageResource(drawableResource)

//        resultText.text = "Dice Rolled!"

//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
