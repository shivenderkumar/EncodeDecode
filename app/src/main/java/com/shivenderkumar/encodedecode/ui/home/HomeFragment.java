package com.shivenderkumar.encodedecode.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shivenderkumar.encodedecode.R;
import com.shivenderkumar.encodedecode.adapters.LocationListAdapter;
import com.shivenderkumar.encodedecode.models.ChainDetailResponseLocationList;
import com.shivenderkumar.encodedecode.retrofit.ApiCallInterface;
import com.shivenderkumar.encodedecode.retrofit.RetrofitClientInstance;
import com.shivenderkumar.encodedecode.models.ChainDetailDataRequest;
import com.shivenderkumar.encodedecode.models.ChainDetailRequest;
import com.shivenderkumar.encodedecode.models.ChainDetailResponse;
import com.shivenderkumar.encodedecode.models.NewTokenDataRequest;
import com.shivenderkumar.encodedecode.models.NewTokenRequest;
import com.shivenderkumar.encodedecode.models.NewTokenResponse;
import com.shivenderkumar.encodedecode.models.PostData;
import com.shivenderkumar.encodedecode.models.ResponseGeneral;
import com.shivenderkumar.encodedecode.tools.EncoderDecoder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {

    ApiCallInterface apiCallInterface;
    List<ChainDetailResponseLocationList> locationList;

    private RecyclerView rv;
    private LocationListAdapter adapter;

    ProgressBar progressbar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        progressbar = root.findViewById(R.id.progressbar2);

        apiCallInterface = RetrofitClientInstance.getRetrofitInstance().create(ApiCallInterface.class);

        //new token object here
        NewTokenDataRequest  newTokenDataRequest = new NewTokenDataRequest("pockets309lake",null,null,null,null);
        NewTokenRequest newTokenRequest = new NewTokenRequest("F611396E-543D-4B8C-AD79-78D807DA5582", "http://www.imenu360.mobi/?id=pockets309lake", newTokenDataRequest);

        //convert object to string
        String str_newTokenRequest = "{\"AppCode\":\""+newTokenRequest.appCode+"\",\"mobUrl\":\""+newTokenRequest.mobUrl+"\",\"data\":{\"mobUrl\":\""+newTokenDataRequest.mobUrl+"\",\"pid\":"+newTokenDataRequest.pid+",\"TempOrderId\":"+newTokenDataRequest.tempOrderId+",\"PaypalToken\":"+newTokenDataRequest.paypalToken+",\"PaypalPayerID\":"+newTokenDataRequest.paypalPayerID+"}}";
        System.out.println("ccccccc str_newTokenRequest >> "+str_newTokenRequest);
        //encode the string
        String str_newTokenRequest_encoded = EncoderDecoder.getEncodedString(str_newTokenRequest);

        rv=(RecyclerView) root.findViewById(R.id.recycler1);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        getToken(str_newTokenRequest_encoded);

        return root;

    }

    private void getToken(String str) {

        progressbar.setVisibility(View.VISIBLE);

        PostData postData = new PostData(str);

        try {
            Call<ResponseGeneral> call = apiCallInterface.getNewToken(postData);

            call.enqueue(new Callback<ResponseGeneral>() {
                @Override
                public void onResponse(Call<ResponseGeneral> call, Response<ResponseGeneral> response) {
                    if (!response.isSuccessful()){
                        System.out.println("ssss RESPONSE GET NEW TOKEN FAIL");
                        progressbar.setVisibility(View.GONE);
                        return;
                    }

                    System.out.println("ssss RESPONSE GET NEW TOKEN SUCCESS :"+response.body().toString());

                    // get the data string from response(general response class)
                    System.out.println("ssss RESPONSE NEWTOKEN DATA ENCODE :"+ response.body().getData());

                    //decode string
                    String decodedString_responseData = EncoderDecoder.getDecodedString(response.body().getData());
                    System.out.println("ssss RESPONSE NEWTOKEN DATA DECODED :\n"+ decodedString_responseData);

                    //convert string to class object
                    ObjectMapper mapper = new ObjectMapper();
                    NewTokenResponse obj_NewTokenResponse = null;
                    try {
                        obj_NewTokenResponse = mapper.readValue(decodedString_responseData , NewTokenResponse.class);
                    } catch (JsonProcessingException e) {
                        System.out.println("rrrrrrrr error : "+e.getMessage());
                        progressbar.setVisibility(View.GONE);
                        e.printStackTrace();
                    }

                    System.out.println("rrrrrrrr NewTokenResponse Object\n"+obj_NewTokenResponse);

                    //convert the json string to class object(NewTokenResponse)

                   // Toast.makeText(getContext(), "get token successfully", Toast.LENGTH_SHORT).show();
                    getChainDetails(obj_NewTokenResponse);

                }

                @Override
                public void onFailure(Call<ResponseGeneral> call, Throwable t) {
                    System.out.println("ssss RESPONSE GET NEW TOKEN FAIL onfailure");
                    progressbar.setVisibility(View.GONE);
                }
            });
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    private void getChainDetails(NewTokenResponse newTokenResponse) {

        ChainDetailDataRequest chainDetailDataRequest = new ChainDetailDataRequest(165, "pockets309lake");
        ChainDetailRequest chainDetailRequest = new ChainDetailRequest( newTokenResponse.gettId(), chainDetailDataRequest );

        //get string of chainDetailRequest object
        String str_chainDetailRequest = chainDetailRequest.toString();
        System.out.println("tttttt str_chainDetailRequest :\n"+str_chainDetailRequest);

        //encode chainDetailsResquest to String
        String encoded_str_chainDetailRequest = EncoderDecoder.getEncodedString(str_chainDetailRequest);
        System.out.println("tttttt str_chainDetailRequest ENCODED : "+encoded_str_chainDetailRequest);

       // PostData postData = new PostData(str);
        PostData postData = new PostData(encoded_str_chainDetailRequest);

        try {
            Call<ResponseGeneral> call = apiCallInterface.getChainDetails(postData);

            call.enqueue(new Callback<ResponseGeneral>() {
                @Override
                public void onResponse(Call<ResponseGeneral> call, Response<ResponseGeneral> response) {
                    if (!response.isSuccessful()){
                        System.out.println("ssss RESPONSE GET CHAIN DETAILS FAIL");
                        progressbar.setVisibility(View.GONE);
                        return;
                    }

                    System.out.println("ssss RESPONSE GET CHAIN DETAILS SUCCESS :"+response.body().toString());
                   // Toast.makeText(getContext(), "get chain details successfully", Toast.LENGTH_SHORT).show();

                    //decode string
                    String decodedString_responseData = EncoderDecoder.getDecodedString(response.body().getData());
                    System.out.println("ssss RESPONSE GET CHAIN DATA DECODED :\n"+ decodedString_responseData);

                    //convert string to class object
                    ObjectMapper mapper = new ObjectMapper();
                    ChainDetailResponse obj_chainDetailResponse = null;
                    try {
                        obj_chainDetailResponse = mapper.readValue(decodedString_responseData , ChainDetailResponse.class);
                        locationList = obj_chainDetailResponse.getLocationList();

                    } catch (JsonProcessingException e) {
                        System.out.println("rrrrrrrr GET CHAIN error : "+e.getMessage());
                        e.printStackTrace();
                        progressbar.setVisibility(View.GONE);
                    }

                    System.out.println("rrrrrrrr GET CHAIN Object\n"+obj_chainDetailResponse);
                    System.out.println("rrrrrrrr LOCATION LIST \n"+locationList.toString());

                    adapter=new LocationListAdapter(locationList, getContext());
                    rv.setAdapter(adapter);
                    progressbar.setVisibility(View.GONE);

                    //

                }

                @Override
                public void onFailure(Call<ResponseGeneral> call, Throwable t) {
                    System.out.println("ssss RESPONSE GET CHAIN DETAILS FAIL onfailure");
                    progressbar.setVisibility(View.GONE);
                }
            });
        } catch (Exception e){
            e.printStackTrace();
            progressbar.setVisibility(View.GONE);
        }

    }

}



