package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ExpirationDate implements Serializable {

  private String date;
  private Integer timezoneType;
  private String timezone;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private static final long serialVersionUID = 6132800706508759548L;

  /** No args constructor for use in serialization */
  public ExpirationDate() {}

  /**
   * @param date
   * @param timezoneType
   * @param timezone
   */
  public ExpirationDate(String date, Integer timezoneType, String timezone) {
    super();
    this.date = date;
    this.timezoneType = timezoneType;
    this.timezone = timezone;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Integer getTimezoneType() {
    return timezoneType;
  }

  public void setTimezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
  }

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
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
    sb.append(ExpirationDate.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("date");
    sb.append('=');
    sb.append(((this.date == null) ? "<null>" : this.date));
    sb.append(',');
    sb.append("timezoneType");
    sb.append('=');
    sb.append(((this.timezoneType == null) ? "<null>" : this.timezoneType));
    sb.append(',');
    sb.append("timezone");
    sb.append('=');
    sb.append(((this.timezone == null) ? "<null>" : this.timezone));
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
    result = ((result * 31) + ((this.date == null) ? 0 : this.date.hashCode()));
    result = ((result * 31) + ((this.timezoneType == null) ? 0 : this.timezoneType.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.timezone == null) ? 0 : this.timezone.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof ExpirationDate) == false) {
      return false;
    }
    ExpirationDate rhs = ((ExpirationDate) other);
    return (((((this.date == rhs.date) || ((this.date != null) && this.date.equals(rhs.date)))
                && ((this.timezoneType == rhs.timezoneType)
                    || ((this.timezoneType != null) && this.timezoneType.equals(rhs.timezoneType))))
            && ((this.additionalProperties == rhs.additionalProperties)
                || ((this.additionalProperties != null)
                    && this.additionalProperties.equals(rhs.additionalProperties))))
        && ((this.timezone == rhs.timezone)
            || ((this.timezone != null) && this.timezone.equals(rhs.timezone))));
  }
}
