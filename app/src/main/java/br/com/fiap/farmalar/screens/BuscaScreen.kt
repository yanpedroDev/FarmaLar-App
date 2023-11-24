package br.com.fiap.farmalar.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.CardSelect
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.model.MedicamentoDTO
import br.com.fiap.farmalar.model.MedicamentoViewModel
import br.com.fiap.farmalar.ui.theme.Inter

@Composable
fun BuscaScreen(navController: NavController, medicamentoViewModel: MedicamentoViewModel) {

    val medicamentos: List<MedicamentoDTO> = medicamentoViewModel.listaMedicamentosPelasPatologiasApi()


    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            HeaderLogo()

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)

            ) {
                Text(
                    text = "Resultado da sua busca:",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = colorResource(id = R.color.orange_text)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(
                            modifier = Modifier
                                .size(25.dp, 30.dp)
                                .offset(48.dp),
                            painter = painterResource(id = R.drawable.check_image),
                            contentDescription = "Ícone verde de check",
                        )
                        Text(
                            modifier = Modifier
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "Programa Farmácia Popular do Brasil",
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = colorResource(id = R.color.green_text)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(
                        rememberScrollState()
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Column {
                    Column {
                        for (medicamento in medicamentos) {
                            CardSelect(navController, medicamento, medicamentoViewModel)
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                    }
                }
            }

        }
    }
}

