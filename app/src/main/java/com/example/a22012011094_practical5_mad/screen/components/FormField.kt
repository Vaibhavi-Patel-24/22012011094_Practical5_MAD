package com.example.a22012011094_practical5_mad.screen.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.testing.TestNavHostController
import com.example.a22012011094_practical5_mad.screen.RegistrationScreen
import com.example.a22012011094_practical5_mad.ui.theme._22012011094_Practical5_MADTheme


@Composable
fun FormField(label: String, textState: String, onTextChange:(String)-> Unit,isPassword: Boolean = false, isNumber:Boolean = false){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = label,
            fontSize = 18.sp,
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        )
        if(isNumber){
            OutlinedTextField(
                label = { Text("Enter $label")},
                placeholder = { Text("Enter $label")},
                value = textState,
                onValueChange = onTextChange,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .weight(2f),
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                keyboardOptions = KeyboardOptions(keyboardType =  KeyboardType.Number),
                visualTransformation = VisualTransformation.None
            )
        }
        else{
            OutlinedTextField(
                label = {Text("Enter $label")},
                placeholder =  {Text("Enter $label")},
                value = textState,
                onValueChange = {
                        newValue ->
                    if(newValue.all{it.isDigit()}){
                        onTextChange(newValue)
                    }
                },
                modifier = Modifier
                    .padding(end = 16.dp)
                    .weight(2f),
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                visualTransformation =
                if (isPassword)
                    PasswordVisualTransformation()
                else
                    VisualTransformation.None

            )
        }
    }


}
@Preview
@Composable
fun FormFieldPreview(){
    _22012011094_Practical5_MADTheme {

        FormField(label = "hello", textState = "hello" , onTextChange = {"hello"})
    }
}