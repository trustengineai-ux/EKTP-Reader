package com.te.ktpreader.data.model

data class FaceCompareRequest(
    val image1: String,
    val image2: String
)

data class FaceCompareResponse(
    val status: String,
    val message: String,
    val data: CompareData?
)

data class CompareData(
    val similarity: Float,
    val threshold: Float,
    val match: Boolean
)
