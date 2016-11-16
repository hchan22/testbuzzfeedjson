package nyc.c4q.helenchan.jsontest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import nyc.c4q.helenchan.jsontest.network.response.Article;

/**
 * Created by helenchan on 11/11/16.
 */
public class BuzzFeedAdapter extends RecyclerView.Adapter {
    Context context;
    private List<Article> articles;

    public BuzzFeedAdapter(Context context,List<Article> listArticles) {
        this.context = context;
        articles = listArticles;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BuzzArticleHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BuzzArticleHolder addArticles = (BuzzArticleHolder) holder;
        Article response = articles.get(position);
        addArticles.bind(response);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    private class BuzzArticleHolder extends RecyclerView.ViewHolder {
        private View mView;
        private TextView titleText;
        private TextView textView;
        private ImageView imageview;


        public BuzzArticleHolder(ViewGroup parent) {
            super(inflateView(parent));
            mView = itemView;
            titleText = (TextView) mView.findViewById(R.id.title_text);
            textView = (TextView) mView.findViewById(R.id.description_text);
            imageview = (ImageView) mView.findViewById(R.id.image_view);
        }

        public void bind(Article article){
            titleText.setText(article.getTitle());
            textView.setText(article.getDescription());
            Picasso.with(context)
                        .load(article.getUrlToImage()).fit()
                        .into(imageview);

        }


    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.buzz_card_view, parent, false);
    }
}
