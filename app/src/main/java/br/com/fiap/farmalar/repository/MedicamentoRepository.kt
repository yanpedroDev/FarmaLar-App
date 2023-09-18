package br.com.fiap.farmalar.repository

import android.content.Context
import br.com.fiap.farmalar.dao.MedicamentoDb
import br.com.fiap.farmalar.model.Medicamento

class MedicamentoRepository(context: Context) {

    private val db = MedicamentoDb.getDatabase(context).MedicamentoDao()

    fun salvar(medicamento: Medicamento): Long{
        return db.salvar(medicamento)
    }

    fun atualizar(medicamento: Medicamento): Int{
        return db.atualizar(medicamento)
    }

    fun excluir(medicamento: Medicamento): Int{
        return db.excluir(medicamento)
    }

    fun listarmedicamentos(): List<Medicamento>{
        return db.listarmedicamentos()
    }

    fun buscarmedicamentoPeloId(id: Int): Medicamento{
        return db.buscarmedicamentoPeloId(id)
    }

    fun listaMedicamentosPelaPatologia(patologia: String): List<Medicamento> {
        return db.listarmedicamentosPelaPatologia(patologia = patologia.uppercase())
    }
}