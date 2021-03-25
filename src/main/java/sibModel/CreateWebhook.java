/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateWebhook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-12T11:46:32.800+05:30")
public class CreateWebhook {
  @SerializedName("url")
  private String url = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    SENT("sent"),
    
    HARDBOUNCE("hardBounce"),
    
    SOFTBOUNCE("softBounce"),
    
    BLOCKED("blocked"),
    
    SPAM("spam"),
    
    DELIVERED("delivered"),
    
    REQUEST("request"),
    
    CLICK("click"),
    
    INVALID("invalid"),
    
    DEFERRED("deferred"),
    
    OPENED("opened"),
    
    UNIQUEOPENED("uniqueOpened"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    LISTADDITION("listAddition"),
    
    CONTACTUPDATED("contactUpdated"),
    
    CONTACTDELETED("contactDeleted");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String text) {
      for (EventsEnum b : EventsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("events")
  private List<EventsEnum> events = new ArrayList<EventsEnum>();

  /**
   * Type of the webhook
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRANSACTIONAL("transactional"),
    
    MARKETING("marketing");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = TypeEnum.TRANSACTIONAL;

  public CreateWebhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the webhook
   * @return url
  **/
  @ApiModelProperty(example = "http://requestb.in/173lyyx1", required = true, value = "URL of the webhook")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CreateWebhook description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the webhook
   * @return description
  **/
  @ApiModelProperty(example = "Webhook triggered on unsubscription", value = "Description of the webhook")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateWebhook events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public CreateWebhook addEventsItem(EventsEnum eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events triggering the webhook. Possible values for Transactional type webhook – &#x60;sent&#x60; OR &#x60;request&#x60;, &#x60;delivered&#x60;, &#x60;hardBounce&#x60;, &#x60;softBounce&#x60;, &#x60;blocked&#x60;, &#x60;spam&#x60;, &#x60;invalid&#x60;, &#x60;deferred&#x60;, &#x60;click&#x60;, &#x60;opened&#x60;, &#x60;uniqueOpened&#x60; and &#x60;unsubscribed&#x60; and possible values for Marketing type webhook – &#x60;spam&#x60;, &#x60;opened&#x60;, &#x60;click&#x60;, &#x60;hardBounce&#x60;, &#x60;softBounce&#x60;, &#x60;unsubscribed&#x60;, &#x60;listAddition&#x60; &amp; &#x60;delivered&#x60;
   * @return events
  **/
  @ApiModelProperty(required = true, value = "Events triggering the webhook. Possible values for Transactional type webhook – `sent` OR `request`, `delivered`, `hardBounce`, `softBounce`, `blocked`, `spam`, `invalid`, `deferred`, `click`, `opened`, `uniqueOpened` and `unsubscribed` and possible values for Marketing type webhook – `spam`, `opened`, `click`, `hardBounce`, `softBounce`, `unsubscribed`, `listAddition` & `delivered`")
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

  public CreateWebhook type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the webhook
   * @return type
  **/
  @ApiModelProperty(example = "marketing", value = "Type of the webhook")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateWebhook createWebhook = (CreateWebhook) o;
    return ObjectUtils.equals(this.url, createWebhook.url) &&
    ObjectUtils.equals(this.description, createWebhook.description) &&
    ObjectUtils.equals(this.events, createWebhook.events) &&
    ObjectUtils.equals(this.type, createWebhook.type);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(url, description, events, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhook {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

