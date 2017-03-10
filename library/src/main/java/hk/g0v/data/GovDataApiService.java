package hk.g0v.data;

import hk.g0v.data.govwifi.model.Results;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by fung on 3/5/2017.
 */
public interface GovDataApiService {
//    https://api.data.gov.hk/v1/nearest-govwifi-premises?lat=22.3501&long=114.1833

    @GET("nearest-govwifi-premises")
    Call<Results> getNearestGovWiFiPremises(@Query("lat") double latitude, @Query("long") double longidute);

    @GET("nearest-govwifi-premises")
    Call<Results> getNearestGovWiFiPremises(@Query("lat") double latitude, @Query("long") double longidute, @Query("max") int max);
}
