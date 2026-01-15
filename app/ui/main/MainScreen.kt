package com.yourname.fastshare.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(
    onSendClick: () -> Unit = {},
    onReceiveClick: () -> Unit = {}
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F7)) // светлый фон
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(80.dp))

            // Заголовок приложения
            Text(
                text = "FastShare",
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Подзаголовок
            Text(
                text = "Local file transfer",
                fontSize = 16.sp,
                color = Color(0xFF6E6E73)
            )

            Spacer(modifier = Modifier.height(80.dp))

            // Кнопка "Отправить файл"
            ActionButton(
                title = "Send file",
                subtitle = "Share to phone or computer",
                onClick = onSendClick
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Кнопка "Принять файл"
            ActionButton(
                title = "Receive file",
                subtitle = "Receive from nearby device",
                onClick = onReceiveClick
            )

            Spacer(modifier = Modifier.weight(1f))

            // Слоган внизу
            Text(
                text = "Fast • Secure • No Internet",
                fontSize = 14.sp,
                color = Color(0xFF8E8E93),
                modifier = Modifier.padding(bottom = 24.dp)
            )
        }
    }
}

@Composable
private fun ActionButton(
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
        shape = RoundedCornerShape(20.dp),
        color = Color.White,
        shadowElevation = 8.dp,
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = subtitle,
                fontSize = 14.sp,
                color = Color(0xFF6E6E73)
            )
        }
    }
}
