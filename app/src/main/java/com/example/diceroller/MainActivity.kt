package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById<Button>(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        // Creating a new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Assign the textView's text to the result from the dice roll
        val resultTextView = findViewById<TextView>(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}