package com.example.phoneapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phoneapp.ui.data.AppItem
import com.example.phoneapp.ui.data.appList
import com.example.phoneapp.ui.theme.*

@Composable
fun HomeScreen(onAppClick: (String) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(SkyDarkTop, SkyDarkMid, SunsetOrange, SunsetAmber)
                )
            )
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            StatusBar()
            Spacer(modifier = Modifier.height(16.dp))
            AppGrid(
                apps = appList,
                onAppClick = onAppClick,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 20.dp)
            )
        }
    }
}

@Composable
private fun StatusBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 14.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "11.52 PM \u2022 Monday",
            color = StatusBarWhite,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(Icons.Filled.Star, contentDescription = "Wifi", tint = StatusBarWhite, modifier = Modifier.size(16.dp))
            Icon(Icons.Filled.Notifications, contentDescription = "Signal", tint = StatusBarWhite, modifier = Modifier.size(16.dp))
            Text(text = "81%", color = StatusBarWhite, fontSize = 13.sp)
        }
    }
}

@Composable
private fun AppGrid(
    apps: List<AppItem>,
    onAppClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(4),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        items(apps) { app ->
            AppIcon(app = app, onClick = { onAppClick(app.id) })
        }
    }
}

@Composable
private fun AppIcon(app: AppItem, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable { onClick() }
            .padding(4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(app.backgroundColor),
            contentAlignment = Alignment.Center
        ) {
            Text(text = app.emoji, fontSize = 24.sp)
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = app.label,
            color = IconLabelWhite,
            fontSize = 11.sp,
            textAlign = TextAlign.Center,
            maxLines = 1,
            modifier = Modifier.width(64.dp)
        )
    }
}
