package br.com.fiap.farmalar.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fiap.farmalar.repository.MedicamentoRepository

class MedicamentoViewModel: ViewModel() {

    private val _patologias = MutableLiveData<MutableList<String>>()
    val patologiasState: LiveData<MutableList<String>> = _patologias

    fun onPatologiasChanged(novoMedicamento: String){
        if (_patologias.value == null){
            _patologias.value = mutableListOf()
        }
        _patologias.value?.add(novoMedicamento)
    }

    fun listaMedicamentosPelasPatologias(medicamentoRepository: MedicamentoRepository): MutableList<Medicamento> {
        val medicamentos: MutableList<Medicamento> = mutableListOf()

        for (patologia in _patologias.value!!){
            medicamentos.addAll(medicamentoRepository.listaMedicamentosPelaPatologia(patologia))
        }
        return medicamentos
    }

    fun limpaListaDePatologias(){
        _patologias.value?.clear()
    }
}