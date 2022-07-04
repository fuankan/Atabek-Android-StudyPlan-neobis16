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


class FoodFragment : Fragment() {

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
                "https://lh3.ggpht.com/p/AF1QipOrIuhaxIDXR7-gwXvT-4GZj_g5mJ2Fxl3tdTE2=s1536",
                "Chicken Star",
                "One of the best restaurants in Bishkek. Chicken is simply delicious. Try the Korean one. You can taste some of the Korean food as it is in South Korea. Staff is kind and attentive. The only thing that can be improved is the waiting time for the food.",
                "+996 558041111",
                "Erkindik 36, Bishkek",
                "42.8729811267096, 74.60574980674787"
            ),
            Item(
                2,
                "https://lh3.ggpht.com/p/AF1QipN666-PeKh-A2sB_7pLU9Zd0iW7trVvuuYAc4gq=s1024",
                "Herb Cafe",
                "Cute little cafe that specializes in tea, which is not exactly common in this city. Their prices are good, the tea is delicious and the atmosphere and design are perfectly suited to settling in with a book and a pot of tea. The music was a tad loud, but other than that - top notch. While I am a hardcore coffee lover, I definitely plan on going back.",
                "+996 500335544",
                "47 Mir Ave, Bishkek",
                "42.87313698548461, 74.58897211174242"
            ),
            Item(
                3,
                "https://lh3.ggpht.com/p/AF1QipNLw6sdZXQL_U9oFueQ-RPEq_rONLM26lDnb4Db=s512",
                "Biscuit",
                "Such a cozy, spacious and bright place to meet with friends, work remotely or just have \"me time\". I'd recommend to try sea-buckthorn lemonade and cranberry tea.",
                "+996 707443006",
                "53/2 Tokombayev Ave, Bishkek",
                "42.824630795823836, 74.61541134242982"
            ),
            Item(
                4,
                "https://lh3.ggpht.com/p/AF1QipOgFUMtmb0XjlMGZzqHeqWLcqHSsrAbALzfcnXY=s512",
                "Booblik",
                "If you want a nice breakfast at reasonable prices, Bublik is definitely your choice!  But it is known among tourists and that could be quite annoying for some people.  The breakfast dishes are really delicious, I can recommend the yoghurt with fresh fruits. So amazing to see that they kept the tree inside of the place!",
                "+996 551333555",
                "75/1 Toktogula St., Bishkek",
                "42.872564513424365, 74.61498047592833"
            )
        )

        _adapter = ItemAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = _adapter
        return binding.root

    }
}
