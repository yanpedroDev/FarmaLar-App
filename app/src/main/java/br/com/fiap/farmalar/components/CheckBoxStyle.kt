package br.com.fiap.farmalar.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.farmalar.R
import br.com.fiap.farmalar.ui.theme.Inter

@Composable
fun CheckBoxStyle(
    text1: String,
    text2: String
) {

    var patologia_first_column by remember {
        mutableStateOf(false)
    }


    var patologia_second_column by remember {
        mutableStateOf(false)
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    )

    {

        Checkbox(
            checked = patologia_first_column,
            onCheckedChange = {
                    isSelected -> patologia_first_column = isSelected
            },
            colors = CheckboxDefaults.colors(
                uncheckedColor = colorResource(id = R.color.light_gray),
                checkedColor = colorResource(id = R.color.orange_button),
                checkmarkColor = colorResource(id = R.color.white)
            )
        )

        Text(
            modifier = Modifier.offset((-5).dp),
            text = text1,
            textAlign = TextAlign.Start,
            fontSize = 16.sp,
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.padding(12.dp))

        Checkbox(
            checked = patologia_second_column,
            onCheckedChange = {
                    isSelected -> patologia_second_column = isSelected
            },
            colors = CheckboxDefaults.colors(
                uncheckedColor = colorResource(id = R.color.light_gray),
                checkedColor = colorResource(id = R.color.orange_button),
                checkmarkColor = colorResource(id = R.color.white)
            )
        )

        Text(
            modifier = Modifier.offset((-5).dp),
            text = text2,
            fontSize = 16.sp,
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold
        )

    }

}

