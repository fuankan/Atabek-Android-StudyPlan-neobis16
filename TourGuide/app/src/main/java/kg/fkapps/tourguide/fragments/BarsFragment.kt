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

class BarsFragment : Fragment() {

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
                "https://lh3.ggpht.com/p/AF1QipNZf5wm32s3L7BaXLjc5McVsOwrJKo41nEqKiFR=s1024",
                "Choco's Bar",
                "Best speakeasy bar in Bishkek. If you want a delicious drink, then you are here.",
                "+996 777358829",
                "125 Panfilova St., Bishkek",
                "42.86103844479033, 74.60017085295277"
            ),
            Item(
                2,
                "https://lh3.ggpht.com/p/AF1QipOBLpSkmGqdaKKI311zouyQyQFWBlVigF2OyPAS=s1024",
                "No Name",
                "One of the favorite bars in the city. Good atmosphere, delicious and fast cuisine and of course great cocktails. A good contingent, a creative party.",
                "+996 559221091",
                "92 Bokonbayev St., Bishkek",
                "42.86685642968552, 74.60993356232044"
            ),
            Item(
                3,
                "https://lh3.ggpht.com/p/AF1QipOjFPSnAkLy8aglnq_o3TTSDsoBH5LgZcWBA0FN=s1024",
                "Mini Bar",
                "A summer terrace is too atmospheric a place - it's generally love. Delicious, fast and high-quality, special thanks to the staff for all the goodies, and individual signs with inscriptions are just beauty in detail.",
                "+996 707293199",
                "56 Mir Ave, Bishkek",
                "42.84886472555752, 74.58750609825002"
            ),
            Item(
                4,
                "https://lh3.ggpht.com/p/AF1QipOTnr5PXZkvi9xZ5Dqe1D2a7NdXwPw9bjH9TCyt=s512",
                "Lucky Leprechaun",
                "This pub is slightly hidden and easy to miss but definitely worth checking out. It’s run by an enthusiasts and is one of the places where local people meet. Small but cozy with authentic atmosphere. Easygoing place where you can meet for a beer and chat.",
                "+996 777777777",
                "86 Toktogul St., Bishkek",
                "42.87200686719612, 74.60997623558394"
            )
        )

        _adapter = ItemAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = _adapter
        return binding.root

    }
}