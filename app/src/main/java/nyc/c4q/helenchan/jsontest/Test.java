//package nyc.c4q.helenchan.jsontest;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.squareup.picasso.Picasso;
//
//import nyc.c4q.helenchan.jsontest.network.response.Article;
//import nyc.c4q.helenchan.jsontest.network.response.BuzzfeedResponse;
//import nyc.c4q.helenchan.jsontest.network.response.BuzzfeedService;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class Test extends AppCompatActivity {
//    private static final String API_KEY = BuildConfig.API_KEY;
//    private static final String TAG = MainActivity.class.getSimpleName();
//    private TextView textView;
//    private ImageView imageview;
//    private TextView titleText;;
//    private RecyclerView recycle;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.recyclerview);
//        textView = (TextView)findViewById(R.id.description_text);
//        titleText = (TextView)findViewById(R.id.title_text);
//        imageview = (ImageView)findViewById(R.id.image_view);
//        recycle = (RecyclerView)findViewById(R.id.recyclerviewwidget);
//
//        recycle.setLayoutManager(new LinearLayoutManager(this));
//        recycle.setAdapter(new BuzzFeedAdapter());
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://newsapi.org/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        BuzzfeedService service = retrofit.create(BuzzfeedService.class);
//        Call<BuzzfeedResponse> call = service.getArticles("buzzfeed", "top", API_KEY);
//        call.enqueue(new Callback<BuzzfeedResponse>() {
//            @Override
//            public void onResponse(Call<BuzzfeedResponse> call, Response<BuzzfeedResponse> response) {
//                Article article = response.body().getArticles().get(0);
//                Log.d(TAG, "is this working");
//                textView.setText(article.getDescription() + "\n" + article.getUrl());
//                titleText.setText(article.getTitle());
//
//                Picasso.with(Test.this)
//                        .load(article.getUrlToImage())
//                        .into(imageview);
//                Log.d(TAG, article.getDescription());
//
//            }
//
//            @Override
//            public void onFailure(Call<BuzzfeedResponse> call, Throwable t) {
//
//            }
//        });
//    }
//}
