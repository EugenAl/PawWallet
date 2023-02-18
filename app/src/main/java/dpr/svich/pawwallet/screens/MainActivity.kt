package dpr.svich.pawwallet.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dpr.svich.pawwallet.R
import dpr.svich.pawwallet.adapter.CategoryRecyclerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryRecyclerView: RecyclerView =
            findViewById(R.id.addTransactionRecyclerView)
        categoryRecyclerView.layoutManager =
            GridLayoutManager(this, 3)
        categoryRecyclerView.adapter =
            CategoryRecyclerAdapter()
    }
}