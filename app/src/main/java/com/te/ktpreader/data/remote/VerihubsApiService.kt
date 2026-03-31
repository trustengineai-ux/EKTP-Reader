package com.te.ktpreader.data.remote

import com.te.ktpreader.data.model.FaceCompareRequest
import com.te.ktpreader.data.model.FaceCompareResponse
import com.te.ktpreader.data.model.LivenessRequest
import com.te.ktpreader.data.model.LivenessResponse
import com.te.ktpreader.data.model.DeepfakeRequest
import com.te.ktpreader.data.model.DeepfakeResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface VerihubsApiService {
    
    @POST("v1/face/compare")
    suspend fun compareFaces(
        @Header("Authorization") apiKey: String,
        @Body request: FaceCompareRequest
    ): Response<FaceCompareResponse>
    
    @POST("v1/face/liveness")
    suspend fun checkLiveness(
        @Header("Authorization") apiKey: String,
        @Body request: LivenessRequest
    ): Response<LivenessResponse>
    
    @POST("v1/face/deepfake")
    suspend fun detectDeepfake(
        @Header("Authorization") apiKey: String,
        @Body request: DeepfakeRequest
    ): Response<DeepfakeResponse>
}
