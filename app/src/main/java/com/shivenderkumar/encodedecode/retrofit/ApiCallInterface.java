package com.shivenderkumar.encodedecode.retrofit;

import com.shivenderkumar.encodedecode.models.PostData;
import com.shivenderkumar.encodedecode.models.ResponseGeneral;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiCallInterface {

    @POST(value = "GetNewToken.imsvc")
    Call<ResponseGeneral> getNewToken(@Body PostData postData );

    @POST(value = "GetChainDetails.imsvc")
    Call<ResponseGeneral> getChainDetails(@Body PostData postData );

}
