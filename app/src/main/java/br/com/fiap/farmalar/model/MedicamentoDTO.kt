package br.com.fiap.farmalar.model

data class MedicamentoDTO(
    val id: Long = 0,
    val nome: String = "",
    val descricao: String = "",
    val quantidadeDisponivel: Long = 0,
    val valor: Long = 0,
    val precisaReceita: Boolean = true,
    val patologia: String = ""
)