package ca.jrvs.apps.twitter.util;

import ca.jrvs.apps.twitter.model.Coordinates;
import ca.jrvs.apps.twitter.model.Tweet;
import java.util.ArrayList;
import java.util.List;

public class TweetUtil {

  public static Tweet buildTweet(String text, double lon, double lat) {
    Tweet tweet = new Tweet();
    tweet.setText(text);
    Coordinates coordinates = new Coordinates();
    List<Double> longlat = new ArrayList<>();
    longlat.add(lon);
    longlat.add(lat);
    coordinates.setCoordinates(longlat);
    tweet.setCoordinates(coordinates);
    return tweet;
  }

}
