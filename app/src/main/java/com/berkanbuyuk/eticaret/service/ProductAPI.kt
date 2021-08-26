package com.berkanbuyuk.eticaret.service

import com.berkanbuyuk.eticaret.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductAPI {
    @GET("atilsamancioglu/BTK23-DataSet/main/products.json")
    suspend fun getData() : Response<List<Product>>
}