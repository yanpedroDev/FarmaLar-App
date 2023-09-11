package br.com.fiap.farmalar.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
        Column()
        {
            HeaderLogo()

            Column {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .fillMaxWidth(),
                    text = "Olá,",
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = colorResource(id = R.color.orange_text)
                )

                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .fillMaxWidth(),
                    text = "Marque as opções desejadas ou\ndigite no campo de pesquisa",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp),
                    text = "Gratuidade",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = colorResource(id = R.color.orange_text)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Row {
                    CheckBoxStyle(text = "Asma")
                    CheckBoxStyle(text = "Diabetes")
                    CheckBoxStyle(text = "Hipertensão")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp),
                    text = "Copagamento",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = colorResource(id = R.color.orange_text)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Row(
                    modifier = Modifier.padding(horizontal = 2.dp)
                ) {
                    CheckBoxStyle(text = "Anticoncepção")
                    CheckBoxStyle(text = "Dislipidemia")
                }
                Row {
                    CheckBoxStyle(text = "Doença de\nParkinson")
                    Row(
                        modifier = Modifier.padding(horizontal = 32.dp)
                    ) {
                        CheckBoxStyle(text = "Glaucoma")
                    }
                }
                Row {
                    CheckBoxStyle(text = "Incontinência")
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp)
                    ) {
                        CheckBoxStyle(text = "Osteoporose")
                    }
                }

                Row {
                    CheckBoxStyle(text = "Doenca\nCardiovascular")
                    Row(
                        modifier = Modifier.padding(horizontal = 2.dp)
                    ) {
                        CheckBoxStyle(text = "Rinite")
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        modifier = Modifier.size(140.dp, 50.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.orange_button)),
                        elevation = ButtonDefaults.elevatedButtonElevation(4.dp),
                        border = BorderStroke(2.dp, colorResource(id = R.color.orange_text))
                    ) {
                        Text(
                            text = "Buscar",
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




