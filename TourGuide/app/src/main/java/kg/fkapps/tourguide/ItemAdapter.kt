package kg.fkapps.tourguide

import android.content.Intent
import android.net.Uri
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kg.fkapps.tourguide.databinding.ItemPlaceBinding

class ItemAdapter(private val items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPlaceBinding.inflate(inflater, parent, false)

        binding.contentImageViewButton.setOnClickListener {
            if (binding.expandedCard.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(binding.cvItem, AutoTransition())
                binding.contentImageViewButton.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24)
                binding.expandedCard.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(binding.cvItem, AutoTransition())
                binding.contentImageViewButton.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24)
                binding.expandedCard.visibility = View.GONE
            }

            binding.tvNumber.setOnClickListener {
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:" + binding.tvNumber.text)
                it.context.startActivity(dialIntent)
            }

            binding.tvAddress.setOnClickListener {
                val gmmIntentUri = Uri.parse("geo:" + binding.goneCoordinates.text)
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                it.context.startActivity(mapIntent)
            }
        }
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        with(holder.binding) {
            holder.itemView.tag = item
            contentImageViewButton.tag = item
            cardView.tag = item
            expandedCard.tag = item
            cvItem.tag = item
            tvPlaceName.text = item.name
            tvDescription.text = item.description
            tvNumber.text = item.phone
            tvAddress.text = item.address
            goneCoordinates.text = item.coordinates

            if (item.photo.isNotBlank()) {
                Glide.with(ImageView.context)
                    .load(item.photo)
                    .placeholder(R.drawable.ic_baseline_image_24)
                    .error(R.drawable.ic_baseline_image_24)
                    .into(ImageView)
            } else {
                Glide.with(ImageView.context).clear(ImageView)
                ImageView.setImageResource(R.drawable.ic_baseline_image_24)
            }
        }
    }

    override fun getItemCount(): Int = items.size

    class ItemViewHolder(val binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root)
}