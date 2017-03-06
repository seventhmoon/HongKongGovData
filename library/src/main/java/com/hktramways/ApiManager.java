package com.hktramways;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by fung on 3/4/2017.
 */

public class ApiManager {


    private static final String API_BASE_URL = "https://www.com.hktramways.hktramways.com/";



    public static TramwaysApiService getTramwaysService(OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        return retrofit.create(TramwaysApiService.class);

    }



    public static TramwaysApiService getTramwaysService(){

        return getTramwaysService(new OkHttpClient());

    }


}
