package com.nadiamagazine.geoquizcompose

import androidx.annotation.StringRes

data class Question(
    @StringRes val textResId: Int,
    val answer: Boolean
)
