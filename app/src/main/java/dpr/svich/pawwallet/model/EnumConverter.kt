package dpr.svich.pawwallet.model

import androidx.room.TypeConverter

class EnumConverter {

    @TypeConverter
    fun toTransactionCategory(value: Int) = enumValues<TransactionCategory>()[value]

    @TypeConverter
    fun fromTransactionCategory(value: TransactionCategory) = value.ordinal
}