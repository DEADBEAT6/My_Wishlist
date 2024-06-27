package com.raj.mywishlist.data
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long =  0L,
    @ColumnInfo(name="wish-title")
    val title: String = "",
    @ColumnInfo(name="wish-desc")
    val description: String = ""
)
object DummyWish{
    val wishList = listOf(
        Wish(title = "Smriti", description = "puchchiiiii"),
        Wish(title = "Smriti", description = "command her : baith jao to me"),
        Wish(title = "Smriti", description = "cuddle"),
        Wish(title = "Smriti", description = "fuuuuuu"),
        Wish(title = "Smriti", description = "hug")
    )
}
