package ca.jrvs.apps.twitter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "created_at",
    "id",
    "id_str",
    "text",
    "entities",
    "coordinates",
    "retweet_count",
    "favorite_count",
    "favorited",
    "retweeted"
})
public class Tweet {

  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("id")
  private long id;
  @JsonProperty("id_str")
  private String idStr;
  @JsonProperty("text")
  private String text;
  @JsonProperty("entities")
  private Entities entities;
  @JsonProperty("coordinates")
  private Coordinates coordinates;
  @JsonProperty("retweet_count")
  private Integer retweetCount;
  @JsonProperty("favorite_count")
  private Integer favoriteCount;
  @JsonProperty("favorited")
  private Boolean favorited;
  @JsonProperty("retweeted")
  private Boolean retweeted;

  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  @JsonProperty("id")
  public long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  @JsonProperty("id_str")
  public String getIdStr() {
    return idStr;
  }

  @JsonProperty("id_str")
  public void setIdStr(String idStr) {
    this.idStr = idStr;
  }

  @JsonProperty("text")
  public String getText() {
    return text;
  }

  @JsonProperty("text")
  public void setText(String text) {
    this.text = text;
  }

  @JsonProperty("entities")
  public Entities getEntities() {
    return entities;
  }

  @JsonProperty("entities")
  public void setEntities(Entities entities) {
    this.entities = entities;
  }

  @JsonProperty("coordinates")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  @JsonProperty("coordinates")
  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  @JsonProperty("retweet_count")
  public Integer getRetweetCount() {
    return retweetCount;
  }

  @JsonProperty("retweet_count")
  public void setRetweetCount(Integer retweetCount) {
    this.retweetCount = retweetCount;
  }

  @JsonProperty("favorite_count")
  public Integer getFavoriteCount() {
    return favoriteCount;
  }

  @JsonProperty("favorite_count")
  public void setFavoriteCount(Integer favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  @JsonProperty("favorited")
  public Boolean getFavorited() {
    return favorited;
  }

  @JsonProperty("favorited")
  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }

  @JsonProperty("retweeted")
  public Boolean getRetweeted() {
    return retweeted;
  }

  @JsonProperty("retweeted")
  public void setRetweeted(Boolean retweeted) {
    this.retweeted = retweeted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tweet tweet = (Tweet) o;
    return Objects.equals(createdAt, tweet.createdAt) &&
        Objects.equals(id, tweet.id) &&
        Objects.equals(idStr, tweet.idStr) &&
        Objects.equals(text, tweet.text) &&
        Objects.equals(entities, tweet.entities) &&
        Objects.equals(coordinates, tweet.coordinates) &&
        Objects.equals(retweetCount, tweet.retweetCount) &&
        Objects.equals(favoriteCount, tweet.favoriteCount) &&
        Objects.equals(favorited, tweet.favorited) &&
        Objects.equals(retweeted, tweet.retweeted);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(createdAt, id, idStr, text, entities, coordinates, retweetCount, favoriteCount,
            favorited, retweeted);
  }
}