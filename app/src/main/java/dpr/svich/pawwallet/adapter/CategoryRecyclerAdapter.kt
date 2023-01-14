package dpr.svich.pawwallet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dpr.svich.pawwallet.R
import dpr.svich.pawwallet.model.TransactionCategory

class CategoryRecyclerAdapter : RecyclerView.Adapter<CategoryRecyclerAdapter.CategoryViewHolder>(){

    class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.categoryImageView)
        val text: TextView = itemView.findViewById(R.id.categoryTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.text.text = "Category $position"
    }

    override fun getItemCount(): Int {
        return TransactionCategory.values().size
    }
}