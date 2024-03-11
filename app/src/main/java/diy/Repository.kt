package diy

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Repository {


    //todo 메인에서 끌어다 쓸 함수

    suspend fun getTaxiInfo(year:Int, month: Int) :String =
        retrofit2.getTaxi(year,month)
            .body()
            ?.items
            ?.firstOrNull()
            ?.no.toString()


    //todo 레트로핏 빌더


    private val retrofit2 : YonginTaxiService by lazy{
        Retrofit.Builder()
            .baseUrl(Url.TAXI_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }


}