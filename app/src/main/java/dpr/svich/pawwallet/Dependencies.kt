package dpr.svich.pawwallet

import android.content.Context
import androidx.room.Room
import dpr.svich.pawwallet.repository.TransactionsRepository

object Dependencies {

    private lateinit var applicationContext: Context

    fun init(context: Context){
        applicationContext = context
    }

    private val appDatabase: AppDatabase by lazy{
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "data.db")
            .build()
    }

    val transactionsRepository: TransactionsRepository by lazy {
        TransactionsRepository(appDatabase.getTransactionDao())
    }
}