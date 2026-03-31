package com.te.ktpreader.data.model

data class DeepfakeRequest(
    val image: String
)

data class DeepfakeResponse(
    val status: String,
    val message: String,
    val data: DeepfakeData?
)

data class DeepfakeData(
    val isDeepfake: Boolean,
    val confidence: Float
)
