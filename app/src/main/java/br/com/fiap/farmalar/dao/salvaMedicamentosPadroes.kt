package br.com.fiap.farmalar.dao

import android.content.Context
import br.com.fiap.farmalar.model.Medicamento
import br.com.fiap.farmalar.repository.MedicamentoRepository

fun salvaMedicamentosPadroes(context: Context, medicamentoRepository: MedicamentoRepository) {

    var listaMedicamentos: List<Medicamento> = criaListaMedicamentosPadroes()

    if (medicamentoRepository.listarmedicamentos().isEmpty()){
        for (medicamento in listaMedicamentos){
            medicamentoRepository.salvar(medicamento)
        }
    }
}

fun criaListaMedicamentosPadroes(): List<Medicamento> {
    return listOf(
        Medicamento(id = 1, nome = "Brometo de Ipratrópio 0,02mg", patologia = "ASMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 2, nome = "Brometo de Ipratrópio 0,25mg", patologia = "ASMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 3, nome = "Dipropionato de Beclometasona 200mcg", patologia = "ASMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 4, nome = "Dipropionato de Beclometasona 250mcg", patologia = "ASMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 5, nome = "Dipropionato de Beclometasona 1mcg", patologia = "ASMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 6, nome = "Sulfato de Salbutamol 100mcg", patologia = "ASMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 7, nome = "Metformina 500mg", patologia = "DIABETES", modalidade = "GRATUIDADE"),
        Medicamento(id = 8, nome = "Metformina 850mg", patologia = "DIABETES", modalidade = "GRATUIDADE"),
        Medicamento(id = 9, nome = "Glibenclamida 5mg", patologia = "DIABETES", modalidade = "GRATUIDADE"),
        Medicamento(id = 10, nome = "Insulina Humana Regular 100UI/ml", patologia = "DIABETES", modalidade = "GRATUIDADE"),
        Medicamento(id = 11, nome = "Insulina Humana 100UI/ml", patologia = "DIABETES", modalidade = "GRATUIDADE"),
        Medicamento(id = 12, nome = "Atenolol 25mg", patologia = "HIPERTENSÃO", modalidade = "GRATUIDADE"),
        Medicamento(id = 13, nome = "Besilato de Anlodipino 5mg", patologia = "HIPERTENSÃO", modalidade = "GRATUIDADE"),
        Medicamento(id = 14, nome = "Captopril 25mg", patologia = "HIPERTENSÃO", modalidade = "GRATUIDADE"),
        Medicamento(id = 15, nome = "Cloridrato de Propranolol 40mg", patologia = "HIPERTENSÃO", modalidade = "GRATUIDADE"),
        Medicamento(id = 16, nome = "Hidroclorotiazida 25mg", patologia = "HIPERTENSÃO", modalidade = "GRATUIDADE"),
        Medicamento(id = 17, nome = "Espironolactona 25mg", patologia = "HIPERTENSÃO", modalidade = "COPAGAMENTO"),
        Medicamento(id = 18, nome = "Furosemida 40mg", patologia = "HIPERTENSÃO", modalidade = "COPAGAMENTO"),
        Medicamento(id = 19, nome = "Succinato de Metoprolol 25mg", patologia = "HIPERTENSÃO", modalidade = "COPAGAMENTO"),
        Medicamento(id = 20, nome = "Acetato de Medroxiprogesterona 150mg", patologia = "ANTICONCEPÇÃO", modalidade = "COPAGAMENTO"),
        Medicamento(id = 21, nome = "Etinilestradiol 0,03mg + Levonorgestrel 0,15mg", patologia = "ANTICONCEPÇÃO", modalidade = "COPAGAMENTO"),
        Medicamento(id = 22, nome = "Noretisterona 0.35mg", patologia = "ANTICONCEPÇÃO", modalidade = "COPAGAMENTO"),
        Medicamento(id = 23, nome = "Valerato de Estradiol 5mg + Enantato de Noretisterona 50mg", patologia = "ANTICONCEPÇÃO", modalidade = "COPAGAMENTO"),
        Medicamento(id = 24, nome = "Sinvastatina 10mg", patologia = "DISLIPIDEMIA", modalidade = "GRATUIDADE"),
        Medicamento(id = 25, nome = "Sinvastatina 20mg", patologia = "DISLIPIDEMIA", modalidade = "GRATUIDADE"),
        Medicamento(id = 26, nome = "Sinvastatina 40mg", patologia = "DISLIPIDEMIA", modalidade = "GRATUIDADE"),
        Medicamento(id = 27, nome = "Carbidopa 25mg + Levodopa 250mg", patologia = "DOENCA DE PARKINSON", modalidade = "GRATUIDADE"),
        Medicamento(id = 28, nome = "Cloridrato de Benserazida 25mg + Levodopa 100mg", patologia = "DOENCA DE PARKINSON", modalidade = "GRATUIDADE"),
        Medicamento(id = 29, nome = "Maleato de Timolol 2,5mg", patologia = "GLAUCOMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 30, nome = "Maleato de Timolol 5mg", patologia = "GLAUCOMA", modalidade = "GRATUIDADE"),
        Medicamento(id = 31, nome = "Fralda Geriátrica", patologia = "INCONTINÊNCIA", modalidade = "GRATUIDADE"),
        Medicamento(id = 32, nome = "Alendronato de Sódio 70mg", patologia = "OSTEOPOROSE", modalidade = "GRATUIDADE"),
        Medicamento(id = 33, nome = "Budesonida 32mcg", patologia = "RINITE", modalidade = "GRATUIDADE"),
        Medicamento(id = 34, nome = "Budesonida 50mcg", patologia = "RINITE", modalidade = "GRATUIDADE"),
        Medicamento(id = 35, nome = "Dapagliflozina 10mg", patologia = "DM I + DOENÇA CARDIOVASCULAR (>65ANOS)", modalidade = "GRATUIDADE")
    )
}