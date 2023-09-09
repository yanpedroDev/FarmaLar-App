package br.com.fiap.farmalar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.ui.theme.FarmaLarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FarmaLarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Box(modifier = Modifier.fillMaxSize()) {
        HeaderLogo()
    }
}
