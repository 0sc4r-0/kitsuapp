package com.example.oscar.kitsu.Views.retrofit;
import com.example.oscar.kitsu.Views.Models.AnimeData;
import retrofit2.Call;
import retrofit2.http.GET;
public interface Api {

        @GET("anime/")
        Call<AnimeData> getData();

}
