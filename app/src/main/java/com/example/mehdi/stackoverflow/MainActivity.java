package com.example.mehdi.stackoverflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;
//import com.crashlytics.android.Crashlytics;
import com.example.mehdi.stackoverflow.Adapter.StackOverFlowAdapter;
import com.example.mehdi.stackoverflow.Adapter.stackOverFlowAdapter1;
import com.example.mehdi.stackoverflow.Api.RetrofitFactory;
import com.example.mehdi.stackoverflow.Api.StackApiInterface;
import com.example.mehdi.stackoverflow.Pojos.Item;
import com.example.mehdi.stackoverflow.Pojos.Stack;

import java.util.ArrayList;
import java.util.List;

import io.fabric.sdk.android.Fabric;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private  RecyclerView recyclerView;
    private List <Stack> StackList;
    private StackOverFlowAdapter stackOverFlowAdapter;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Fabric.with(this, new Crashlytics());
        Crashlytics.log("Start logging!");

        Crashlytics.setUserIdentifier("id-99999");
        Crashlytics.setUserName("FirebaseThailand");
        Crashlytics.setUserEmail("firebasethailand@gmail.com");

        Crashlytics.setString("key1", "value1");
        Crashlytics.setBool("key2", true);
        Crashlytics.setDouble("key3", 99.99);
        Crashlytics.setFloat("key4", 999.99f);
        Crashlytics.setInt("key5", 999);
        Crashlytics.setLong("key6", System.currentTimeMillis());






    //  int m = 1/0;

        StackApiInterface stackApiInterface = RetrofitFactory.getRetrofit().create(StackApiInterface.class);
        Call<Stack> call  =stackApiInterface.getAllquestion();

            call.enqueue(new Callback<Stack>() {
                @Override
                public void onResponse(Call<Stack> call, Response<Stack> response) {

                    if(response.isSuccessful()){

                       List<Item> item =  response.body().getItems();

                        initRecycler(item);
                    }

                }

                @Override
                public void onFailure(Call<Stack> call, Throwable t) {


                    Toast.makeText(MainActivity.this, "error in connection", Toast.LENGTH_SHORT).show();
                }
            });

    }

    private void logUser() {
        // TODO: Use the current user's information
        // You can call any combination of these three methods
        Crashlytics.setUserIdentifier("12345");
        Crashlytics.setUserEmail("user@fabric.io");
        Crashlytics.setUserName("Test User");
    }
    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }

    public void initRecycler(List<Item> items){

        recyclerView= findViewById(R.id.RecyclerView);
      //  StackList = new ArrayList<>();
        stackOverFlowAdapter = new StackOverFlowAdapter(this, items);
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(stackOverFlowAdapter);
        stackOverFlowAdapter.notifyDataSetChanged();
        recyclerView.setLayoutManager(linearLayoutManager);
      recyclerView.setItemAnimator(new DefaultItemAnimator());


    }
}
