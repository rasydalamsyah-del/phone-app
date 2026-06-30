package com.example.phoneapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColors = darkColorScheme(
    primary = SunsetOrange,
    secondary = SunsetAmber,
    background = SkyDarkTop,
    surface = SkyDarkMid
)

@Composable
fun PhoneAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColors,
        typography = Typography,
        content = content
    )
}
