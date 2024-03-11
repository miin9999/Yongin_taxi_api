package diy

import diy.models.Taxi_response
import diy.yongintaxiapi.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YonginTaxiService {

    @GET("driveStatistics?" +
            "serviceKey=${BuildConfig.api_key_of_taxi}")

    suspend fun getTaxi(
        @Query("year") year : Int,
        @Query("month") month : Int
    ):Response<Taxi_response>

}