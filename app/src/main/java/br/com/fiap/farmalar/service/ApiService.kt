package br.com.fiap.farmalar.service

import br.com.fiap.farmalar.model.FarmaciaDTO
import br.com.fiap.farmalar.model.LoginUsuarioDTO
import br.com.fiap.farmalar.model.MedicamentoDTO
import br.com.fiap.farmalar.model.UsuarioDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @POST("medicamentos")
    fun cadastraMedicamento(@Body medicamento: MedicamentoDTO): Call<MedicamentoDTO>

    @GET("medicamentos/filtros")
    fun listaMedicamentosFiltrando(@Query(value = "filtros") filtros: List<String>): Call<List<MedicamentoDTO>>

    @GET("medicamentos")
    fun listaMedicamentos(): Call<List<MedicamentoDTO>>

    @GET("usuarios/email/{email}")
    fun buscaUsuarioPorEmail(@Path("email") email: String): Call<UsuarioDTO>

    @POST("usuarios")
    fun cadastraUsuario(@Body usuarioDTO: UsuarioDTO): Call<UsuarioDTO>

    @POST("usuarios/login")
    fun loginUsuario(@Body loginUsuarioDTO: LoginUsuarioDTO): Call<Void>

    @GET("farmacias/razaoSocial/{razaoSocial}")
    fun buscaFarmaciaPorRazaoSocial(@Path("razaoSocial") razaoSocial: String): Call<FarmaciaDTO>

    @POST("farmacias")
    fun cadastraFarmacia(@Body farmaciaDTO: FarmaciaDTO): Call<FarmaciaDTO>

}