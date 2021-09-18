package com.peacecodes.recyclerviewkodecamp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Motivation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResouceId: Int
    )
