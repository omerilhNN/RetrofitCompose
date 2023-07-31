package service

import model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    //Base -> https://raw.githubusercontent.com/
    //atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Call<List<CryptoModel>>
}