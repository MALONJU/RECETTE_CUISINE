package com.codingwithme.recipeapp.interfaces

import com.codingwithme.recipeapp.entities.Category
import com.codingwithme.recipeapp.entities.CategoryItems
import com.codingwithme.recipeapp.entities.Meal
import com.codingwithme.recipeapp.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("Categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("i") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("c") id: String): Call<MealResponse>


}