package com.msaitodev.mhsw.humanmed.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.msaitodev.core.common.ui.LocalAppColors
import com.msaitodev.core.common.ui.AppColors

private val LightColorScheme = lightColorScheme(
    primary = BrandPrimary,
    secondary = BrandSecondary,
    tertiary = BrandTertiary,
    background = AppBackground,
    surface = AppBackground,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.Black,
    onBackground = Color(0xFF4E342E), // Brown 800 (オレンジ系と調和)
    onSurface = Color(0xFF4E342E),    // Brown 800
)

private val DarkColorScheme = darkColorScheme(
    primary = BrandPrimaryDark,
    secondary = BrandSecondaryDark,
    tertiary = BrandTertiaryDark,
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
)

// アプリケーション用のセマンティックカラー定義（ライトモード用）
// 正解色は一般的な緑(Green 700)に調整
private val LightAppColors = AppColors(
    correctBorder = Color(0xFF388E3C),
    correctBackground = Color(0xFFE8F5E9),
    wrongBorder = Color(0xFFD32F2F),
    wrongBackground = Color(0xFFFFEBEE),
    selectedBackground = Color(0xFFE5E5E5)
)

// アプリケーション用のセマンティックカラー定義（ダークモード用）
private val DarkAppColors = AppColors(
    correctBorder = Color(0xFF4CAF50),
    correctBackground = Color(0xFF1B5E20),
    wrongBorder = Color(0xFFF44336),
    wrongBackground = Color(0xFFB71C1C),
    selectedBackground = Color(0xFF4A5568)
)

@Composable
fun MhswTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val appColors = if (darkTheme) DarkAppColors else LightAppColors

    CompositionLocalProvider(
        LocalAppColors provides appColors
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}
