package com.ebata_shota.disample.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ebata_shota.disample.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initViews()
    }

    private fun initViews() {
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = "デフォルト"

        val editText = findViewById<EditText>(R.id.edit_text)

        val button1 = findViewById<Button>(R.id.button_1)
        button1.setOnClickListener {
            // button_1の押下時イベント
            textView.text = editText.text
        }

        val button2 = findViewById<Button>(R.id.button_2)
        button2.setOnClickListener {
            // button_2の押下時イベント
            textView.text = ""
            editText.text.clear()
        }
    }
}