package br.com.fiap.farmalar.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_medicamento")
class Medicamento(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val nome: String = "",
    val patologia: String = "",
    val modalidade: String = ""
)