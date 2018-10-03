package com.example.mehdi.stackoverflow.Api;

import com.example.mehdi.stackoverflow.Pojos.Stack;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StackApiInterface {



        @GET("questions?order=desc&sort=activity&site=stackoverflow")
            Call<Stack>getAllquestion();
}
