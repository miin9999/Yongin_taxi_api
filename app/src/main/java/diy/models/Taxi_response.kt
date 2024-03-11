package diy.models


import com.google.gson.annotations.SerializedName

data class Taxi_response(
    @SerializedName("items")
    var items: List<Item?>?,
    @SerializedName("resultCode")
    var resultCode: Int?,
    @SerializedName("resultMsg")
    var resultMsg: String?,
    @SerializedName("totalCount")
    var totalCount: Int?
)