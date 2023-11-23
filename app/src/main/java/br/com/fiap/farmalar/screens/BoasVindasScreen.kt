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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import br.com.fiap.farmalar.ui.theme.Inter
import androidx.compose.foundation.Image
import androidx.compose.material3.contentColorFor
import br.com.fiap.farmalar.components.DivisorLine

@Composable
fun BoasVindas(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
    }
    Column()
    {
        Spacer(modifier = Modifier.height(60.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier.size(340.dp, 80.dp),
                painter = painterResource(id = R.drawable.farmalar_logo),
                contentDescription = "Logo da FarmaLar"
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        Column {
            Card(
                shape = RoundedCornerShape(45.dp),
                colors = CardDefaults.cardColors(colorResource(id = R.color.color_card)),
                border = BorderStroke(1.dp, colorResource(id = R.color.stroke_card)),
                modifier = Modifier
                    .size(360.dp, 380.dp)
                    .padding(horizontal = 20.dp)
            ) {

                Spacer(modifier = Modifier.height(25.dp))

                Column {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Bem-vindo ao FarmaLar!",
                        fontFamily = Inter,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.black)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Column {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        textAlign = TextAlign.Start,
                        text = "Caso já tenha uma conta, clique em Entrar. Caso não tenha, " +
                                "clique em Cadastrar Usuário ou Farmácia",
                        fontFamily = Inter,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(id = R.color.black)
                    )
                }



                // Botao de Entrar
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        modifier = Modifier.size(300.dp, 60.dp),
                        onClick = {
                            navController.navigate("login")
                        },
                        colors = ButtonDefaults.buttonColors(
                            colorResource
                                (id = R.color.white)
                        ),
                        elevation = ButtonDefaults.elevatedButtonElevation(2.dp),
                        border = BorderStroke(2.dp, colorResource(id = R.color.orange_button))
                    ) {
                        Text(
                            text = "Entrar",
                            textAlign = TextAlign.Center,
                            fontFamily = Inter,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.orange_text)
                        )
                    }
                }
            }

            // Botao de Cadastar Usuario
            Spacer(modifier = Modifier.height(1.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-130).dp)
            ) {
                Button(
                    modifier = Modifier.size(300.dp, 60.dp),
                    onClick = {
                        navController.navigate("cadastro-usuario")
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource
                            (id = R.color.orange_button)
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(4.dp),
                    border = BorderStroke(2.dp, colorResource(id = R.color.orange_button))
                ) {
                    Text(
                        text = "Cadastrar Usuário",
                        textAlign = TextAlign.Center,
                        fontFamily = Inter,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.white)
                    )
                }

                DivisorLine()
            }

            // Botao de Cadastar Empresa
            Spacer(modifier = Modifier.height(1.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-120).dp)
            ) {
                Button(
                    modifier = Modifier.size(300.dp, 60.dp),
                    onClick = {
                        navController.navigate("cadastro-farmacia")
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource
                            (id = R.color.orange_button)
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(4.dp),
                    border = BorderStroke(2.dp, colorResource(id = R.color.orange_text))
                ) {
                    Text(
                        text = "Cadastrar Farmácia",
                        textAlign = TextAlign.Center,
                        fontFamily = Inter,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.white)
                    )
                }
            }
        }
    }
}