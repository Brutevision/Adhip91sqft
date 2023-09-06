package com.example.adhip91sqft.models

data class Data(
    val comment_count: Int,
    val file: String,
    val file_size: Double,
    val id: String,
    val name: String,
    val section: String,
    val status: Int,
    val tags: List<Tag>,
    val type: String,
    val uploaded_at: String,
    val uploaded_by: UploadedBy,
    val version: Int
)

data class UploadedBy(
    val id: String,
    val name: String,
    val organization_name: String,
    val photo: String
)

data class Tag(
    val id: String,
    val name: String
)