package diy.models


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("arrivalCount")
    var arrivalCount: Int?,
    @SerializedName("cityDo")
    var cityDo: String?,
    @SerializedName("eupMyunDong")
    var eupMyunDong: String?,
    @SerializedName("matchedCount")
    var matchedCount: Int?,
    @SerializedName("no")
    var no: Int?,
    @SerializedName("requestCount")
    var requestCount: Int?,
    @SerializedName("siGunGu")
    var siGunGu: String?
)