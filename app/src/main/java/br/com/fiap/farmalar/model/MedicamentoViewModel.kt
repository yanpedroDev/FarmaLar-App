package br.com.fiap.farmalar.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fiap.farmalar.service.RetrofitFactory

class MedicamentoViewModel: ViewModel() {

    private val _patologias = MutableLiveData<MutableList<String>>()
    val patologiasState: LiveData<MutableList<String>> = _patologias

    fun onPatologiasChanged(novoMedicamento: String){
        if (_patologias.value == null){
            _patologias.value = mutableListOf()
        }
        _patologias.value?.add(novoMedicamento)
    }

    fun listaMedicamentosPelasPatologiasApi(): MutableList<MedicamentoDTO> {
        val medicamentos: MutableList<MedicamentoDTO> = mutableListOf()
        var filtros: List<String> = _patologias.value ?: emptyList()

        medicamentos.addAll(listaMedicamentoFiltrandoApi(ajustaFiltros(filtros)))
        return medicamentos
    }

    fun limpaListaDePatologias(){
        _patologias.value?.clear()
    }

    fun listaMedicamentoFiltrandoApi(filtros: List<String>) : List<MedicamentoDTO>{
        val call = RetrofitFactory().getApiService().listaMedicamentosFiltrando(filtros)
        var listaMedicamentos : List<MedicamentoDTO> = listOf()
        try {
            listaMedicamentos = call.execute().body()!!
        }catch (exception: Exception){
            println(exception.stackTrace)
        }

        return listaMedicamentos
    }

    fun ajustaFiltros(filtros: List<String>) : List<String> {
        return filtros.map { filtro ->
            filtro.replace("\n", " ").uppercase()
        }.toMutableList()
    }
}