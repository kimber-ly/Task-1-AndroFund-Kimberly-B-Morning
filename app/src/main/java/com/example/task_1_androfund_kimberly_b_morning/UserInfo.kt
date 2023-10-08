package com.example.task_1_androfund_kimberly_b_morning

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserInfo(
    val username: String,
    val password: String
):Parcelable
