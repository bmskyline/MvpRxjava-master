package com.pavietnam.mvprxjava.data.remote;

import com.pavietnam.mvprxjava.data.remote.model.User;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitApi {

    @GET("users")
    Single<List<User>> getAllUser();

    @GET("users/{user}")
    io.reactivex.Observable<User> getDetailUser(@Path("user") String user);
}
