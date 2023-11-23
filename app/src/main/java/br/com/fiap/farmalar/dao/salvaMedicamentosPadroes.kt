package br.com.fiap.farmalar.dao

import br.com.fiap.farmalar.model.MedicamentoDTO
import br.com.fiap.farmalar.service.RetrofitFactory

fun salvaMedicamentosPadroes() {

    var listaMedicamentoDTOs: List<MedicamentoDTO> = criaListaMedicamentoDTOsPadroes()
    val retrofit = RetrofitFactory().getApiService()

    if (listaMedicamentoDTOsApi().isEmpty()){
        for (MedicamentoDTO in listaMedicamentoDTOs){
            val call = retrofit.cadastraMedicamento(MedicamentoDTO);
            call.execute()
        }
    }
}

fun listaMedicamentoDTOsApi() : List<MedicamentoDTO>{
    val call = RetrofitFactory().getApiService().listaMedicamentos()
    var listaMedicamentos = call.execute().body()!!
    return listaMedicamentos
}

fun criaListaMedicamentoDTOsPadroes(): List<MedicamentoDTO> {
    return listOf(
        MedicamentoDTO(nome = "Brometo de Ipratrópio 0,02mg", descricao = "remedio de asma", patologia = "ASMA", precisaReceita = true, valor = 15, quantidadeDisponivel = 10),
        MedicamentoDTO(nome = "Brometo de Ipratrópio 0,25mg", patologia = "ASMA", descricao = "GRATUIDADE", precisaReceita = true, valor = 25, quantidadeDisponivel = 10),
        MedicamentoDTO(nome = "Dipropionato de Beclometasona 200mcg", patologia = "ASMA", descricao = "GRATUIDADE", precisaReceita = true, valor = 30, quantidadeDisponivel = 15),
        MedicamentoDTO(nome = "Dipropionato de Beclometasona 250mcg", patologia = "ASMA", descricao = "GRATUIDADE", precisaReceita = true, valor = 35, quantidadeDisponivel = 20),
        MedicamentoDTO(nome = "Dipropionato de Beclometasona 1mcg", patologia = "ASMA", descricao = "GRATUIDADE", precisaReceita = true, valor = 40, quantidadeDisponivel = 18),
        MedicamentoDTO(nome = "Sulfato de Salbutamol 100mcg", patologia = "ASMA", descricao = "GRATUIDADE", precisaReceita = true, valor = 22, quantidadeDisponivel = 25),
        MedicamentoDTO(nome = "Metformina 500mg", patologia = "DIABETES", descricao = "GRATUIDADE", precisaReceita = true, valor = 18, quantidadeDisponivel = 30),
        MedicamentoDTO(nome = "Metformina 850mg", patologia = "DIABETES", descricao = "GRATUIDADE", precisaReceita = true, valor = 20, quantidadeDisponivel = 28),
        MedicamentoDTO(nome = "Glibenclamida 5mg", patologia = "DIABETES", descricao = "GRATUIDADE", precisaReceita = true, valor = 15, quantidadeDisponivel = 35),
        MedicamentoDTO(nome = "Insulina Humana Regular 100UI/ml", patologia = "DIABETES", descricao = "GRATUIDADE", precisaReceita = true, valor = 50, quantidadeDisponivel = 20),
        MedicamentoDTO(nome = "Insulina Humana 100UI/ml", patologia = "DIABETES", descricao = "GRATUIDADE", precisaReceita = true, valor = 55, quantidadeDisponivel = 18),
        MedicamentoDTO(nome = "Atenolol 25mg", patologia = "HIPERTENSÃO", descricao = "GRATUIDADE", precisaReceita = true, valor = 10, quantidadeDisponivel = 40),
        MedicamentoDTO(nome = "Besilato de Anlodipino 5mg", patologia = "HIPERTENSÃO", descricao = "GRATUIDADE", precisaReceita = true, valor = 12, quantidadeDisponivel = 38),
        MedicamentoDTO(nome = "Captopril 25mg", patologia = "HIPERTENSÃO", descricao = "GRATUIDADE", precisaReceita = true, valor = 8, quantidadeDisponivel = 45),
        MedicamentoDTO(nome = "Cloridrato de Propranolol 40mg", patologia = "HIPERTENSÃO", descricao = "GRATUIDADE", precisaReceita = true, valor = 9, quantidadeDisponivel = 42),
        MedicamentoDTO(nome = "Hidroclorotiazida 25mg", patologia = "HIPERTENSÃO", descricao = "GRATUIDADE", precisaReceita = true, valor = 7, quantidadeDisponivel = 50),
        MedicamentoDTO(nome = "Espironolactona 25mg", patologia = "HIPERTENSÃO", descricao = "COPAGAMENTO", precisaReceita = true, valor = 15, quantidadeDisponivel = 22),
        MedicamentoDTO(nome = "Furosemida 40mg", patologia = "HIPERTENSÃO", descricao = "COPAGAMENTO", precisaReceita = true, valor = 18, quantidadeDisponivel = 25),
        MedicamentoDTO(nome = "Succinato de Metoprolol 25mg", patologia = "HIPERTENSÃO", descricao = "COPAGAMENTO", precisaReceita = true, valor = 16, quantidadeDisponivel = 30),
        MedicamentoDTO(nome = "Acetato de Medroxiprogesterona 150mg", patologia = "ANTICONCEPÇÃO", descricao = "COPAGAMENTO", precisaReceita = true, valor = 28, quantidadeDisponivel = 18),
        MedicamentoDTO(nome = "Etinilestradiol 0,03mg + Levonorgestrel 0,15mg", patologia = "ANTICONCEPÇÃO", descricao = "COPAGAMENTO", precisaReceita = true, valor = 30, quantidadeDisponivel = 20),
        MedicamentoDTO(nome = "Noretisterona 0.35mg", patologia = "ANTICONCEPÇÃO", descricao = "COPAGAMENTO", precisaReceita = true, valor = 25, quantidadeDisponivel = 22),
        MedicamentoDTO(nome = "Valerato de Estradiol 5mg + Enantato de Noretisterona 50mg", patologia = "ANTICONCEPÇÃO", descricao = "COPAGAMENTO", precisaReceita = true, valor = 35, quantidadeDisponivel = 15),
        MedicamentoDTO(nome = "Sinvastatina 10mg", patologia = "DISLIPIDEMIA", descricao = "GRATUIDADE", precisaReceita = true, valor = 22, quantidadeDisponivel = 30),
        MedicamentoDTO(nome = "Sinvastatina 20mg", patologia = "DISLIPIDEMIA", descricao = "GRATUIDADE", precisaReceita = true, valor = 25, quantidadeDisponivel = 28),
        MedicamentoDTO(nome = "Sinvastatina 40mg", patologia = "DISLIPIDEMIA", descricao = "GRATUIDADE", precisaReceita = true, valor = 30, quantidadeDisponivel = 25),
        MedicamentoDTO(nome = "Carbidopa 25mg + Levodopa 250mg", patologia = "DOENÇA DE PARKINSON", descricao = "GRATUIDADE", precisaReceita = true, valor = 40, quantidadeDisponivel = 15),
        MedicamentoDTO(nome = "Cloridrato de Benserazida 25mg + Levodopa 100mg", patologia = "DOENÇA DE PARKINSON", descricao = "GRATUIDADE", precisaReceita = true, valor = 45, quantidadeDisponivel = 12),
        MedicamentoDTO(nome = "Maleato de Timolol 2,5mg", patologia = "GLAUCOMA", descricao = "GRATUIDADE", precisaReceita = true, valor = 35, quantidadeDisponivel = 20),
        MedicamentoDTO(nome = "Maleato de Timolol 5mg", patologia = "GLAUCOMA", descricao = "GRATUIDADE", precisaReceita = true, valor = 40, quantidadeDisponivel = 18),
        MedicamentoDTO(nome = "Fralda Geriátrica", patologia = "INCONTINÊNCIA", descricao = "GRATUIDADE", precisaReceita = false, valor = 20, quantidadeDisponivel = 100),
        MedicamentoDTO(nome = "Alendronato de Sódio 70mg", patologia = "OSTEOPOROSE", descricao = "GRATUIDADE", precisaReceita = true, valor = 27, quantidadeDisponivel = 22),
        MedicamentoDTO(nome = "Budesonida 32mcg", patologia = "RINITE", descricao = "GRATUIDADE", precisaReceita = true, valor = 18, quantidadeDisponivel = 35),
        MedicamentoDTO(nome = "Budesonida 50mcg", patologia = "RINITE", descricao = "GRATUIDADE", precisaReceita = true, valor = 20, quantidadeDisponivel = 30),
        MedicamentoDTO(nome = "Dapagliflozina 10mg", patologia = "DOENÇA CARDIOVASCULAR", descricao = "GRATUIDADE", precisaReceita = true, valor = 45, quantidadeDisponivel = 25)
    )
}