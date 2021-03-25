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

/**
 * GetSendersListIps
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-12T11:46:32.800+05:30")
public class GetSendersListIps {
  @SerializedName("ip")
  private String ip = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("weight")
  private Long weight = null;

  public GetSendersListIps ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Dedicated IP available in your account
   * @return ip
  **/
  @ApiModelProperty(example = "123.98.689.7", required = true, value = "Dedicated IP available in your account")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public GetSendersListIps domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain of the IP
   * @return domain
  **/
  @ApiModelProperty(example = "mycompany.com", required = true, value = "Domain of the IP")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public GetSendersListIps weight(Long weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight of the IP for this sender
   * @return weight
  **/
  @ApiModelProperty(example = "50", required = true, value = "Weight of the IP for this sender")
  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetSendersListIps getSendersListIps = (GetSendersListIps) o;
    return ObjectUtils.equals(this.ip, getSendersListIps.ip) &&
    ObjectUtils.equals(this.domain, getSendersListIps.domain) &&
    ObjectUtils.equals(this.weight, getSendersListIps.weight);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(ip, domain, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSendersListIps {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

