package kg.fkapps.tourguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout.setSelectedTabIndicatorColor(getColor(R.color.white))
        tabLayout.tabTextColors = ContextCompat.getColorStateList(this, R.color.white)

        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.isInlineLabel = true

        val adapter = MainAdapter(supportFragmentManager, lifecycle, 3)
        viewPager.adapter = adapter

        viewPager.isUserInputEnabled = true

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Bars"
                }
                1 -> {
                    tab.text = "Food"
                }
                2 -> {
                    tab.text = "Malls"
                }

            }
        }.attach()
    }
}