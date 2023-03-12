package com.example.changecolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var view: View
    private lateinit var button: FloatingActionButton
    private val colors=arrayOf(Color.RED,Color.YELLOW,Color.WHITE,Color.BLUE,Color.MAGENTA,Color.GREEN,Color.BLACK,Color.CYAN,Color.DKGRAY,Color.GRAY,Color.LTGRAY,Color.TRANSPARENT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.view)
        button = findViewById(R.id.button_change)

        button.setOnClickListener {

            view.setBackgroundColor(colors[Random.nextInt(colors.size)]) //range (0-size)


        }
    }
}