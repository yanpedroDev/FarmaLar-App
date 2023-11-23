package br.com.fiap.farmalar.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.model.MedicamentoViewModel
import br.com.fiap.farmalar.repository.MedicamentoRepository
import br.com.fiap.farmalar.ui.theme.Inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConsultaMedicamento(
    navController: NavController,
    medicamentoViewModel: MedicamentoViewModel,
    medicamentoRepository: MedicamentoRepository
) {

    medicamentoViewModel.listaMedicamentosPelasPatologias(medicamentoRepository)

    var searchText by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column()
        {

            HeaderLogo()

            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = searchText,
                    onValueChange = { searchText = it },
                    modifier = Modifier.size(340.dp, 65.dp),
                    singleLine = true,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = colorResource(id = R.color.black),
                        focusedLabelColor = colorResource(id = R.color.orange_text),
                        placeholderColor = colorResource(id = R.color.part_black),
                        containerColor = colorResource(id = R.color.transparent),
                        focusedBorderColor = colorResource(id = R.color.orange_text),
                        unfocusedBorderColor = colorResource(id = R.color.part_black)
                    ),
                    label = {
                        Text(
                            text = "Digite aqui o seu CEP",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            fontFamily = Inter,
                        )
                    },
                    placeholder = {
                        Text(
                            text = "Digite no formato: XX.XXX-XXX"
                        )
                    },
                    trailingIcon = {
                        Icon(
                            modifier = Modifier
                                .offset((-5).dp)
                                .size(36.dp, 42.dp),
                            imageVector = Icons.Default.Search,
                            contentDescription = "Ícone de Pesquisa",
                            tint = colorResource(id = R.color.orange_button)
                        )
                    },
                    shape = RoundedCornerShape(size = 32.dp),
                    keyboardOptions = KeyboardOptions(KeyboardCapitalization.Characters)
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment =
                Alignment.CenterHorizontally
            )
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .offset(y = (-10).dp)
                            .size(300.dp, 300.dp),
                        painter = painterResource(
                            id = R.drawable.generic_drugs
                        ),
                        contentDescription = "Imagem genérica de caixa do medicamento"
                    )
                }
            }

            Column {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = (-25).dp),
                    textAlign = TextAlign.Center,
                    text = "Nome do Medicamento",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.black)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier
                            .size(25.dp, 30.dp)
                            .offset(40.dp),
                        painter = painterResource(id = R.drawable.check_image),
                        contentDescription = "Ícone verde de check",
                    )
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Programa Farmácia Popular do Brasil",
                        fontFamily = Inter,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.green_text)
                    )
                }
            }

            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(65.dp, 65.dp),
                        painter = painterResource(
                            id = R.drawable.icon_gps
                        ),
                        contentDescription = "Imagem genérica de caixa do medicamento"
                    )
                    Row {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(y = (-10).dp),
                            textAlign = TextAlign.Left,
                            text = "Localização: aguardando o CEP...",
                            fontFamily = Inter,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp,
                            color = colorResource(id = R.color.black),
                        )
                    }
                }
            }
            Column {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = 95.dp, y = (-45).dp),
                    textAlign = TextAlign.Left,
                    text = "Farmácia: aguardando o CEP...",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.black)
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 40.dp)
                            .size(60.dp, 50.dp),
                        painter =
                        painterResource(id = R.drawable.icon_24_hours),
                        contentDescription = "Ícone da logo 24 horas"
                    )
                    Row {
                        Button(
                            modifier = Modifier
                                .size(250.dp, 50.dp)
                                .offset((-25).dp),
                            onClick = {
                                navController.navigate("reserva")
                            },
                            colors = ButtonDefaults.buttonColors(
                                colorResource
                                    (id = R.color.orange_button)
                            ),
                            elevation = ButtonDefaults.elevatedButtonElevation(2.dp),
                            border = BorderStroke(2.dp, colorResource(id = R.color.orange_text))
                        ) {
                            Text(
                                text = "Solicitar Reserva",
                                textAlign = TextAlign.Center,
                                fontFamily = Inter,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        }
                    }
                }
            }
        }
    }
}