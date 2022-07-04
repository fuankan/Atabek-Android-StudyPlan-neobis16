package kg.fkapps.tourguide.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kg.fkapps.tourguide.Item
import kg.fkapps.tourguide.ItemAdapter
import kg.fkapps.tourguide.databinding.FragmentBarsBinding

class MallsFragment : Fragment() {

    private lateinit var binding: FragmentBarsBinding
    private lateinit var _adapter: ItemAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBarsBinding.inflate(layoutInflater)
        val placeList = mutableListOf(
            Item(
                1,
                "https://vesti.kg/media/k2/items/cache/420a20bfb35ba956ca4ec4e4ca2df67b_XL.jpg?t=20190506_092827",
                "Asia Mall",
                "Lively shopping and entertainment complex: clothing boutiques, supermarket, food court, cinema and indoor playground.",
                "+996 551890040",
                "3 Mir Ave, Bishkek",
                "42.85585471352556, 74.58512651103794"
            ),
            Item(
                2,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDxX7INknbnzfnktEu6fbTWrWqNPkfAfE8eh0LELvkIeoedGPhMAsgYrI8t4nkOZH3oT8&usqp=CAU",
                "Bishkek Park",
                "With a range of European and Turkish stores plus a decent top-floor food court and bowling alley, this is a popular hangout for local families.",
                "+996 312312031",
                "148 Kyiv St., Bishkek",
                "42.87482001787244, 74.59043576870998"
            ),
            Item(
                3,
                "https://data.vb.kg/image/big/2016-06-22_09-53-31_329205.jpg",
                "Tsum Center",
                "A large shopping center with shops for cell phones and other electronics, as well as a food court.",
                "+996 312909279",
                "155 Chui Ave, Bishkek",
                "42.87622700874288, 74.61452269569605"
            ),
            Item(
                4,
                "https://www.akchabar.kg/media/news/1d018325-bb5a-41db-8e32-46dce8bd3e0f.jpg.850x445_q82_crop.jpg",
                "Dordoi-Plaza",
                "Dordoi Plaza is a department store in Bishkek. Dordoi Plaza is situated northwest of Tokoldosh, close to Kyrgyz Opera and Ballet Theater.",
                "+996 312623000",
                "115 Ibraimov St., Bishkek",
                "42.87507510429466, 74.61894282638136"
            )
        )

        _adapter = ItemAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = _adapter
        return binding.root
    }
}
