package kg.fkapps.ui_training

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_card)

        val btnEmail = findViewById<Button>(R.id.button_email_second_card)
        val btnWhatsapp = findViewById<Button>(R.id.button_whatsapp_second_card)
        val btnCall = findViewById<Button>(R.id.button_call_second_card)
        val btnWeb = findViewById<Button>(R.id.button_web_second_card)

        btnEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:oleg.mayami93@gmail.com")
            }
            startActivity(Intent.createChooser(emailIntent, "Making an appointment"))
        }

        btnWeb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.neobis.kg"))
            startActivity(browserIntent)
        }

        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+996774678876"))
            startActivity(intent)
        }

        btnWhatsapp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW) // setting action
            try {
                val url = "https://api.whatsapp.com/send?phone=+996774678876" + "&text=" + "Hello"
                intent.data = Uri.parse(url)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this, "Whatsapp not installed!", Toast.LENGTH_LONG).show()
            }
        }
    }
}