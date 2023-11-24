package br.com.fiap.farmalar.model

data class EnderecoDTO(
    val rua: String = "",
    val bairro: String = "",
    val cep: String = "",
    val numero: Int = 0
)