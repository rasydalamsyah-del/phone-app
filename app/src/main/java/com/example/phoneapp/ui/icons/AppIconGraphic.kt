package com.example.phoneapp.ui.icons

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

/**
 * Ikon-ikon vector original (digambar manual lewat Canvas, bukan gambar/file dari
 * aplikasi lain) untuk merepresentasikan tiap "aplikasi" di home screen.
 */
@Composable
fun AppIconGraphic(iconId: String, tint: Color = Color.White, modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        when (iconId) {
            "chat_heart" -> {
                // Bubble chat dengan hati kecil di dalamnya
                val bubble = Path().apply {
                    moveTo(w * 0.15f, h * 0.25f)
                    lineTo(w * 0.85f, h * 0.25f)
                    quadraticBezierTo(w * 0.92f, h * 0.25f, w * 0.92f, h * 0.4f)
                    lineTo(w * 0.92f, h * 0.62f)
                    quadraticBezierTo(w * 0.92f, h * 0.77f, w * 0.85f, h * 0.77f)
                    lineTo(w * 0.4f, h * 0.77f)
                    lineTo(w * 0.25f, h * 0.92f)
                    lineTo(w * 0.28f, h * 0.77f)
                    lineTo(w * 0.15f, h * 0.77f)
                    quadraticBezierTo(w * 0.08f, h * 0.77f, w * 0.08f, h * 0.62f)
                    lineTo(w * 0.08f, h * 0.4f)
                    quadraticBezierTo(w * 0.08f, h * 0.25f, w * 0.15f, h * 0.25f)
                    close()
                }
                drawPath(bubble, color = tint)
            }
            "photo_stack" -> {
                drawRoundRect(
                    color = tint,
                    topLeft = Offset(w * 0.2f, h * 0.18f),
                    size = androidx.compose.ui.geometry.Size(w * 0.6f, h * 0.6f),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.06f)
                )
                drawCircle(color = tint.copy(alpha = 0.5f), radius = w * 0.06f, center = Offset(w * 0.35f, h * 0.33f))
            }
            "book" -> {
                val cover = Path().apply {
                    moveTo(w * 0.2f, h * 0.18f)
                    lineTo(w * 0.8f, h * 0.18f)
                    lineTo(w * 0.8f, h * 0.85f)
                    lineTo(w * 0.5f, h * 0.75f)
                    lineTo(w * 0.2f, h * 0.85f)
                    close()
                }
                drawPath(cover, color = tint)
            }
            "person" -> {
                drawCircle(color = tint, radius = w * 0.16f, center = Offset(w * 0.5f, h * 0.32f))
                val body = Path().apply {
                    moveTo(w * 0.25f, h * 0.85f)
                    quadraticBezierTo(w * 0.5f, h * 0.55f, w * 0.75f, h * 0.85f)
                    close()
                }
                drawPath(body, color = tint)
            }
            "camera" -> {
                drawRoundRect(
                    color = tint,
                    topLeft = Offset(w * 0.12f, h * 0.32f),
                    size = androidx.compose.ui.geometry.Size(w * 0.76f, h * 0.5f),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.08f)
                )
                drawRect(color = tint, topLeft = Offset(w * 0.38f, h * 0.2f), size = androidx.compose.ui.geometry.Size(w * 0.24f, h * 0.14f))
                drawCircle(color = Color.Black.copy(alpha = 0.35f), radius = w * 0.16f, center = Offset(w * 0.5f, h * 0.58f))
            }
            "calendar" -> {
                drawRoundRect(
                    color = tint,
                    topLeft = Offset(w * 0.16f, h * 0.2f),
                    size = androidx.compose.ui.geometry.Size(w * 0.68f, h * 0.62f),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.06f)
                )
                drawRect(color = Color.Black.copy(alpha = 0.25f), topLeft = Offset(w * 0.16f, h * 0.2f), size = androidx.compose.ui.geometry.Size(w * 0.68f, h * 0.14f))
                drawCircle(color = Color.Black.copy(alpha = 0.4f), radius = w * 0.04f, center = Offset(w * 0.6f, h * 0.55f))
            }
            "music_note" -> {
                drawCircle(color = tint, radius = w * 0.12f, center = Offset(w * 0.35f, h * 0.75f))
                drawCircle(color = tint, radius = w * 0.12f, center = Offset(w * 0.68f, h * 0.65f))
                drawRect(color = tint, topLeft = Offset(w * 0.45f, h * 0.18f), size = androidx.compose.ui.geometry.Size(w * 0.04f, h * 0.57f))
                drawRect(color = tint, topLeft = Offset(w * 0.45f, h * 0.18f), size = androidx.compose.ui.geometry.Size(w * 0.35f, h * 0.08f))
            }
            "folder" -> {
                val folder = Path().apply {
                    moveTo(w * 0.12f, h * 0.3f)
                    lineTo(w * 0.4f, h * 0.3f)
                    lineTo(w * 0.48f, h * 0.4f)
                    lineTo(w * 0.88f, h * 0.4f)
                    lineTo(w * 0.88f, h * 0.78f)
                    lineTo(w * 0.12f, h * 0.78f)
                    close()
                }
                drawPath(folder, color = tint)
            }
            "heart" -> {
                val heart = Path().apply {
                    moveTo(w * 0.5f, h * 0.82f)
                    cubicTo(w * 0.1f, h * 0.55f, w * 0.18f, h * 0.2f, w * 0.5f, h * 0.38f)
                    cubicTo(w * 0.82f, h * 0.2f, w * 0.9f, h * 0.55f, w * 0.5f, h * 0.82f)
                    close()
                }
                drawPath(heart, color = tint)
            }
            "notes" -> {
                drawRoundRect(
                    color = tint,
                    topLeft = Offset(w * 0.2f, h * 0.15f),
                    size = androidx.compose.ui.geometry.Size(w * 0.6f, h * 0.7f),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.05f)
                )
                for (i in 0..2) {
                    drawRect(
                        color = Color.Black.copy(alpha = 0.3f),
                        topLeft = Offset(w * 0.3f, h * (0.32f + i * 0.16f)),
                        size = androidx.compose.ui.geometry.Size(w * 0.4f, h * 0.05f)
                    )
                }
            }
            "sun" -> {
                drawCircle(color = tint, radius = w * 0.2f, center = Offset(w * 0.5f, h * 0.5f))
                for (i in 0 until 8) {
                    val angle = (i * 45f) * (Math.PI / 180f)
                    val startR = w * 0.3f
                    val endR = w * 0.42f
                    val cx = w * 0.5f
                    val cy = h * 0.5f
                    drawLine(
                        color = tint,
                        start = Offset(cx + (startR * kotlin.math.cos(angle)).toFloat(), cy + (startR * kotlin.math.sin(angle)).toFloat()),
                        end = Offset(cx + (endR * kotlin.math.cos(angle)).toFloat(), cy + (endR * kotlin.math.sin(angle)).toFloat()),
                        strokeWidth = w * 0.035f
                    )
                }
            }
            "pin" -> {
                val pin = Path().apply {
                    moveTo(w * 0.5f, h * 0.85f)
                    cubicTo(w * 0.2f, h * 0.55f, w * 0.2f, h * 0.25f, w * 0.5f, h * 0.18f)
                    cubicTo(w * 0.8f, h * 0.25f, w * 0.8f, h * 0.55f, w * 0.5f, h * 0.85f)
                    close()
                }
                drawPath(pin, color = tint)
                drawCircle(color = Color.Black.copy(alpha = 0.3f), radius = w * 0.08f, center = Offset(w * 0.5f, h * 0.4f))
            }
            "gear" -> {
                drawCircle(color = tint, radius = w * 0.22f, center = Offset(w * 0.5f, h * 0.5f), style = Stroke(width = w * 0.08f))
                drawCircle(color = tint, radius = w * 0.08f, center = Offset(w * 0.5f, h * 0.5f))
            }
            else -> {
                drawCircle(color = tint, radius = w * 0.25f, center = Offset(w * 0.5f, h * 0.5f))
            }
        }
    }
}
