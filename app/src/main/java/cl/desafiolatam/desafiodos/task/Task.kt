package cl.desafiolatam.desafiodos.task

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Task( val tarea: String ) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? =  null

}

