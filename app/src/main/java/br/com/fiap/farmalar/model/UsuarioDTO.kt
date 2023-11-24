package br.com.fiap.farmalar.model

data class UsuarioDTO(
    val id: Long = 0,
    val nome: String = "",
    val email: String = "",
    val senha: String = "",
    val sexo: String? = null,
    val dataNascimento: String = ""
)