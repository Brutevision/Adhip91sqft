package com.example.adhip91sqft.models

import com.google.gson.annotations.SerializedName

data class UploadedBy(
    @SerializedName("id"                ) var id               : String? = null,
    @SerializedName("name"              ) var name             : String? = null,
    @SerializedName("photo"             ) var photo            : String? = null,
    @SerializedName("organization_name" ) var organizationName : String? = null
)
