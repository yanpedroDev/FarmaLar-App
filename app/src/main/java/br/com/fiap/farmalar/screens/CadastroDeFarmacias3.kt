package br.com.fiap.farmalar.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.ui.theme.Inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroDeFarmacias3(navController: NavController) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Logo do FarmaLar
            HeaderLogo()

            Spacer(modifier = Modifier.padding(vertical = 4.dp))

            Column {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    text = "Selecione o Plano desejado:",
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontFamily = Inter,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.titulo_cadastro_usuarios)
                    )
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(colorResource(id = R.color.yellow_card)),
                    border = BorderStroke(1.dp, colorResource(id = R.color.stroke_card)),
                    modifier = Modifier
                        .size(420.dp, 140.dp)
                        .padding(horizontal = 20.dp)
                ) {
                    Text(
                        text = "Plano Básico:",
                        modifier = Modifier.padding(14.dp),
                        fontFamily = Inter,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Black,
                        color = colorResource(id = R.color.white)
                    )
                    Column {
                        Text(
                            text = "1 Unidade - R$60,00",
                            modifier = Modifier.offset(x = 14.dp, y = (-18).dp),
                            fontFamily = Inter,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black,
                            color = colorResource(id = R.color.white)
                        )
                    }
                    Column {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Button(
                                modifier = Modifier
                                    .size(135.dp, 40.dp)
                                    .offset(y = (-5).dp),
                                onClick = {
                                    navController.navigate("login")
                                },
                                colors = ButtonDefaults.buttonColors(
                                    colorResource
                                        (id = R.color.white)
                                ),
                                border = BorderStroke(3.dp, colorResource(id = R.color.color_card))
                            ) {
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Selecionar",
                                    textAlign = TextAlign.Center,
                                    fontFamily = Inter,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Light,
                                    color = colorResource(id = R.color.black)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Column {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(colorResource(id = R.color.orange_text)),
                    border = BorderStroke(1.dp, colorResource(id = R.color.stroke_card)),
                    modifier = Modifier
                        .size(420.dp, 140.dp)
                        .padding(horizontal = 20.dp)
                ) {
                    Text(
                        text = "Plano Avançado:",
                        modifier = Modifier.padding(14.dp),
                        fontFamily = Inter,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Black,
                        color = colorResource(id = R.color.white)
                    )
                    Column {
                        Text(
                            text = "Até 5 Unidades - R$200,00",
                            modifier = Modifier.offset(x = 14.dp, y = (-18).dp),
                            fontFamily = Inter,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black,
                            color = colorResource(id = R.color.white)
                        )
                    }
                    Column {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Button(
                                modifier = Modifier
                                    .size(135.dp, 40.dp)
                                    .offset(y = (-5).dp),
                                onClick = {
                                    navController.navigate("login")
                                },
                                colors = ButtonDefaults.buttonColors(
                                    colorResource
                                        (id = R.color.white)
                                ),
                                border = BorderStroke(3.dp, colorResource(id = R.color.color_card))
                            ) {
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Selecionar",
                                    textAlign = TextAlign.Center,
                                    fontFamily = Inter,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Light,
                                    color = colorResource(id = R.color.black)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Column {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(colorResource(id = R.color.orange_button)),
                    border = BorderStroke(1.dp, colorResource(id = R.color.stroke_card)),
                    modifier = Modifier
                        .size(420.dp, 140.dp)
                        .padding(horizontal = 20.dp)
                ) {
                    Text(
                        text = "Plano Pro:",
                        modifier = Modifier.padding(14.dp),
                        fontFamily = Inter,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Black,
                        color = colorResource(id = R.color.white)
                    )
                    Column {
                        Text(
                            text = "Até 20 Unidades - R$700,00",
                            modifier = Modifier.offset(x = 14.dp, y = (-18).dp),
                            fontFamily = Inter,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black,
                            color = colorResource(id = R.color.white)
                        )
                    }
                    Column {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Button(
                                modifier = Modifier
                                    .size(135.dp, 40.dp)
                                    .offset(y = (-5).dp),
                                onClick = {
                                    navController.navigate("login")
                                },
                                colors = ButtonDefaults.buttonColors(
                                    colorResource
                                        (id = R.color.white)
                                ),
                                border = BorderStroke(3.dp, colorResource(id = R.color.color_card))
                            ) {
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Selecionar",
                                    textAlign = TextAlign.Center,
                                    fontFamily = Inter,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Light,
                                    color = colorResource(id = R.color.black)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier.size(200.dp, 50.dp),
                    onClick = {
                        navController.navigate("boas-vindas")
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource
                            (id = R.color.white)
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(6.dp),
                    border = BorderStroke(2.dp, colorResource(id = R.color.orange_text))
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Voltar",
                        textAlign = TextAlign.Center,
                        fontFamily = Inter,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.orange_text)
                    )
                }
            }

        }
    }
}

