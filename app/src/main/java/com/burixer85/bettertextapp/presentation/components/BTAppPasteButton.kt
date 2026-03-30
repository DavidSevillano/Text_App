package com.burixer85.bettertextapp.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.burixer85.bettertextapp.ui.theme.BorderGray
import com.burixer85.bettertextapp.ui.theme.SurfaceCard
import com.burixer85.bettertextapp.ui.theme.TextPrimary

@Composable
fun BTAppPasteButton(text: String, icon: ImageVector, modifier: Modifier = Modifier) {
    Button(
        onClick = { /* TODO */ },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = SurfaceCard),
        border = BorderStroke(1.dp, BorderGray)
    ) {
        Icon(icon, contentDescription = null, tint = TextPrimary)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text, color = TextPrimary)
    }
}