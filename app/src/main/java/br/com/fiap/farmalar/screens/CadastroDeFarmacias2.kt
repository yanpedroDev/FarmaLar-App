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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.DivisorLine
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.ui.theme.Inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroDeFarmacias2(navController: NavController) {

    var inputEmail by remember {
        mutableStateOf("")
    }

    var inputSenha by remember {
        mutableStateOf("")
    }

    var inputConfirmarSenha by remember {
        mutableStateOf("")
    }

    var inputNome by remember {
        mutableStateOf("")
    }

    var inputEmailMaster by remember {
        mutableStateOf("")
    }

    var inputCelular by remember {
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

                Spacer(modifier = Modifier.padding(6.dp))

                // Coluna do Email [1]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Email[1]
                {
                    OutlinedTextField(
                        // Valor do Input Email
                        value = inputEmail,
                        // Variavel de mudança de estado
                        onValueChange = { inputEmail = it },
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
                                text = "E-mail",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite o seu email",
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
                                painter = painterResource(id = R.drawable.input_email),
                                contentDescription = "Ícone de Usuário"
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )
                }

                // Coluna da Senha [4]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                    verticalArrangement = Arrangement.Center
                    // Input da Senha [4]
                ) {
                    OutlinedTextField(
                        // Valor do Input Senha
                        value = inputSenha,
                        // Variavel de mudança de estado
                        onValueChange = { inputSenha = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword
                        ),
                        visualTransformation = PasswordVisualTransformation(),
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
                                text = "Senha",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite sua senha",
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
                                painter = painterResource(id = R.drawable.input_password),
                                contentDescription = "Ícone de Cadeado de senha"
                            )
                        }
                    )
                }

                // Coluna de Confirmar Senha [5]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                    verticalArrangement = Arrangement.Center
                    // Input do Confirmar Senha [5]
                ) {
                    OutlinedTextField(
                        // Valor do Input Senha
                        value = inputConfirmarSenha,
                        // Variavel de mudança de estado
                        onValueChange = { inputConfirmarSenha = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword
                        ),
                        visualTransformation = PasswordVisualTransformation(),
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
                                text = "Confirme sua Senha",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite sua senha novamente",
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
                                painter = painterResource(id = R.drawable.input_password),
                                contentDescription = "Ícone de Cadeado de senha"
                            )
                        }
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier.offset(x = 5.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        DivisorLine()
                        Row(
                            modifier = Modifier.offset(x = (-22).dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            DivisorLine()
                            Row(
                                modifier = Modifier.offset(x = (-10).dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                DivisorLine()
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Column {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Dados Usuário - Acesso Master:",
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Light,
                        color = colorResource(id = R.color.half_black)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                // Coluna do Nome Completo
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Nome Completo
                {
                    OutlinedTextField(
                        // Valor do Input Nome
                        value = inputNome,
                        // Variavel de mudança de estado
                        onValueChange = { inputNome = it },
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
                                text = "Nome",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite seu nome",
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


                // Coluna do Email
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Email
                {
                    OutlinedTextField(
                        // Valor do Input Email
                        value = inputEmailMaster,
                        // Variavel de mudança de estado
                        onValueChange = { inputEmailMaster = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
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
                                text = "E-mail",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite seu e-mail",
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
                                painter = painterResource(id = R.drawable.input_email),
                                contentDescription = "Ícone de Email"
                            )
                        })
                }

                // Coluna do Celular
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Celular
                {
                    OutlinedTextField(
                        // Valor do Input Celular
                        value = inputCelular,
                        // Variavel de mudança de estado
                        onValueChange = { inputCelular = it },
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
                                text = "Celular",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "(DDD) 9XXXX-XXXX",
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
                                painter = painterResource(id = R.drawable.icon_phone),
                                contentDescription = "Ícone de Telefone"
                            )
                        })
                }

                Spacer(modifier = Modifier.height(40.dp))

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
                            navController.navigate("login")
                        },
                        colors = ButtonDefaults.buttonColors(
                            colorResource
                                (id = R.color.orange_button)
                        ),
                        elevation = ButtonDefaults.elevatedButtonElevation(6.dp),
                        border = BorderStroke(4.dp, colorResource(id = R.color.orange_text))
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Escolher Plano",
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
}

