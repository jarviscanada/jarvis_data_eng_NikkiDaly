package ca.jrvs.apps.twitter.dao;

import ca.jrvs.apps.twitter.dao.helper.HttpHelper;
import ca.jrvs.apps.twitter.model.Entities;
import ca.jrvs.apps.twitter.model.Tweet;
import com.google.gdata.util.common.base.PercentEscaper;
import com.sun.jndi.toolkit.url.Uri;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.xml.stream.events.EntityDeclaration;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import ca.jrvs.apps.twitter.util.JsonUtil;

public class TwitterDao implements CrdDao<Tweet, String> {

  //URI Constraints
  private static final String API_BASE_URI = "https://api.twitter.com";
  private static final String POST_PATH = "/1.1/statuses/update.json";
  private static final String SHOW_PATH = "/1.1/statuses/show.json";
  private static final String DELETE_PATH = "/1.1/statuses/destroy";
  //URI Symbols
  private static final String QUERY_SYM = "?";
  private static final String AMPERSAND = "&";
  private static final String EQUAL = "=";

  //Response code
  private static final int HTTP_OK = 200;

  private HttpHelper httpHelper;

  @Autowired
  public TwitterDao(HttpHelper httpHelper) {
    this.httpHelper = httpHelper;
  }

  /**
   * Creates a tweet object
   * @param tweet entity to be created
   * @return created entity
   */
  @Override
  public Tweet create(Tweet tweet) {
    URI uri;
    uri = getPostUri(tweet);

    //Execute HTTP Request
    HttpResponse response = httpHelper.httpPost(uri);
    return parseResponseBody(response, HTTP_OK);
  }

  /**
   * Finds a tweet from the given id
   * @param s tweet id
   * @return found tweet entity
   */
  @Override
  public Tweet findById(String s) {
    URI uri;
    try {
      String uriStr = API_BASE_URI + SHOW_PATH + QUERY_SYM + "id" + s;
      uri = new URI(uriStr);
    } catch (URISyntaxException ex) {
      throw new IllegalArgumentException("Invalid id input", ex);
    }

    //Execute HTTP Request
    HttpResponse response = httpHelper.httpGet(uri);
    return parseResponseBody(response, HTTP_OK);
  }

  /**
   * Deletes a tweet from the given id
   * @param s tweet id to be deleted
   * @return deleted tweet entity
   */
  @Override
  public Tweet deleteById(String s) {
    URI uri;
    try {
      String uriStr = API_BASE_URI + DELETE_PATH + "/" + s + ".json";
      uri = new URI(uriStr);
    } catch (URISyntaxException ex) {
      throw new IllegalArgumentException("Invalid id input", ex);
    }

    //Execute HTTP Response
    HttpResponse response = httpHelper.httpPost(uri);
    return parseResponseBody(response, HTTP_OK);
  }

  private URI getPostUri(Tweet tweet) {
    URI uri;
    PercentEscaper percentEscaper = new PercentEscaper("", false);
    try {
      String status = tweet.getText();
      String uriString = API_BASE_URI + POST_PATH + QUERY_SYM + "status" + EQUAL + percentEscaper.escape(status);
      uri = new URI(uriString);
    } catch (URISyntaxException ex) {
      throw new IllegalArgumentException("Invalid input", ex);
    }
    return uri;
  }

  private Tweet parseResponseBody(HttpResponse response, int httpOk) {
    Tweet tweet;
    int status = response.getStatusLine().getStatusCode();
    if (status != httpOk) {
      try {
        System.out.println(EntityUtils.toString(response.getEntity()));
      } catch (IOException ex) {
        System.out.println("Response has no entity");
      }
      throw new RuntimeException("Unexpected HTTP status code:" + status);
    }

    if (response.getEntity() == null) {
      throw new RuntimeException("Empty response body");
    }

    //Convert Response Entity to string
    String jsonStr;
    try {
      jsonStr = EntityUtils.toString(response.getEntity());
    } catch (IOException ex) {
      throw new RuntimeException("Failed to convert entity to a string", ex);
    }

    //convert json to tweet object
    try {
      tweet = JsonUtil.toObjectFromJson(jsonStr, Tweet.class);
    } catch (IOException ex) {
      throw new RuntimeException("Unable to convert json object to tweet object", ex);
    }

    return tweet;
  }
}
