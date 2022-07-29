package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Float


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
        buttonClick()
    }

    private fun buttonClick() {
        var buttonCalcula = findViewById<Button>(R.id.button_calculate)

        buttonCalcula.setOnClickListener() {
            var editWeightString = findViewById<EditText>(R.id.edit_weight).getText().toString()
            var editWeightValue = Integer.parseInt(editWeightString)

            var editHeightString = findViewById<EditText>(R.id.edit_height).getText().toString()
            var editHeightValue = Float.parseFloat(editHeightString)

            var imc = editWeightValue / (editHeightValue * editHeightValue)

            var textResult = findViewById<TextView>(R.id.text_result)
            textResult.setText("$imc")
        }
    }
}