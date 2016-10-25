package com.raisound.rxjava;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by maolin on 2016/10/20.
 */

public interface MovieServiceRxjava {
    @GET("top250")
    Observable<HttpResult<User>> getTopMovie(@Query("start") int start, @Query("count") int count);
}
