package com.example.readingdiary.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApiService {
    @GET("volumes")
    suspend fun getBookByISBN(@Query("q") isbn: String): Response<GoogleBooksResponse>
}