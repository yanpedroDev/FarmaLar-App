package br.com.fiap.farmalar.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.ui.theme.Inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroDeUsuarios(navController: NavController) {

    var inputNome by remember {
        mutableStateOf("")
    }

    var inputEmail by remember {
        mutableStateOf("")
    }

    var inputData by remember {
        mutableStateOf("")
    }

    var inputSenha by remember {
        mutableStateOf("")
    }

    var inputConfirmarSenha by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            HeaderLogo()

            Spacer(modifier = Modifier.padding(vertical = 4.dp))

            Column {


                // Titulo Criar Conta
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    text = "Criar Conta",
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontFamily = Inter,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.titulo_cadastro_usuarios)
                    )
                )


                // Coluna do Nome Completo
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
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
                                text = "Nome Completo",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite seu nome completo",
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
                    Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Email
                {
                    OutlinedTextField(
                        // Valor do Input Email
                        value = inputEmail,
                        // Variavel de mudança de estado
                        onValueChange = { inputEmail = it },
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
                                text = "Email",
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

                // Coluna do Genero
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Genero
                {
                    OutlinedTextField(
                        // Valor do Input Email
                        value = inputEmail,
                        // Variavel de mudança de estado
                        onValueChange = { inputEmail = it },
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
                                text = "Gênero",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "",
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
                                painter = painterResource(id = R.drawable.input_gender),
                                contentDescription = "Ícone de Email"
                            )
                        })
                }

                // Coluna da Data de Nascimento
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.Center
                // Input da Data de Nascimento
                ) {
                    OutlinedTextField(
                        // Valor do Input Data de Nascimento
                        value = inputData,
                        // Variavel de mudança de estado
                        onValueChange = { inputData = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
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
                                text = "Data de Nascimento",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite sua data de nascimento",
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

                // Coluna da Senha
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.Center
                    // Input da Senha
                ) {
                    OutlinedTextField(
                        // Valor do Input Senha
                        value = inputSenha,
                        // Variavel de mudança de estado
                        onValueChange = { inputSenha = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword),
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
                                contentDescription = "Ícone de Email"
                            )
                        }
                    )
                }

                // Coluna de Confirmar Senha
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.Center
                    // Input do Confirmar Senha
                ) {
                    OutlinedTextField(
                        // Valor do Input Senha
                        value = inputConfirmarSenha,
                        // Variavel de mudança de estado
                        onValueChange = { inputConfirmarSenha = it },
                        shape = RoundedCornerShape(size = 20.dp),
                        modifier = Modifier.size(325.dp, 60.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword),
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
                                contentDescription = "Ícone de Email"
                            )
                        }
                    )
                }

            }
        }
    }
}