package br.com.fiap.farmalar

import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.farmalar.model.MedicamentoViewModel
import br.com.fiap.farmalar.screens.BoasVindas
import br.com.fiap.farmalar.screens.BuscaScreen
import br.com.fiap.farmalar.screens.CadastroDeFarmacias
import br.com.fiap.farmalar.screens.CadastroDeFarmacias2
import br.com.fiap.farmalar.screens.CadastroDeFarmacias3
import br.com.fiap.farmalar.screens.CadastroDeUsuarios
import br.com.fiap.farmalar.screens.ConsultaMedicamento
import br.com.fiap.farmalar.screens.LoginScreen
import br.com.fiap.farmalar.screens.MenuScreen
import br.com.fiap.farmalar.screens.ReservaScreen
import br.com.fiap.farmalar.service.salvaMedicamentosPadroes
import br.com.fiap.farmalar.ui.theme.FarmaLarTheme


class MainActivity : ComponentActivity(), Runnable{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        setContent {
            FarmaLarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {
                    run()
                    val medicamentoViewModel = MedicamentoViewModel()

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "boas-vindas"
                    ) {
                        composable(route = "boas-vindas") {
                            BoasVindas(navController)
                        }
                        composable(route = "cadastro-usuario") {
                            CadastroDeUsuarios(navController)
                        }
                        composable(route = "login") {
                            LoginScreen(navController)
                        }
                        composable(route = "cadastro-farmacia") {
                            CadastroDeFarmacias(navController)
                        }
                        composable(route = "cadastro-farmacia2") {
                            CadastroDeFarmacias2(navController)
                        }
                        composable(route = "cadastro-farmacia3") {
                            CadastroDeFarmacias3(navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(navController, medicamentoViewModel)
                        }
                        composable(route = "busca") {
                            BuscaScreen(navController, medicamentoViewModel)
                        }
                        composable(route = "consulta-medicamento/{nomeMedicamento}") {
                            val nomeMedicamento: String? =
                                it.arguments?.getString("nomeMedicamento", "")
                            ConsultaMedicamento(
                                navController,
                                medicamentoViewModel,
                                nomeMedicamento
                            )
                        }
                        composable(route = "reserva") {
                            ReservaScreen(navController)
                        }
                    }
                }
            }
        }
    }

    override fun run() {
        salvaMedicamentosPadroes()
    }
}

