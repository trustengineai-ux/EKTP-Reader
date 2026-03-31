package com.te.ktpreader.data.model

data class LivenessRequest(
    val image: String,
    val type: String = "motion"
)

data class LivenessResponse(
    val status: String,
    val message: String,
    val data: LivenessData?
)

data class LivenessData(
    val live: Boolean,
    val confidence: Float
)
