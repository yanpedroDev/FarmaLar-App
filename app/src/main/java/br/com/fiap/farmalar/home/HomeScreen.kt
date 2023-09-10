package br.com.fiap.farmalar.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.CheckBoxStyle
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.ui.theme.Inter

@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            HeaderLogo()

            Column {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .fillMaxWidth(),
                    text = "Olá,\nselecione as opções desejadas",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp),
                    text = "Patologia:",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = colorResource(id = R.color.orange_text)
                )

                Spacer(modifier = Modifier.height(8.dp))

                CheckBoxStyle(
                    text1 = "Anticoncepção",
                    text2 = "Diabetes"
                )

                CheckBoxStyle(
                    text1 = "Hipertensão",
                    text2 = "Asma"
                )
                
                CheckBoxStyle(
                    text1 = "Dislipidemia",
                    text2 = "Doença de Parkinson"
                )

                CheckBoxStyle(
                    text1 = "Glaucoma",
                    text2 = "Rinite"
                )

                CheckBoxStyle(
                    text1 = "Osteoporose",
                    text2 = "Doença Cariovascular"
                )

            }

        }
    }
}

