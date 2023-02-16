package dpr.svich.pawwallet

import androidx.room.Database
import androidx.room.RoomDatabase
import dpr.svich.pawwallet.dao.TransactionDao
import dpr.svich.pawwallet.model.Transaction

@Database(
    version = 1,
    entities = [
        Transaction::class
    ]
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getTransactionDao(): TransactionDao
}