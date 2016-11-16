package nyc.c4q.helenchan.jsontest.network.response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by helenchan on 11/4/16.
 * https://newsapi.org/v1/articles?source=buzzfeed&sortBy=top&apiKey=f2ade97bbe71428680a250d3be60b652
 */

public interface BuzzfeedService {
    @GET("v1/articles")
    Call<BuzzfeedResponse> getArticles(@Query("source") String source,
                                       @Query("sortBy") String sortBy,
                                       @Query("apiKey") String apiKey );

}
