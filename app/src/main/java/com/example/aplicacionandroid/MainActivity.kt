package com.example.aplicacionandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email = "admin"
        var pass = "admin"

        var emailText = findViewById<EditText>(R.id.email)
        var passwordText = findViewById<EditText>(R.id.pass)

        var testButton = findViewById<Button>(R.id.button)
        var testResult = findViewById<TextView>(R.id.test)

        testButton.setOnClickListener{
            val mailIngresado = emailText.text.toString()
            val passIngresado = passwordText.text.toString()
            if (mailIngresado == email && passIngresado == pass){
                testResult.text = "Usuario Válido: $email"
            }
            else{
                testResult.text = "Usuario Inválido"
            }
        }|
    }
}