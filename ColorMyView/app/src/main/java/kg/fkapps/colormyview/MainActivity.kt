package kg.fkapps.colormyview

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val one = findViewById<TextView>(R.id.tv_one)
        val two = findViewById<TextView>(R.id.tv_two)
        val three = findViewById<TextView>(R.id.tv_three)
        val four = findViewById<TextView>(R.id.tv_four)
        val five = findViewById<TextView>(R.id.tv_five)
        val constraint = findViewById<View>(R.id.constraint_layout)
        val red = findViewById<Button>(R.id.button_red)
        val yellow = findViewById<Button>(R.id.button_yellow)
        val green = findViewById<Button>(R.id.button_green)


        val clickableViews: List<View> =
            listOf(one, two, three, four, five, constraint, red, yellow, green)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        val three = findViewById<TextView>(R.id.tv_three)
        val four = findViewById<TextView>(R.id.tv_four)
        val five = findViewById<TextView>(R.id.tv_five)
        when (view.id) {
            // Boxes using Color class colors for background
            R.id.tv_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tv_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.tv_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.tv_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.tv_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.button_red -> three.setBackgroundResource(R.color.red)
            R.id.button_yellow -> four.setBackgroundResource(R.color.yellow)
            R.id.button_green -> five.setBackgroundResource(R.color.green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}