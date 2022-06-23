package uz.musofirlar.musofirlaruz.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import uz.musofirlar.musofirlaruz.R

data class ViewPagerData(
    @DrawableRes
    val headImage:Int,
    @StringRes
    val desc1:Int,
    @StringRes
    val desc2:Int


)