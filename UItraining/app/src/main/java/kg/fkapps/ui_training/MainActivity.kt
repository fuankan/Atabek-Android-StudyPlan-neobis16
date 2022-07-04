package kg.fkapps.ui_training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstBtn = findViewById<Button>(R.id.btn_first_card)
        val secondBtn = findViewById<Button>(R.id.btn_second_card)
        val thirdBtn = findViewById<Button>(R.id.btn_third_card)

        firstBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, FirstCardActivity::class.java)
            startActivity(intent)
        }

        secondBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondCardActivity::class.java)
            startActivity(intent)
        }

        thirdBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, ThirdCardActivity::class.java)
            startActivity(intent)
        }
    }
}