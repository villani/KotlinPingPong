package br.com.leonardovillani.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PlayerActivity : AppCompatActivity() {

    private lateinit var etPlayer1: EditText
    private lateinit var etPlayer2: EditText
    private lateinit var btStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        setUpView()

        btStart.setOnClickListener {
            val proximaTela = Intent(this, MainActivity::class.java)
            proximaTela.putExtra("PLAYER1", etPlayer1.text.toString())
            proximaTela.putExtra("PLAYER2", etPlayer2.text.toString())
            startActivity(proximaTela)
            finish()
        }
    }

    private fun setUpView() {

        etPlayer1 = findViewById(R.id.etPlayer1)
        etPlayer2 = findViewById(R.id.etPlayer2)
        btStart = findViewById(R.id.btStart)

    }
}