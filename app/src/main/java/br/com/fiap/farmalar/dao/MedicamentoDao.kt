package br.com.fiap.farmalar.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.farmalar.model.Medicamento

@Dao
interface MedicamentoDao {

    @Insert
    fun salvar(medicamento: Medicamento): Long

    @Update
    fun atualizar(medicamento: Medicamento): Int

    @Delete
    fun excluir(medicamento: Medicamento): Int

    @Query("SELECT * FROM tbl_medicamento WHERE id = :id")
    fun buscarmedicamentoPeloId(id: Int): Medicamento

    @Query("SELECT * FROM tbl_medicamento WHERE patologia = :patologia")
    fun listarmedicamentosPelaPatologia(patologia: String): List<Medicamento>

    @Query("SELECT * FROM tbl_medicamento ORDER BY nome ASC")
    fun listarmedicamentos(): List<Medicamento>

}