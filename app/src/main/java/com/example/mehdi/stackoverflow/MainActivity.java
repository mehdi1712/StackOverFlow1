package com.example.mehdi.stackoverflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mehdi.stackoverflow.Api.RetrofitFactory;
import com.example.mehdi.stackoverflow.Api.StackApiInterface;
import com.example.mehdi.stackoverflow.Pojos.Item;
import com.example.mehdi.stackoverflow.Pojos.Stack;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StackApiInterface stackApiInterface = RetrofitFactory.getRetrofit().create(StackApiInterface.class);
        Call<Stack> call  =stackApiInterface.getAllquestion();

            call.enqueue(new Callback<Stack>() {
                @Override
                public void onResponse(Call<Stack> call, Response<Stack> response) {

                    if(response.isSuccessful()){

                        List<Item> items =  response.body().getItems();

                            for (Item item :items){
                                Log.i("RETROFIT", item.getTitle());
                                Log.i("RETROFIT", item.getIsAnswered().toString());



                            }
                    }

                }

                @Override
                public void onFailure(Call<Stack> call, Throwable t) {

                }
            });

    }
}
