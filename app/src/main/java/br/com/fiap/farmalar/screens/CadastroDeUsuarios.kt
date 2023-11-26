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
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import br.com.fiap.farmalar.components.HeaderLogo
import br.com.fiap.farmalar.model.UsuarioDTO
import br.com.fiap.farmalar.service.RetrofitFactory
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

    var stringError by remember {
        mutableStateOf(false)
    }

    var inputData by remember {
        mutableStateOf("")
    }

    var sexoSelecionado by remember {
        mutableIntStateOf(0)
    }

    var inputSenha by remember {
        mutableStateOf("")
    }

    var inputConfirmarSenha by remember {
        mutableStateOf("")
    }

    var senhaError by remember {
        mutableStateOf(false)
    }

    val tamanhoSenha = 6

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

                // Titulo Cadastrar Usuário [0]
                Column {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        text = "Cadastrar Usuário",
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
                    Modifier.padding(horizontal = 12.dp, vertical = 5.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Nome Completo [1]
                {
                    OutlinedTextField(
                        // Valor do Input Nome
                        value = inputNome,
                        // Variavel de mudança de estado
                        onValueChange = { inputNome = it
                            if (inputNome.isNotEmpty()) stringError = false},
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
                    if (stringError) {
                        Text(
                            text = "Nome é obrigatório!",
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(x = (-18).dp, y = 5.dp),
                            color = colorResource(id = R.color.orange_text),
                            textAlign = TextAlign.End
                        )
                    }
                }

                // Coluna do Email [2]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 5.dp),
                    verticalArrangement = Arrangement.Center
                )
                // Input do Email [2]
                {
                OutlinedTextField(
                    // Valor do Input Email
                    value = inputEmail,
                    // Variavel de mudança de estado
                    onValueChange = { inputEmail = it
                        if (inputEmail.isNotEmpty()) stringError = false},
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
                    if (stringError) {
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

                // Coluna do Sexo [3]
                Column(modifier = Modifier.offset(y = (-5).dp)) {
                    // Input do Sexo [3]
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = sexoSelecionado == 0,
                            onClick = { sexoSelecionado = 0 },
                            modifier = Modifier.padding(16.dp),
                            colors = RadioButtonDefaults.colors(
                                colorResource(
                                    id = R.color.orange_button
                                )
                            ),
                        )
                        Text(
                            text = "Masculino",
                            modifier = Modifier.offset((-20).dp),
                            fontFamily = Inter,
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                            color = colorResource(id = R.color.titulo_cadastro_usuarios)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = sexoSelecionado == 1,
                                onClick = { sexoSelecionado = 1 },
                                modifier = Modifier.padding(16.dp),
                                colors = RadioButtonDefaults.colors(
                                    colorResource(
                                        id = R.color.orange_button
                                    )
                                ),
                            )
                            Text(
                                text = "Feminino",
                                modifier = Modifier.offset((-20).dp),
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                                fontSize = 16.sp,
                                color = colorResource(id = R.color.titulo_cadastro_usuarios)
                            )
                        }
                    }
                }

                // Coluna da Data de Nascimento
                Column(
                    Modifier
                        .padding(horizontal = 12.dp)
                        .offset(y = (-10).dp),
                    verticalArrangement = Arrangement.Center
                    // Input da Data de Nascimento
                ) {
                    OutlinedTextField(
                        // Valor do Input Data de Nascimento
                        value = inputData,
                        // Variavel de mudança de estado
                        onValueChange = { inputData = it
                            if (inputData.isNotEmpty()) stringError = false},
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
                                text = "Data de Nascimento",
                                fontSize = 18.sp,
                                fontFamily = Inter,
                                fontWeight = FontWeight.Medium,
                            )
                        },
                        placeholder = {
                            Text(
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Digite no formato: AAAA-MM-DD",
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
                    if (stringError) {
                        Text(
                            text = "Data de nascimento obrigatória!",
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(x = (-15).dp, y = 5.dp),
                            color = colorResource(id = R.color.orange_text),
                            textAlign = TextAlign.End
                        )
                    }
                }

                // Coluna da Senha
                Column(
                    Modifier
                        .padding(horizontal = 12.dp),
                    verticalArrangement = Arrangement.Center
                    // Input da Senha
                ) {
                    OutlinedTextField(
                        // Valor do Input Senha
                        value = inputSenha,
                        // Variavel de mudança de estado
                        onValueChange = { if (it.length <= tamanhoSenha) inputSenha = it
                            if (inputSenha.isNotEmpty()) senhaError = false
                        },
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
                                text = "Digite sua senha (máx. 6 dígitos)",
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

                // Coluna de Confirmar Senha [5]
                Column(
                    Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalArrangement = Arrangement.Center
                    // Input do Confirmar Senha [5]
                ) {
                    OutlinedTextField(
                        // Valor do Input Senha
                        value = inputConfirmarSenha,
                        // Variavel de mudança de estado
                        onValueChange = { if (it.length <= tamanhoSenha) inputConfirmarSenha = it
                            if (inputConfirmarSenha.isNotEmpty()) senhaError = false },
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
                                contentDescription = "Ícone de Cadeado de Senha"
                            )
                        }
                    )
                    if (senhaError) {
                        Text(
                            text = "Confirme sua senha!",
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(x = (-18).dp, y = 5.dp),
                            color = colorResource(id = R.color.orange_text),
                            textAlign = TextAlign.End
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

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
                            if (inputEmail.isEmpty())
                                stringError = true
                            if (inputSenha.isEmpty())
                                senhaError = true
                            val sexo = if (sexoSelecionado == 0) "MASCULINO" else "FEMININO"
                            val usuarioDTO = UsuarioDTO(
                                nome = inputNome, email = inputEmail,
                                                        dataNascimento = inputData,
                                                        senha = inputSenha,
                                                        sexo = sexo
                            )
                            salvaUsuario(usuarioDTO)
                            if (inputNome.isNotEmpty()
                                && inputEmail.isNotEmpty()
                                && inputSenha.isNotEmpty()
                                && inputConfirmarSenha.isNotEmpty()) {
                                navController.navigate("login")
                            }
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
                            text = "Cadastrar",
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


fun salvaUsuario(usuarioDTO: UsuarioDTO) {
    val retrofit = RetrofitFactory().getApiService()

    if (usuarioDTO.email.isNotBlank() && verificaSeUsuarioJaExiste(usuarioDTO.email) == null){
        val call = retrofit.cadastraUsuario(usuarioDTO)
        try {
            call.execute()
        }catch (exception: Exception){
            println(exception.stackTrace)
        }
    }
}

fun verificaSeUsuarioJaExiste(email: String): UsuarioDTO? {
    val call = RetrofitFactory().getApiService().buscaUsuarioPorEmail(email)
    var usuarioDTO: UsuarioDTO? = null
    try {
        usuarioDTO = call.execute().body()!!
    }catch (exception: Exception){
        println(exception.stackTrace)
    }

    return usuarioDTO
}