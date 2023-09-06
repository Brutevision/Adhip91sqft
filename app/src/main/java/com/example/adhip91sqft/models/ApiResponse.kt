package com.example.adhip91sqft.models

import com.google.gson.annotations.SerializedName

data class ApiResponse (
    @SerializedName("code"    ) var code    : Int?            = null,
    @SerializedName("message" ) var message : String?         = null,
    @SerializedName("success" ) var success : Boolean?        = null,
    @SerializedName("data"    ) var data    : ArrayList<Data> = arrayListOf(),
    @SerializedName("errors"  ) var errors  : String?         = null
)