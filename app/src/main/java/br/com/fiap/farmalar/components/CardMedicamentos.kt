package br.com.fiap.farmalar.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.ui.theme.Inter

@Composable
fun CardSelect(
    text: String
) {

    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .size(160.dp, 240.dp),
        colors = cardColors(
            colorResource(id = R.color.white)
        ),
        border = BorderStroke(1.dp, colorResource(id = R.color.orange_circle))
    ) {
        Column {
            Row {
                Image(
                    modifier = Modifier
                        .padding(15.dp)
                        .size(150.dp, 110.dp),
                    painter = painterResource(
                        id = R.drawable.box_drugs
                    ),
                    contentDescription = "Imagem generica de caixa do medicamento"
                )
            }
            Row {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = text,
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    color = colorResource(id = R.color.black)
                )

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(120.dp, 37.dp),
                    colors = buttonColors(
                        colorResource
                            (id = R.color.green_text)
                    ),
                ) {
                    Text(
                        text = "Selecionar",
                        color = colorResource(id = R.color.white)
                    )
                }
            }
        }
    }

}



