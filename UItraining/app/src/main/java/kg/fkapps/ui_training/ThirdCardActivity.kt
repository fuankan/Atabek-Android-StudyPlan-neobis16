package kg.fkapps.ui_training

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ThirdCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_card)

        val btnMaps = findViewById<Button>(R.id.materialButton6)
        val btnWeb = findViewById<Button>(R.id.materialButton5)

        btnWeb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.neobis.kg"))
            startActivity(browserIntent)
        }

        btnMaps.setOnClickListener {
            val lat = "42.871320945594185"
            val lng = "74.60860650953485"
            val geoUri = "http://maps.google.com/maps?q=loc:$lat,$lng (Neobis)"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(geoUri))
            startActivity(intent)
        }
    }
}