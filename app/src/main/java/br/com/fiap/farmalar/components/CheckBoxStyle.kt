package br.com.fiap.farmalar.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.model.Medicamento
import br.com.fiap.farmalar.model.MedicamentoViewModel
import br.com.fiap.farmalar.ui.theme.Inter

@Composable
fun CheckBoxStyle(
    text: String,
    medicamentoViewModel: MedicamentoViewModel
) {

    var patologias by remember {
        mutableStateOf(false)
    }

    val listaDeMedicamentos by medicamentoViewModel
        .patologiasState
        .observeAsState(initial =  mutableListOf())

    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Checkbox(
                checked = patologias,
                onCheckedChange = { isSelected ->
                    patologias = isSelected
                    if (patologias){
                        medicamentoViewModel.onPatologiasChanged(text)
                    }
                },
                colors = CheckboxDefaults.colors(
                    uncheckedColor = colorResource(id = R.color.light_gray),
                    checkedColor = colorResource(id = R.color.orange_button),
                    checkmarkColor = colorResource(id = R.color.white)
                )
            )

            Text(
                modifier = Modifier.offset((-5).dp),
                text = text,
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}









