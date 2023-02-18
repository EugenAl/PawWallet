package dpr.svich.pawwallet.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dpr.svich.pawwallet.model.Transaction
import dpr.svich.pawwallet.model.TransactionCategory
import dpr.svich.pawwallet.repository.TransactionsRepository
import kotlinx.coroutines.launch
import java.lang.System.currentTimeMillis
import java.util.*

class MainActivityViewModel(private val transactionsRepository: TransactionsRepository) : ViewModel() {

    fun insertNewTransactionOnDatabase(sum: Float, category: TransactionCategory){
        viewModelScope.launch {
            transactionsRepository.insertTransaction(Transaction(0,category,
                Date(currentTimeMillis()),sum))
        }
    }
}