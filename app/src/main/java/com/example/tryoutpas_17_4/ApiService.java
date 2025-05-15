package com.example.tryoutpas_17_4;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("3/search_all_teams.php?l=English%20Premier%20League")
    Call<TeamsResponse> getUsers(@Query("league") String league);
}

