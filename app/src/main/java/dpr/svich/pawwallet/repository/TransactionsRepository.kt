package dpr.svich.pawwallet.repository

import dpr.svich.pawwallet.dao.TransactionDao
import dpr.svich.pawwallet.model.Transaction
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TransactionsRepository(private val transactionDao: TransactionDao) {

    suspend fun insertTransaction(transaction: Transaction){
        withContext(Dispatchers.IO){
            transactionDao.insertTransaction(transaction)
        }
    }
}