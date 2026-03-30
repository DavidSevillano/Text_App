package com.burixer85.bettertextapp.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.burixer85.bettertextapp.ui.theme.BorderGray
import com.burixer85.bettertextapp.ui.theme.NeonBlue
import com.burixer85.bettertextapp.ui.theme.SurfaceCard
import com.burixer85.bettertextapp.ui.theme.TextSecondary

@Composable
fun BTAppConsoleInput(
    text: String,
    onValueChange: (String) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text(
            text = "Consola de entrada",
            style = MaterialTheme.typography.labelSmall,
            color = TextSecondary,
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 4.dp)
        )
        OutlinedTextField(
            value = text,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = SurfaceCard,
                focusedContainerColor = SurfaceCard,
                unfocusedBorderColor = BorderGray,
                focusedBorderColor = NeonBlue
            ),
            placeholder = { Text("Introduce el texto aqui...", color = TextSecondary) }
        )
    }
}