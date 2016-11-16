package nyc.c4q.helenchan.jsontest.network.response;

/**
 * Created by helenchan on 11/2/16.
 *  "author": "Talha Ishaq",
 "title": "Community Post: We Know Which Reality Show You'd Star In Based On Three Questions",
 "description": "Ready. Set. Go.",
 "url": "https://www.buzzfeed.com/talhaishaq2001/which-reality-tv-show-should-you-compete-in-1saop",
 "urlToImage": "https://img.buzzfeed.com/buzzfeed-static/static/2016-10/30/15/social_promotion/buzzfeed-prod-web04/facebook-social-promotion-10163-1477854740-4.jpg",
 "publishedAt": "2016-10-30T20:16:04Z"
 */

public class Article {
    String author;
    String title;
    String description;
    String url;
    String urlToImage;
    String publishedAt;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
}
