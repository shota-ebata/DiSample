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
import com.ebata_shota.disample.DiSampleApp
import com.ebata_shota.disample.R
import com.ebata_shota.disample.di.component.ActivityComponent
import com.ebata_shota.disample.di.module.PresenterModule
import com.ebata_shota.disample.presenter.MainPresenter

class MainActivity : AppCompatActivity() {

    private lateinit var activityComponent: ActivityComponent

    lateinit var presenter: MainPresenter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent = ActivityComponent(
            appComponent = (application as DiSampleApp).appComponent,
            presenterModule = PresenterModule()
        )
        activityComponent.inject(this)

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
        val user = presenter.getUser()
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = user?.name ?: "デフォルト"

        val editText = findViewById<EditText>(R.id.edit_text)

        val button1 = findViewById<Button>(R.id.button_1)
        button1.setOnClickListener {
            // button_1の押下時イベント
            val name = editText.text.toString()
            presenter.saveUserName(name)
            val newName = presenter.getUser()?.name ?: "なし"
            textView.text = newName
        }

        val button2 = findViewById<Button>(R.id.button_2)
        button2.setOnClickListener {
            // button_2の押下時イベント
            presenter.removeUser()
            textView.text = presenter.getUser()?.name ?: "なし"
            editText.text.clear()
        }
    }
}