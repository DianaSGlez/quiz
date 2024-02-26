package com.example.quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_true: Button = findViewById(R.id.btn_true)
        val btn_false: Button = findViewById(R.id.btn_false)
        val questionTextView: TextView = findViewById(R.id.question)

        // Obtener texto de la pregunta desde los recursos
        questionTextView.text = getString(R.string.question_txt)

        // Obtener texto de los botones desde los recursos
        btn_true.text = getString(R.string.btn_true)
        btn_false.text = getString(R.string.btn_false)

        btn_true.setOnClickListener {
            Toast.makeText(
                this,
                "Respuesta correcta",
                Toast.LENGTH_LONG
            ).show()
        }
        btn_false.setOnClickListener{
            Toast.makeText(
                this,
                "Respuesta incorrecta",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
