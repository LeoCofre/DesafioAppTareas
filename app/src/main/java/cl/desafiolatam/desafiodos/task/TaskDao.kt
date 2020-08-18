package cl.desafiolatam.desafiodos.task

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TaskDao {
    @Query("SELECT * FROM task")
     fun getAll(): List<Task>

    @Query("SELECT * FROM task where id IN(:taskIds)")

    fun cargaPorIds (taskIds: IntArray) : List<Task>

    @Query("SELECT * FROM task where tarea Like :tarea Limit 1 ")

    fun findByTask(tarea : String) : Task

    @Insert
    fun insertar (tarea: Task)

    @Delete
    fun borrar (tarea: Task)

}