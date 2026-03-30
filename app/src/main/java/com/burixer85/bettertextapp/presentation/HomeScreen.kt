package com.burixer85.bettertextapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Assignment
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Dns
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material.icons.filled.SettingsSuggest
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.burixer85.bettertextapp.presentation.components.BTAppActionButton
import com.burixer85.bettertextapp.presentation.components.BTAppConsoleInput
import com.burixer85.bettertextapp.presentation.components.BTAppPasteButton
import com.burixer85.bettertextapp.ui.theme.NeonBlue
import com.burixer85.bettertextapp.ui.theme.SurfaceCard
import com.burixer85.bettertextapp.ui.theme.TextPrimary
import com.burixer85.bettertextapp.ui.theme.TextSecondary

@Composable
fun HomeScreen() {
    var inputText by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background,
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(SurfaceCard),
                contentAlignment = Alignment.Center
            ) {
                Text("Zona del ad banner", color = TextSecondary, style = MaterialTheme.typography.labelSmall)
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {  },
                containerColor = NeonBlue,
                contentColor = Color.White,
                shape = CircleShape,
                modifier = Modifier.size(64.dp).padding(bottom = 70.dp)
            ) {
                Icon(Icons.Default.CameraAlt, contentDescription = "Scan")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Better Text App",
                style = MaterialTheme.typography.headlineSmall,
                color = TextPrimary,
                modifier = Modifier.padding(top = 24.dp)
            )

            BTAppConsoleInput(
                text = inputText,
                onValueChange = { inputText = it }
            )

            BTAppPasteButton(
                text = "Pegar del portapapeles",
                icon = Icons.Default.Assignment,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            val actions = listOf(
                "Feature 1" to Icons.Default.SettingsSuggest,
                "Feature 2" to Icons.Default.Email,
                "Feature 3" to Icons.Default.BarChart,
                "Feature 4" to Icons.Default.Code,
                "Feature 5" to Icons.Default.Dns,
                "Feature 6" to Icons.Default.RemoveRedEye
            )

            FlowRow(
                modifier = Modifier.padding(horizontal = 8.dp),
                maxItemsInEachRow = 2,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                actions.forEach { (title, icon) ->
                    BTAppActionButton(
                        title = title,
                        icon = icon,
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}