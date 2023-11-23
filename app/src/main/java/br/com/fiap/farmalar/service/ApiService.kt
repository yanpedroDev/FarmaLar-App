package br.com.fiap.farmalar.service

import br.com.fiap.farmalar.model.MedicamentoDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("medicamentos")
    fun cadastraMedicamento(@Body medicamento: MedicamentoDTO): Call<MedicamentoDTO>

    @GET("medicamentos")
    fun listaMedicamentos(): Call<List<MedicamentoDTO>>

}