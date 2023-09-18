package br.com.fiap.farmalar.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.farmalar.model.Medicamento

@Database(entities = [Medicamento::class], version = 1)
abstract class MedicamentoDb: RoomDatabase() {

    abstract fun MedicamentoDao(): MedicamentoDao

    companion object {
        private lateinit var instance: MedicamentoDb

        fun getDatabase(context: Context): MedicamentoDb{
            if (!::instance.isInitialized){
                instance = Room
                    .databaseBuilder(
                        context,
                        MedicamentoDb::class.java,
                        "medicamento_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }
}