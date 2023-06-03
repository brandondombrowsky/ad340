package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Captions(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)