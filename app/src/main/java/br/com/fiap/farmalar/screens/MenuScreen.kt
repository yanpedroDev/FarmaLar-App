package br.com.fiap.farmalar.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.CheckBoxStyle
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.model.MedicamentoViewModel
import br.com.fiap.farmalar.ui.theme.Inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController, medicamentoViewModel: MedicamentoViewModel) {

    var searchText by remember {
        mutableStateOf("")
    }

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

                Column {
                    Text(
                        modifier = Modifier
                            .padding(horizontal = 15.dp),
                        text = "Gratuidade",
                        fontFamily = Inter,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = colorResource(id = R.color.orange_text)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Column {
                    Row {
                        CheckBoxStyle(text = "Asma", medicamentoViewModel)
                        Row(
                            modifier = Modifier.padding(horizontal = 2.dp)
                        ) {
                            CheckBoxStyle(text = "Diabetes", medicamentoViewModel)
                        }
                        Row {
                            CheckBoxStyle(text = "Hipertensão", medicamentoViewModel)
                        }
                    }
                    Row {
                        CheckBoxStyle(text = "Anticoncepção", medicamentoViewModel)
                        Row {
                            CheckBoxStyle(text = "Osteoporose", medicamentoViewModel)
                        }
                    }

                }

                Spacer(modifier = Modifier.height(16.dp))

                Column {
                    Text(
                        modifier = Modifier
                            .padding(horizontal = 15.dp),
                        text = "Copagamento",
                        fontFamily = Inter,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = colorResource(id = R.color.orange_text)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Column {
                    Row {
                        CheckBoxStyle(text = "Dislipidemia", medicamentoViewModel)
                        Row(
                            modifier = Modifier.padding(horizontal = 41.dp)
                        ) {
                            CheckBoxStyle(text = "Rinite", medicamentoViewModel)
                        }
                    }
                    Row {
                        CheckBoxStyle(text = "Doença de\nParkinson", medicamentoViewModel)
                        Row(
                            modifier = Modifier.padding(horizontal = 49.dp)
                        ) {
                            CheckBoxStyle(text = "Glaucoma", medicamentoViewModel)
                        }
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Row {
                        CheckBoxStyle(text = "Doença\nCardiovascular", medicamentoViewModel)
                        Row(
                            modifier = Modifier.padding(horizontal = 19.dp)
                        ) {
                            CheckBoxStyle(text = "Incontinência", medicamentoViewModel)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(36.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = searchText,
                        onValueChange = { searchText = it },
                        modifier = Modifier.size(340.dp, 65.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            textColor = colorResource(id = R.color.black),
                            focusedLabelColor = colorResource(id = R.color.orange_text),
                            placeholderColor = colorResource(id = R.color.part_black),
                            containerColor = colorResource(id = R.color.transparent),
                            focusedBorderColor = colorResource(id = R.color.orange_text),
                            unfocusedBorderColor = colorResource(id = R.color.part_black)
                        ),
                        label = {
                            Text(
                                text = "Digite o nome do seu medicamento"
                            )
                        },
                        placeholder = {
                            Text(
                                text = "Não utilize acentos gráficos"
                            )
                        },
                        trailingIcon = {
                            Icon(
                                modifier = Modifier
                                    .offset((-5).dp)
                                    .size(36.dp, 42.dp),
                                imageVector = Icons.Default.Search,
                                contentDescription = "Ícone de Pesquisa",
                                tint = colorResource(id = R.color.orange_button)
                            )
                        },
                        shape = RoundedCornerShape(size = 32.dp),
                        keyboardOptions = KeyboardOptions(KeyboardCapitalization.Characters)
                    )
                }

                Spacer(modifier = Modifier.height(48.dp))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        modifier = Modifier.size(150.dp, 50.dp),
                        onClick = {
                                  navController.navigate("busca")
                        },
                        colors = ButtonDefaults.buttonColors(
                            colorResource
                                (id = R.color.orange_button)
                        ),
                        elevation = ButtonDefaults.elevatedButtonElevation(2.dp),
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




