package ca.jrvs.apps.twitter.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hashtags",
    "user_mentions"
})
public class Entities {

  @JsonProperty("hashtags")
  private List<Object> hashtags = null;
  @JsonProperty("user_mentions")
  private List<Object> userMentions = null;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("hashtags")
  public List<Object> getHashtags() {
    return hashtags;
  }

  @JsonProperty("hashtags")
  public void setHashtags(List<Object> hashtags) {
    this.hashtags = hashtags;
  }

  @JsonProperty("user_mentions")
  public List<Object> getUserMentions() {
    return userMentions;
  }

  @JsonProperty("user_mentions")
  public void setUserMentions(List<Object> userMentions) {
    this.userMentions = userMentions;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entities entities = (Entities) o;
    return Objects.equals(hashtags, entities.hashtags) &&
        Objects.equals(userMentions, entities.userMentions) &&
        Objects.equals(additionalProperties, entities.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashtags, userMentions, additionalProperties);
  }
}