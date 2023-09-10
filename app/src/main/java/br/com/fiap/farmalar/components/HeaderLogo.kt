package br.com.fiap.farmalar.components

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.fiap.farmalar.R
import androidx.compose.ui.res.painterResource

@Composable
fun HeaderLogo() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp, 20.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.farmalar_logo),
            contentDescription = "Logo da FarmaLar"
        )
    }
}