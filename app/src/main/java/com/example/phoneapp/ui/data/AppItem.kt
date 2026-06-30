package com.example.phoneapp.ui.data

import androidx.compose.ui.graphics.Color

data class AppItem(
    val id: String,
    val label: String,
    val iconId: String,
    val backgroundColor: Color
)

val appList = listOf(
    AppItem("chat_her", "ChatHer", "chat_heart", Color(0xFF3D9BFF)),
    AppItem("memories", "Memories", "photo_stack", Color(0xFF2C2C2C)),
    AppItem("diary", "My Diary", "book", Color(0xFFD8C39A)),
    AppItem("contacts", "Contacts", "person", Color(0xFF3E5C5A)),
    AppItem("camera", "Camera", "camera", Color(0xFF707070)),
    AppItem("calendar", "Our Dates", "calendar", Color(0xFFE8763D)),
    AppItem("music", "Mood Music", "music_note", Color(0xFF9B59E0)),
    AppItem("settings", "Settings", "gear", Color(0xFF8A8A8A)),
    AppItem("storage", "Storage", "folder", Color(0xFF6FB7E8)),
    AppItem("favorites", "Favorites", "heart", Color(0xFFE85D8A)),
    AppItem("notes", "Notes", "notes", Color(0xFFB07D9E)),
    AppItem("weather", "Weather", "sun", Color(0xFF5DA3D9)),
    AppItem("map", "Where to Go", "pin", Color(0xFF4C8C6E))
)
