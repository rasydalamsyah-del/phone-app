package com.example.phoneapp.ui.data

import androidx.compose.ui.graphics.Color

data class AppItem(
    val id: String,
    val label: String,
    val emoji: String,
    val backgroundColor: Color
)

val appList = listOf(
    AppItem("creator_hub", "Creator Hub", "\uD83C\uDFA8", Color(0xFF2B2B2B)),
    AppItem("marketplace", "Marketplace", "\uD83D\uDED2", Color(0xFFE05B4F)),
    AppItem("voice_chat", "Voice Chat", "\uD83C\uDFA4", Color(0xFF5865F2)),
    AppItem("camera", "Camera", "\uD83D\uDCF7", Color(0xFF707070)),
    AppItem("contacts", "Contacts", "\uD83D\uDC64", Color(0xFF3E5C5A)),
    AppItem("messages", "Messages", "\uD83D\uDCAC", Color(0xFF3D9BFF)),
    AppItem("gallery", "Gallery", "\uD83D\uDDBC\uFE0F", Color(0xFF2C2C2C)),
    AppItem("settings", "Settings", "\u2699\uFE0F", Color(0xFF8A8A8A)),
    AppItem("storage", "Storage", "\uD83D\uDCC1", Color(0xFF6FB7E8)),
    AppItem("video", "Video Feed", "\u25B6\uFE0F", Color(0xFFE8763D)),
    AppItem("favorites", "Favorites", "\u2764\uFE0F", Color(0xFFE85D8A)),
    AppItem("notes", "Notes", "\uD83D\uDCDD", Color(0xFFD8C39A)),
    AppItem("stream", "Live Stream", "\uD83D\uDCFA", Color(0xFF9B59E0))
)
