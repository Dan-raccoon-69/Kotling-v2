package com.example.android

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Switch
import androidx.compose.material3.Text

import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.SpanStyle

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Components() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.LightGray.copy(alpha = 0.25f))
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){
            Column(modifier = Modifier.padding(4.dp)) {
                NewTextView()
                CustomDivider()
                NewTextField()
                CustomDivider()
                NewTextFieldOutlined()
                CustomDivider()
                NewImageView()
                CustomDivider()
                NewChip()
                CustomDivider()
                NewButton()
                CustomDivider()
                NewBadge()
                CustomDivider()
                NewChecks()
                CustomDivider()
                NewTextField()
                CustomDivider()
                NewTextFieldOutlined()
                NewImageView()
                CustomDivider()
                NewChip()
                CustomDivider()
                NewButton()
                CustomDivider()
                NewBadge()
                CustomDivider()
                NewChecks()
            }
        }
    }
}

@Composable
fun NewTextView(){
    Column {
        Text(
            text = "Jetpack Compose",
            color = Color.DarkGray,
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Magenta,
                    offset = Offset(2f, 2f),
                    blurRadius = 4f
                )
            )
        )
        Text(
            text = "Curso De Programación Móvil por el Dr. Ricardo Armando M.R. " +
                    "All reserved 2024. Este es un ejemplo de uso del componente Text",
            style = MaterialTheme.typography.bodySmall,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontWeight = FontWeight.ExtraBold,
                    fontStyle = FontStyle.Italic,
                    fontSize = 18.sp
                )
            ){
                append("Batman")
            }
            append(", Bruce Wayne")
        })
        Text(
            text = "Let's go to the next one.",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodySmall
        )
    }
}


@Composable
fun NewTextField() {
    var textValue by remember { mutableStateOf("Hola") }
    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = { Text(text = "Escribe algo") },
        modifier = Modifier.fillMaxWidth()
    )
}
@Composable
fun NewTextFieldOutlined() {
    var textValue by remember { mutableStateOf("") }
    OutlinedTextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = { Text(text = stringResource(id = R.string.ciclo)) },
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )
        var passwordValue by remember { mutableStateOf("") }
    OutlinedTextField(
        value = passwordValue,
        onValueChange = { passwordValue = it },
        label = { Text(text = "Contraseña") },
        visualTransformation = PasswordVisualTransformation(),
        trailingIcon = {
            if (passwordValue.isNotEmpty()) {
                Icon(
                    imageVector = Icons.Filled.Clear,
                    contentDescription = "Limpiar",
                    modifier = Modifier.clickable { passwordValue = "" })
            }
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun NewImageView() {
    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Image(
            painter = painterResource(R.drawable.img_android_ant),
            contentDescription = "Logo",
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Image(
            painter = painterResource(id = R.drawable.img_android_ant),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .aspectRatio(ratio = 4f / 3f)
        )
        Image(
            painter = painterResource(id = R.drawable.img_android_ant),
            contentDescription = "Logo",
            modifier = Modifier
                .size(80.dp)
                // .blur(radius = 8.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                //Imagen cicular censurada
                // .blur(radius = 8.dp,
                // edgeTreatment = BlurredEdgeTreatment(CircleShape)
                // La imagen de mantiene cuadrada pero redondea las esquinas
                .blur(
                    radius = 8.dp,
                    edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp))
                )
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewChip() {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        SuggestionChip(
            onClick = { Log.d("Suggestion chip", "hello world") },
            label = { Text(text = "Suggestion chip") }
        )
        AssistChip(
            onClick = { Log.d("Assist chip", "Hola Mundo") },
            label = { Text("Assist chip") },
            leadingIcon = { //Nos permite colocar un icono a la izquierda
                Icon(
                    imageVector = Icons.Filled.Settings,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(AssistChipDefaults.IconSize)
                )
            }
        )
        var selected by remember { mutableStateOf(false) }
        FilterChip(
            onClick = { selected = !selected },
            label = {
                Text(text = "Filter chip")
            },
            selected = selected,
            leadingIcon = if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }

            } else {
                null
            },
        )
    }
}

@Composable
fun NewButton() {
    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Button(onClick = {}) { Text(text = "Finish") }
        Button(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Close, contentDescription = null,
                modifier = Modifier.size(ButtonDefaults.IconSize))
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing)) //Coloca un espacio entre el icono y el texto
            Text(text = "Send")
        }
        OutlinedButton(onClick = { /*TODO*/ }) { Text(text = "Back") }
        TextButton(onClick = { /*TODO*/ }) { Text(text = "Exit") }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewBadge() {
    val badgeNumber = "5" // Define aquí el número de elementos en el badge

    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // BadgedBox para el carrito
        BadgedBox(badge = {
            Badge {
                Text(
                    text = badgeNumber,
                    modifier = Modifier.semantics {
                        contentDescription = "$badgeNumber items"
                    }
                )
            }
        }) {
            // Icono sobre el cual se coloca el badge o pequeña ilustración
            Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "Cart")
        }

        Spacer(modifier = Modifier.width(32.dp))

        // Botón para ver el carrito
        OutlinedButton(onClick = { /* TODO: Implement action */ }) {
            Text(text = "View Cart")
            BadgedBox(badge = {
                Badge {
                    Text(
                        text = badgeNumber,
                        modifier = Modifier.semantics {
                            contentDescription = "$badgeNumber items"
                        }
                    )
                }
            }) {
                Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "Cart")
            }
        }
    }
}


@Composable
fun NewChecks() { //Componentes booleanos
    Row(verticalAlignment = Alignment.CenterVertically){
//Requerimos de un estado para poder visualizar cual es el valor actual
        var isCheckboxChecked by remember { mutableStateOf(false) }
        Checkbox(checked = isCheckboxChecked, onCheckedChange = {isCheckboxChecked = it})
        Text(text = "Términos y condiciones")
        Spacer (modifier = Modifier.weight(1f))
        var isSwitchChecked by remember { mutableStateOf(true) }
        Text(text = "Anuncios")
        Switch(checked = isSwitchChecked, onCheckedChange = {isSwitchChecked = it})
    }
}
@Composable
fun CustomDivider() {
    Spacer(modifier = Modifier.height(8.dp))
    Divider(Modifier.fillMaxWidth())
    Spacer(modifier = Modifier.height(16.dp))
}











