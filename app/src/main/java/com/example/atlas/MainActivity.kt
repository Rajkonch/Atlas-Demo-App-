package com.example.atlas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import com.example.atlas.presentation.navigation.AtlasNavHost
import com.example.atlas.presentation.theme.AtlasTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { AppContent() }
    }
}

@Composable
private fun AppContent() {
    AtlasTheme {
        val systemUiController = rememberSystemUiController()
        val bg = MaterialTheme.colorScheme.background

        SideEffect {
            systemUiController.setSystemBarsColor(bg, darkIcons = true)
        }

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = bg
        ) {
            AtlasNavHost()
        }
    }
}
