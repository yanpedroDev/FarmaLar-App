package br.com.fiap.farmalar.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.ui.theme.Inter


@Composable
fun CardItems() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
    }
    Row {
        Card(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .size(160.dp, 240.dp),
            colors = CardDefaults.cardColors(
                colorResource(id = R.color.white)
            ),
            shape = RoundedCornerShape(30.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            border = BorderStroke(1.dp, colorResource(id = R.color.orange_circle))
        ) {
            Column {
                Row {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(200.dp, 140.dp),
                        painter = painterResource(
                            id = R.drawable.items_pasta_de_dente
                        ),
                        contentDescription = "Imagem de uma pasta de dente"
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(40.dp, 30.dp),
                        painter =
                        painterResource(id = R.drawable.items_icon_plus),
                        contentDescription = "Icone de Mais"
                    )
                    Row {
                        Text(
                            modifier = Modifier
                                .offset((-10).dp),
                            text = "R$12,99",
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            color = colorResource(id = R.color.orange_text)
                        )
                    }
                }
            }
        }
        Row {
            Card(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(160.dp, 240.dp),
                colors = CardDefaults.cardColors(
                    colorResource(id = R.color.white)
                ),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                border = BorderStroke(1.dp, colorResource(id = R.color.orange_circle))
            ) {
                Column {
                    Row {
                        Image(
                            modifier = Modifier
                                .padding(15.dp)
                                .size(200.dp, 140.dp),
                            painter = painterResource(
                                id = R.drawable.items_creme
                            ),
                            contentDescription = "Imagem de uma pasta de dente"
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = Modifier
                                .padding(15.dp)
                                .size(40.dp, 30.dp),
                            painter =
                            painterResource(id = R.drawable.items_icon_plus),
                            contentDescription = "Icone de Mais"
                        )
                        Row {
                            Text(
                                modifier = Modifier
                                    .offset((-10).dp),
                                text = "R$96,00",
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 20.sp,
                                color = colorResource(id = R.color.orange_text)
                            )
                        }
                    }
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(24.dp))

    Row {
        Card(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .size(160.dp, 240.dp),
            colors = CardDefaults.cardColors(
                colorResource(id = R.color.white)
            ),
            shape = RoundedCornerShape(30.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            border = BorderStroke(1.dp, colorResource(id = R.color.orange_circle))
        ) {
            Column {
                Row {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(200.dp, 140.dp),
                        painter = painterResource(
                            id = R.drawable.items_coristina
                        ),
                        contentDescription = "Imagem de uma pasta de dente"
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(15.dp)
                            .size(40.dp, 30.dp),
                        painter =
                        painterResource(id = R.drawable.items_icon_plus),
                        contentDescription = "Icone de Mais"
                    )
                    Row {
                        Text(
                            modifier = Modifier
                                .offset((-10).dp),
                            text = "R$19,00",
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            color = colorResource(id = R.color.orange_text)

                        )
                    }
                }

            }
        }
        Row {
            Card(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(160.dp, 240.dp),
                colors = CardDefaults.cardColors(
                    colorResource(id = R.color.white)
                ),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                border = BorderStroke(1.dp, colorResource(id = R.color.orange_circle))
            ) {
                Column {
                    Row {
                        Image(
                            modifier = Modifier
                                .padding(15.dp)
                                .size(200.dp, 140.dp),
                            painter = painterResource(
                                id = R.drawable.items_gillete
                            ),
                            contentDescription = "Imagem de uma pasta de dente"
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = Modifier
                                .padding(15.dp)
                                .size(40.dp, 30.dp),
                            painter =
                            painterResource(id = R.drawable.items_icon_plus),
                            contentDescription = "Icone de Mais"
                        )
                        Row {
                            Text(
                                modifier = Modifier
                                    .offset((-10).dp),
                                text = "R$15,80",
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 20.sp,
                                color = colorResource(id = R.color.orange_text)
                            )
                        }
                    }
                }
            }
        }
    }
}