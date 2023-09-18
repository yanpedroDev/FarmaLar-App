package br.com.fiap.farmalar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.farmalar.screens.MenuScreen
import br.com.fiap.farmalar.screens.BuscaScreen
import br.com.fiap.farmalar.components.CardSelect
import br.com.fiap.farmalar.dao.salvaMedicamentosPadroes
import br.com.fiap.farmalar.model.MedicamentoViewModel
import br.com.fiap.farmalar.repository.MedicamentoRepository
import br.com.fiap.farmalar.screens.ReservaScreen
import br.com.fiap.farmalar.ui.theme.FarmaLarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FarmaLarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {
                    val context = LocalContext.current
                    val medicamentoRepository = MedicamentoRepository(context)
                    salvaMedicamentosPadroes(context, medicamentoRepository)
                    val medicamentoViewModel = MedicamentoViewModel()

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "menu"
                    ) {
                        composable(route = "menu") {
                            MenuScreen(navController, medicamentoViewModel)
                        }
                        composable(route = "busca") {
                            BuscaScreen(navController, context, medicamentoViewModel, medicamentoRepository)
                        }
                        composable(route = "reserva") {
                            ReservaScreen(navController)
                        }
                    }
                }
            }
        }
    }
}

