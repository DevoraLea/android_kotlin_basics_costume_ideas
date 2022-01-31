package com.example.costumeideas.model

import androidx.annotation.DrawableRes

data class Custume(
    val custumeName:String,
    @DrawableRes
    val custumeDrawbleId:Int,
    val accesoories:String)
