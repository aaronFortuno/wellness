package aaronfortuno.ioc.k11_wellness.ui.theme

import aaronfortuno.ioc.k11_wellness.R
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Agbalumo = FontFamily(
    Font(R.font.agbalumo_regular)
)

val Quicksand = FontFamily(
    Font(R.font.quicksand_light)
)

val Dosis = FontFamily(
    Font(R.font.dosis_light)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Agbalumo,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp

    ),
    headlineLarge = TextStyle(
        fontFamily = Quicksand,
        fontWeight = FontWeight.Light,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Dosis,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)