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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.ui.theme.Inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroDeFarmacias(navController: NavController) {

    var inputRazaoSocial by remember {
        mutableStateOf("")
    }

    var inputCNPJ by remember {
        mutableStateOf("")
    }

    var inputDataDeAbertura by remember {
        mutableStateOf("")
    }

    var inputCEP by remember {
        mutableStateOf("")
    }

    var inputBairro by remember {
        mutableStateOf("")
    }

    var inputNumero by remember {
        mutableStateOf("")
    }

    var inputLogradouro by remember {
        mutableStateOf("")
    }

    var inputComplemento by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Logo do FarmaLar
            HeaderLogo()

            Spacer(modifier = Modifier.padding(vertical = 4.dp))

            Column {

                // Titulo Cadastrar Farmácia [0]
                Column {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        text = "Cadastrar Farmácia",
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontFamily = Inter,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.titulo_cadastro_usuarios)
                        )
                    )
                }

                // Coluna do Nome Completo [1]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Nome Completo [1]
                {
                    OutlinedTextField(
                        // Valor do Input Nome
                        value = inputRazaoSocial,
                        // Variavel de mudança de estado
                        onValueChange = { inputRazaoSocial = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = colorResource(id = R.color.white),
                            textColor = colorResource(id = R.color.black),
                            placeholderColor = colorResource(id = R.color.half_black),
                            focusedBorderColor = colorResource(id = R.color.orange_text),
                            unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                            unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                            focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                            unfocusedLabelColor = colorResource(id = R.color.half_black),
                            focusedLabelColor = colorResource(id = R.color.orange_text)


                        ),
                        label = {
                            Text(
                                modifier = Modifier.padding(horizontal = 2.dp),
                                text = "Razão Social",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite sua razão social",
                                fontSize = 14.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(id = R.color.half_black)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                modifier = Modifier
                                    .offset(8.dp)
                                    .size(30.dp, 30.dp),
                                painter = painterResource(id = R.drawable.input_name),
                                contentDescription = "Ícone de Usuário"
                            )
                        },
                        keyboardOptions = KeyboardOptions(KeyboardCapitalization.Words)
                    )
                }

                // Coluna do Email [2]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do CNPJ [2]
                {
                    OutlinedTextField(
                        // Valor do Input CNPJ
                        value = inputCNPJ,
                        // Variavel de mudança de estado
                        onValueChange = { inputCNPJ = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = colorResource(id = R.color.white),
                            textColor = colorResource(id = R.color.black),
                            placeholderColor = colorResource(id = R.color.half_black),
                            focusedBorderColor = colorResource(id = R.color.orange_text),
                            unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                            unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                            focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                            unfocusedLabelColor = colorResource(id = R.color.half_black),
                            focusedLabelColor = colorResource(id = R.color.orange_text),

                            ),
                        label = {
                            Text(
                                modifier = Modifier.padding(horizontal = 2.dp),
                                text = "CNPJ",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite o seu CNPJ",
                                fontSize = 14.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(id = R.color.half_black)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                modifier = Modifier
                                    .offset(8.dp)
                                    .size(30.dp, 30.dp),
                                painter = painterResource(id = R.drawable.input_cnpj),
                                contentDescription = "Ícone de Email"
                            )
                        })
                }

                // Coluna da Data de Abertura [3]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.Center
                    // Input da Data de Nascimento [3]
                ) {
                    OutlinedTextField(
                        // Valor do Input Data de Abertura
                        value = inputDataDeAbertura,
                        // Variavel de mudança de estado
                        onValueChange = { inputDataDeAbertura = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = colorResource(id = R.color.white),
                            textColor = colorResource(id = R.color.black),
                            placeholderColor = colorResource(id = R.color.half_black),
                            focusedBorderColor = colorResource(id = R.color.orange_text),
                            unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                            unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                            focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                            unfocusedLabelColor = colorResource(id = R.color.half_black),
                            focusedLabelColor = colorResource(id = R.color.orange_text)
                        ),
                        label = {
                            Text(
                                modifier = Modifier.padding(horizontal = 2.dp),
                                text = "Data de Abertura",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite no formato: DD/MM/AAAA",
                                fontSize = 14.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(id = R.color.half_black)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                modifier = Modifier
                                    .offset(8.dp)
                                    .size(30.dp, 30.dp),
                                painter = painterResource(id = R.drawable.input_date),
                                contentDescription = "Ícone de Email"
                            )
                        }
                    )
                }

                // Coluna do CEP [4]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.Center
                    // Input do CEP [4]
                ) {
                    OutlinedTextField(
                        // Valor do Input CEP
                        value = inputCEP,
                        // Variavel de mudança de estado
                        onValueChange = { inputCEP = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number
                        ),
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = colorResource(id = R.color.white),
                            textColor = colorResource(id = R.color.black),
                            placeholderColor = colorResource(id = R.color.half_black),
                            focusedBorderColor = colorResource(id = R.color.orange_text),
                            unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                            unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                            focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                            unfocusedLabelColor = colorResource(id = R.color.half_black),
                            focusedLabelColor = colorResource(id = R.color.orange_text)
                        ),
                        label = {
                            Text(
                                modifier = Modifier.padding(horizontal = 2.dp),
                                text = "CEP",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite no formato: XX.XXX-XXX",
                                fontSize = 14.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(id = R.color.half_black)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                modifier = Modifier
                                    .offset(8.dp)
                                    .size(30.dp, 30.dp),
                                painter = painterResource(id = R.drawable.input_cep),
                                contentDescription = "Ícone de Email"
                            )
                        }
                    )
                }

                // Linha do Bairro [5]
                Row(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    horizontalArrangement = Arrangement.Center
                    // Input do Bairro [5]
                ) {
                    OutlinedTextField(
                        // Valor do Input Senha
                        value = inputBairro,
                        // Variavel de mudança de estado
                        onValueChange = { inputBairro = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(190.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Text
                        ),
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = colorResource(id = R.color.white),
                            textColor = colorResource(id = R.color.black),
                            placeholderColor = colorResource(id = R.color.half_black),
                            focusedBorderColor = colorResource(id = R.color.orange_text),
                            unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                            unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                            focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                            unfocusedLabelColor = colorResource(id = R.color.half_black),
                            focusedLabelColor = colorResource(id = R.color.orange_text)
                        ),
                        label = {
                            Text(
                                modifier = Modifier.padding(horizontal = 10.dp),
                                text = "Bairro",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite o seu bairro",
                                fontSize = 14.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(id = R.color.half_black)
                            )
                        },
                    )
                    // Linha do Numero
                    Row(modifier = Modifier.padding(horizontal = 6.dp)) {
                    }
                    OutlinedTextField(
                        // Valor do Input Numero
                        value = inputNumero,
                        // Variavel de mudança de estado
                        onValueChange = { inputNumero = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(120.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword
                        ),
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = colorResource(id = R.color.white),
                            textColor = colorResource(id = R.color.black),
                            placeholderColor = colorResource(id = R.color.half_black),
                            focusedBorderColor = colorResource(id = R.color.orange_text),
                            unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                            unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                            focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                            unfocusedLabelColor = colorResource(id = R.color.half_black),
                            focusedLabelColor = colorResource(id = R.color.orange_text)
                        ),
                        label = {
                            Text(
                                modifier = Modifier.padding(horizontal = 10.dp),
                                text = "Nº",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite o nº",
                                fontSize = 14.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(id = R.color.half_black)
                            )
                        }
                    )
                }
            }

            // Coluna do Complemento
            Column(
                Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                verticalArrangement = Arrangement.Center
                // Input do Complemento
            ) {
                OutlinedTextField(
                    // Valor do Input Complemento
                    value = inputComplemento,
                    // Variavel de mudança de estado
                    onValueChange = { inputComplemento = it },
                    shape = RoundedCornerShape(size = 20.dp),
                    modifier = Modifier.size(325.dp, 60.dp),
                    keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
                    singleLine = true,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = colorResource(id = R.color.white),
                        textColor = colorResource(id = R.color.black),
                        placeholderColor = colorResource(id = R.color.half_black),
                        focusedBorderColor = colorResource(id = R.color.orange_text),
                        unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                        unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                        focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                        unfocusedLabelColor = colorResource(id = R.color.half_black),
                        focusedLabelColor = colorResource(id = R.color.orange_text)
                    ),
                    label = {
                        Text(
                            modifier = Modifier.padding(horizontal = 10.dp),
                            text = "Complemento",
                            fontSize = 18.sp,
                            fontFamily = Inter,
                            fontWeight = FontWeight.Medium,
                        )
                    },
                    placeholder = {
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = "Digite o seu complemento",
                            fontSize = 14.sp,
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(id = R.color.half_black)
                        )
                    }
                )
            }

            // Coluna do Logradouro
            Column(
                Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                verticalArrangement = Arrangement.Center
                // Input do Logradouro
            ) {
                OutlinedTextField(
                    // Valor do Input Logradouro
                    value = inputLogradouro,
                    // Variavel de mudança de estado
                    onValueChange = { inputLogradouro = it },
                    shape = RoundedCornerShape(size = 20.dp),
                    modifier = Modifier.size(325.dp, 60.dp),
                    keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
                    singleLine = true,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = colorResource(id = R.color.white),
                        textColor = colorResource(id = R.color.black),
                        placeholderColor = colorResource(id = R.color.half_black),
                        focusedBorderColor = colorResource(id = R.color.orange_text),
                        unfocusedBorderColor = colorResource(id = R.color.borda_inputs_cadastro),
                        unfocusedLeadingIconColor = colorResource(id = R.color.color_icons),
                        focusedLeadingIconColor = colorResource(id = R.color.orange_text),
                        unfocusedLabelColor = colorResource(id = R.color.half_black),
                        focusedLabelColor = colorResource(id = R.color.orange_text)
                    ),
                    label = {
                        Text(
                            modifier = Modifier.padding(horizontal = 10.dp),
                            text = "Logradouro",
                            fontSize = 18.sp,
                            fontFamily = Inter,
                            fontWeight = FontWeight.Medium,
                        )
                    },
                    placeholder = {
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = "Digite o seu logradouro",
                            fontSize = 14.sp,
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(id = R.color.half_black)
                        )
                    }
                )
            }

            Spacer(modifier = Modifier.height(35.dp))

            // Coluna do Botao Criar
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier.size(325.dp, 55.dp),
                    onClick = {
                        navController.navigate("cadastro-farmacia2")
                    },
                    colors = ButtonDefaults.buttonColors(
                        colorResource
                            (id = R.color.orange_button)
                    ),
                    elevation = ButtonDefaults.elevatedButtonElevation(6.dp),
                    border = BorderStroke(2.dp, colorResource(id = R.color.orange_text))
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Avançar",
                        textAlign = TextAlign.Center,
                        fontFamily = Inter,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.white)
                    )
                }
            }
        }
    }
}

