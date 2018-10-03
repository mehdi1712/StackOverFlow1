package com.example.mehdi.stackoverflow.Api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//this class return object from retrofit
public class RetrofitFactory {


    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";
    public static Retrofit retrofit =null;

    public static Retrofit getRetrofit() {

       if(retrofit == null){

           retrofit=new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                    .build();
       }
       return retrofit;
    }

}
