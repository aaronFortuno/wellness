package aaronfortuno.ioc.k11_wellness.data

import aaronfortuno.ioc.k11_wellness.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Sentence(
    @StringRes val sentenceTitleRes: Int,
    @StringRes val sentenceDetailRes: Int,
    @DrawableRes val sentenceImageRes: Int,
    val sentenceDay: Int
)

val sentences = listOf(
    Sentence(R.string.sentence_title_1, R.string.sentence_detail_1,R.drawable.lake,1),
    Sentence(R.string.sentence_title_2, R.string.sentence_detail_2,R.drawable.bifurcation,2),
    Sentence(R.string.sentence_title_3, R.string.sentence_detail_3,R.drawable.growing,3),
    Sentence(R.string.sentence_title_4, R.string.sentence_detail_4,R.drawable.writing,4),
    Sentence(R.string.sentence_title_5, R.string.sentence_detail_5,R.drawable.working,5)

)