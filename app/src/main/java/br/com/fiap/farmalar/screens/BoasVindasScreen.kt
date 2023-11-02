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
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoasVindas(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column()
        {
            Spacer(modifier = Modifier.height(120.dp))
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

            Spacer(modifier = Modifier.height(160.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                    Button(
                    modifier = Modifier.size(300.dp, 60.dp),
                    onClick = {
                        navController.navigate("menu")
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

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier.size(300.dp, 60.dp),
                    onClick = {
                        navController.navigate("menu")
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource
                            (id = R.color.orange_button)
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(2.dp),
                    border = BorderStroke(2.dp, colorResource(id = R.color.orange_button))
                ) {
                    Text(
                        text = "Começar",
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