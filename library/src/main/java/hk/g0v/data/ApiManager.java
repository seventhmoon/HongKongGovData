package hk.g0v.data;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fung on 3/4/2017.
 */
@Deprecated
public class ApiManager {


    private static final String API_BASE_URL = "https://api.data.gov.hk/v1/";



    public static GovDataApiService getService(OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GovDataApiService.class);

    }



    public static GovDataApiService getService(){

        return getService(new OkHttpClient());

    }


}
