package ca.jrvs.apps.twitter.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import ca.jrvs.apps.twitter.dao.helper.HttpHelper;
import ca.jrvs.apps.twitter.dao.helper.TwitterHttpHelper;
import ca.jrvs.apps.twitter.model.Coordinates;
import ca.jrvs.apps.twitter.model.Tweet;
import ca.jrvs.apps.twitter.util.TweetUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwitterDaoIntTest {

  static final Logger logger = LoggerFactory.getLogger(TwitterDao.class);
  private TwitterDao dao;

  @Before
  public void setUp() throws Exception {
    String consumerKey = System.getenv("consumerKey");
    String consumerSecret = System.getenv("consumerSecret");
    String accessToken = System.getenv("accessToken");
    String tokenSecret = System.getenv("tokenSecret");
    logger.debug(consumerKey + "|" + consumerSecret + "|" + accessToken + "|" + tokenSecret);
    HttpHelper httpHelper = new TwitterHttpHelper(consumerKey, consumerSecret, accessToken,
        tokenSecret);
    this.dao = new TwitterDao(httpHelper);
  }

  @Test
  public void create() throws Exception {
    String hashtag = "#hey";
    String text = "@Mary, this is some text written to you " + hashtag + " " + System.currentTimeMillis();
    Double lat = 1d;
    Double lon = -1d;
    Tweet tweet = TweetUtil.buildTweet(text, lon, lat);
    Tweet postedTweet = dao.create(tweet);

    assertEquals(text, postedTweet.getText());
    assertNotNull(postedTweet.getCoordinates());

    assertEquals(2, postedTweet.getCoordinates().getCoordinates().size());
    assertEquals(lon, postedTweet.getCoordinates().getCoordinates().get(0));
    assertEquals(lat, postedTweet.getCoordinates().getCoordinates().get(1));

    assertTrue(hashtag.contains(postedTweet.getEntities().getHashtags().get(0).getText()));

;  }

}
