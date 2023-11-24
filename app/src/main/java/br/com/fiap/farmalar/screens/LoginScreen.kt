package br.com.fiap.farmalar.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.ui.theme.Inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {

    var inputEmail by remember {
        mutableStateOf("")
    }

    var emailError by remember {
        mutableStateOf(false)
    }

    var inputSenha by remember {
        mutableStateOf("")
    }

    var senhaError by remember {
        mutableStateOf(false)
    }

    var tamanhoSenha = 6

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
    }
    Column()
    {
        Spacer(modifier = Modifier.height(80.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier.size(300.dp, 70.dp),
                painter = painterResource(id = R.drawable.farmalar_logo),
                contentDescription = "Logo da FarmaLar"
            )
        }

        Spacer(modifier = Modifier.height(60.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        ) {
            Text(
                textAlign = TextAlign.Left,
                text = "Olá,",
                fontFamily = Inter,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        ) {
            Text(
                textAlign = TextAlign.Left,
                text = "Bem-vindo de volta!",
                fontFamily = Inter,
                fontSize = 26.sp,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.black)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Coluna do Email 
        Column(
            Modifier.padding(horizontal = 12.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.Center
        )
        // Input do Email 
        {
            OutlinedTextField(
                // Valor do Input Email
                value = inputEmail,
                // Variavel de mudança de estado
                onValueChange = { inputEmail = it
                                if (inputEmail.length > 0) emailError = false},
                shape = RoundedCornerShape(size = 20.dp),
                modifier = Modifier.size(325.dp, 60.dp),
                isError = emailError,
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
                        modifier = Modifier
                            .padding(horizontal = 2.dp),
                        text = "E-mail",
                        fontSize = 20.sp,
                        fontFamily = Inter,
                        fontWeight = FontWeight.Medium,
                    )
                },
                placeholder = {
                    Text(
                        modifier = Modifier.padding(horizontal = 4.dp),
                        text = "Digite seu e-mail",
                        fontSize = 16.sp,
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
            if (emailError) {
                Text(
                    text = "E-mail é obrigatório!",
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = (-18).dp, y = 5.dp),
                    color = colorResource(id = R.color.orange_text),
                    textAlign = TextAlign.End
                )
            }
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
                onValueChange = { if (it.length <= tamanhoSenha) inputSenha = it
                                  if (inputSenha.length > 0) senhaError = false
                },
                shape = RoundedCornerShape(size = 20.dp),
                modifier = Modifier.size(325.dp, 60.dp),
                isError = senhaError,
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
                        fontSize = 20.sp,
                        fontFamily = Inter,
                        fontWeight = FontWeight.Medium,
                    )
                },
                placeholder = {
                    Text(
                        modifier = Modifier.padding(horizontal = 4.dp),
                        text = "Digite sua senha",
                        fontSize = 16.sp,
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
            if (senhaError) {
                Text(
                    text = "Senha é obrigatória!",
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = (-18).dp, y = 5.dp),
                    color = colorResource(id = R.color.orange_text),
                    textAlign = TextAlign.End
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                modifier = Modifier.size(325.dp, 65.dp),
                onClick = {
                    if (inputEmail.isEmpty())
                        emailError = true
                    if (inputEmail.isNotEmpty()) {
                        (navController.navigate("menu"))
                    }
                    if (inputSenha.isEmpty())
                        senhaError = true
                    if (inputSenha.isNotEmpty()) {
                        (navController.navigate("menu"))
                    }

                },
                colors = ButtonDefaults.buttonColors(
                    colorResource
                        (id = R.color.orange_button)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(4.dp),
                border = BorderStroke(2.dp, colorResource(id = R.color.orange_text))
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Entrar",
                    textAlign = TextAlign.Center,
                    fontFamily = Inter,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.white)
                )
            }
        }

        Spacer(modifier = Modifier.height(105.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                modifier = Modifier.size(200.dp, 50.dp),
                onClick = {
                    navController.navigate("boas-vindas")
                },
                colors = ButtonDefaults.buttonColors(
                    colorResource
                        (id = R.color.white)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(4.dp),
                border = BorderStroke(2.dp, colorResource(id = R.color.orange_text))
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Voltar",
                    textAlign = TextAlign.Center,
                    fontFamily = Inter,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.orange_text)
                )
            }
        }

    }
}