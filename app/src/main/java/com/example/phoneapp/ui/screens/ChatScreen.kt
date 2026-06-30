package com.example.phoneapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phoneapp.ui.theme.SkyDarkTop
import com.example.phoneapp.ui.theme.IconLabelWhite

@Composable
fun ChatScreen(appId: String, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SkyDarkTop)
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = onBack) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Kembali", tint = IconLabelWhite)
            }
            Text(text = "Aplikasi: $appId", color = IconLabelWhite, fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Halaman ini masih placeholder.\nNanti kita isi dengan fitur chat di sini.",
            color = Color(0xFFBBBBBB),
            fontSize = 14.sp
        )
    }
}
