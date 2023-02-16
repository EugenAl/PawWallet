package dpr.svich.pawwallet.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import dpr.svich.pawwallet.model.Transaction

@Dao
interface TransactionDao {

    @Query("SELECT * FROM transaction LIMIT 5")
    fun getLastTransactions(): List<Transaction>

    @Insert
    fun insertTransaction(value: Transaction)

    @Delete
    fun deleteTransaction(value: Transaction)
}