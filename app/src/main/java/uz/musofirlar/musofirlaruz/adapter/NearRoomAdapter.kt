package uz.musofirlar.musofirlaruz.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import uz.musofirlar.musofirlaruz.R
import uz.musofirlar.musofirlaruz.model.RentHouseInfo

class NearRoomAdapter: RecyclerView.Adapter<RentRoomViewHolder>() {

    private val diffUtilCallback = object : DiffUtil.ItemCallback<RentHouseInfo>() {

        override fun areContentsTheSame(oldItem: RentHouseInfo, newItem: RentHouseInfo) =
            oldItem.location == newItem.location

        override fun areItemsTheSame(oldItem: RentHouseInfo, newItem: RentHouseInfo) =
            oldItem == newItem

    }

    val differ = AsyncListDiffer(this, diffUtilCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RentRoomViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rv2_item_list, parent, false)
        return RentRoomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RentRoomViewHolder, position: Int) {
        val imageView: ImageView = holder.itemView.findViewById(R.id.unsplash_2)
        val textView1: TextView = holder.itemView.findViewById(R.id.rv_2_txt1)
        val textView2: TextView = holder.itemView.findViewById(R.id.location_txt)
        val textView3: TextView = holder.itemView.findViewById(R.id.rv2_amount)

        imageView.setImageResource(differ.currentList[position].image)
        textView1.text = differ.currentList[position].roomSize
        textView2.text = differ.currentList[position].location
        textView3.text = differ.currentList[position].amount
    }

    override fun getItemCount() = differ.currentList.size
}