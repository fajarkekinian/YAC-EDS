package com.jogjadev.retrofit_model.RestApi;

import com.jogjadev.retrofit_model.Models.Models;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by android on 07/10/16.
 */

public interface RestApi {
    @GET("contohjson")
    Call<Models> getDataAdmin();
}
