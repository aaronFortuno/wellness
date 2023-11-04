package aaronfortuno.ioc.k11_wellness.model

import aaronfortuno.ioc.k11_wellness.ui.theme.K11WellnessTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SentenceCard() {

}

@Preview
@Composable
fun SentenceCardLightPreview() {
    K11WellnessTheme(darkTheme = true) {
        SentenceCard()
    }
}

@Preview
@Composable
fun SentenceCardDarkPreview() {
    K11WellnessTheme(darkTheme = false) {
        SentenceCard()
    }
}