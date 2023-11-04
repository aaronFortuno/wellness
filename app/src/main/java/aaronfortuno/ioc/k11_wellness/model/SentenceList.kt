package aaronfortuno.ioc.k11_wellness.model

import aaronfortuno.ioc.k11_wellness.R
import aaronfortuno.ioc.k11_wellness.data.sentences
import aaronfortuno.ioc.k11_wellness.ui.theme.K11WellnessTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SentenceList() {
    LazyColumn() {
        items(sentences) {
            SentenceCard(
                sentence = it,
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
                )
        }
    }
}

@Preview
@Composable
fun SentenceListLightPreview() {
    K11WellnessTheme(darkTheme = false) {
        SentenceList()
    }
}

@Preview
@Composable
fun SentenceListDarkPreview() {
    K11WellnessTheme(darkTheme = true) {
        SentenceList()
    }
}