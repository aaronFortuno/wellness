package aaronfortuno.ioc.k11_wellness.model

import aaronfortuno.ioc.k11_wellness.R
import aaronfortuno.ioc.k11_wellness.data.Sentence
import aaronfortuno.ioc.k11_wellness.ui.theme.K11WellnessTheme
import aaronfortuno.ioc.k11_wellness.ui.theme.Shapes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SentenceCard(
    sentence: Sentence,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier,
        shape = Shapes.extraSmall,
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        onClick = {
            expanded = !expanded
        }
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMediumLow
                    )
                )
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            Text(
                text = stringResource(R.string.day) + " " + sentence.sentenceDay,
                style = MaterialTheme.typography.displayLarge
            )
            Text(
                text = stringResource(sentence.sentenceTitleRes),
                style = MaterialTheme.typography.headlineLarge
            )
            Image(
                painter = painterResource(sentence.sentenceImageRes),
                contentDescription = null,
                modifier = modifier
                    .padding(top = 8.dp)
            )
            if (expanded) {
                //Spacer(modifier = modifier.height(8.dp))
                Text(
                    text = stringResource(sentence.sentenceDetailRes)
                )

            }

        }
    }
}

val exampleCard = Sentence(
    R.string.sentence_title_1,
    R.string.sentence_detail_1,
    R.drawable.lake,
    1
)


@Preview
@Composable
fun SentenceCardLightPreview() {
    K11WellnessTheme(darkTheme = false) {
        SentenceCard(exampleCard)
    }
}

@Preview
@Composable
fun SentenceCardDarkPreview() {
    K11WellnessTheme(darkTheme = true) {
        SentenceCard(exampleCard)
    }
}