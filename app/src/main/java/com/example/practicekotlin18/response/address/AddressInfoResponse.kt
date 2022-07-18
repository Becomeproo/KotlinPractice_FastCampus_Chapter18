package com.example.practicekotlin18.response.address

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AddressInfoResponse(
    val addressInfo: AddressInfo
)