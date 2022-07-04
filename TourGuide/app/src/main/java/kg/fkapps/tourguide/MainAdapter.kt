package kg.fkapps.tourguide

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.fkapps.tourguide.fragments.BarsFragment
import kg.fkapps.tourguide.fragments.FoodFragment
import kg.fkapps.tourguide.fragments.MallsFragment

class MainAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) :
    FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Bars")
                val bars = BarsFragment()
                bars.arguments = bundle
                return bars
            }
            1 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Food")
                val food = FoodFragment()
                food.arguments = bundle
                return food
            }
            2 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Malls")
                val malls = MallsFragment()
                malls.arguments = bundle
                return malls
            }
            else -> return BarsFragment()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}