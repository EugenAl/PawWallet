package dpr.svich.pawwallet.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.util.*

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey val id:Long,
    @TypeConverters(EnumConverter::class) val category: TransactionCategory,
    @TypeConverters(DateConverter::class) val timestamp: Date,
    val sum: Float
    )