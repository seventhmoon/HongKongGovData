package com.androidfung.opendata;

import com.hktramways.TramwaysApiService;

import hk.com.clp.opendata.chargingstation.ClpOpenDataApiService;
import hk.g0v.data.GovDataApiService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by fung on 3/4/2017.
 */

public final class ApiServices {

    private static final String TRAMWAYS_API_BASE_URL = "https://www.com.hktramways.hktramways.com/";
    private static final String CLP_OPENDATA_API_BASE_URL = "https://opendata.clp.com.hk/";
    private static final String HK_GOV_DATA_API_BASE_URL = "https://api.data.gov.hk/v1/";

    public static GovDataApiService getGovDataApiService(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HK_GOV_DATA_API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GovDataApiService.class);
    }


    public static GovDataApiService getGovDataApiService() {
        return getGovDataApiService(new OkHttpClient());
    }

    public static ClpOpenDataApiService getClpOpenDataApiService(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CLP_OPENDATA_API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        return retrofit.create(ClpOpenDataApiService.class);
    }


    public static ClpOpenDataApiService getClpOpenDataApiService() {
        return getClpOpenDataApiService(new OkHttpClient());
    }

    public static TramwaysApiService getTramwaysService(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TRAMWAYS_API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        return retrofit.create(TramwaysApiService.class);
    }


    public static TramwaysApiService getTramwaysService() {
        return getTramwaysService(new OkHttpClient());
    }

}
