package br.com.fiap.farmalar.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.farmalar.R

@Composable
fun DivisorLine() {
    Row(modifier = Modifier
        .height(12.dp)
    ) {
    }
    Image(modifier = Modifier.padding(5.dp),
        painter = painterResource(id = R.drawable.line_divisor),
        contentDescription = "Linha divisoria")
    contentColorFor(backgroundColor = colorResource(id = R.color.black))
}