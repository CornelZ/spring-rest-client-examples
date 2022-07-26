package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Location implements Serializable {

  private String street;
  private String city;
  private String state;
  private String postcode;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private static final long serialVersionUID = 5675418653696052934L;

  /** No args constructor for use in serialization */
  public Location() {}

  /**
   * @param city
   * @param street
   * @param postcode
   * @param state
   */
  public Location(String street, String city, String state, String postcode) {
    super();
    this.street = street;
    this.city = city;
    this.state = state;
    this.postcode = postcode;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Location.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("street");
    sb.append('=');
    sb.append(((this.street == null) ? "<null>" : this.street));
    sb.append(',');
    sb.append("city");
    sb.append('=');
    sb.append(((this.city == null) ? "<null>" : this.city));
    sb.append(',');
    sb.append("state");
    sb.append('=');
    sb.append(((this.state == null) ? "<null>" : this.state));
    sb.append(',');
    sb.append("postcode");
    sb.append('=');
    sb.append(((this.postcode == null) ? "<null>" : this.postcode));
    sb.append(',');
    sb.append("additionalProperties");
    sb.append('=');
    sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = ((result * 31) + ((this.postcode == null) ? 0 : this.postcode.hashCode()));
    result = ((result * 31) + ((this.state == null) ? 0 : this.state.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.city == null) ? 0 : this.city.hashCode()));
    result = ((result * 31) + ((this.street == null) ? 0 : this.street.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Location) == false) {
      return false;
    }
    Location rhs = ((Location) other);
    return ((((((this.postcode == rhs.postcode)
                        || ((this.postcode != null) && this.postcode.equals(rhs.postcode)))
                    && ((this.state == rhs.state)
                        || ((this.state != null) && this.state.equals(rhs.state))))
                && ((this.additionalProperties == rhs.additionalProperties)
                    || ((this.additionalProperties != null)
                        && this.additionalProperties.equals(rhs.additionalProperties))))
            && ((this.city == rhs.city) || ((this.city != null) && this.city.equals(rhs.city))))
        && ((this.street == rhs.street)
            || ((this.street != null) && this.street.equals(rhs.street))));
  }
}
