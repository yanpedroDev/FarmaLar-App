package br.com.fiap.farmalar.model

data class FarmaciaDTO(
    val razaoSocial: String,
    val cnpj: String,
    val endereco: EnderecoDTO
)