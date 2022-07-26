package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Card implements Serializable {

  private String type;
  private String number;
  private ExpirationDate expirationDate;
  private String iban;
  private String swift;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private static final long serialVersionUID = 9136647163783287945L;

  /** No args constructor for use in serialization */
  public Card() {}

  /**
   * @param number
   * @param iban
   * @param type
   * @param expirationDate
   * @param swift
   */
  public Card(
      String type, String number, ExpirationDate expirationDate, String iban, String swift) {
    super();
    this.type = type;
    this.number = number;
    this.expirationDate = expirationDate;
    this.iban = iban;
    this.swift = swift;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ExpirationDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(ExpirationDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public String getSwift() {
    return swift;
  }

  public void setSwift(String swift) {
    this.swift = swift;
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
    sb.append(Card.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("type");
    sb.append('=');
    sb.append(((this.type == null) ? "<null>" : this.type));
    sb.append(',');
    sb.append("number");
    sb.append('=');
    sb.append(((this.number == null) ? "<null>" : this.number));
    sb.append(',');
    sb.append("expirationDate");
    sb.append('=');
    sb.append(((this.expirationDate == null) ? "<null>" : this.expirationDate));
    sb.append(',');
    sb.append("iban");
    sb.append('=');
    sb.append(((this.iban == null) ? "<null>" : this.iban));
    sb.append(',');
    sb.append("swift");
    sb.append('=');
    sb.append(((this.swift == null) ? "<null>" : this.swift));
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
    result = ((result * 31) + ((this.number == null) ? 0 : this.number.hashCode()));
    result = ((result * 31) + ((this.iban == null) ? 0 : this.iban.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
    result = ((result * 31) + ((this.expirationDate == null) ? 0 : this.expirationDate.hashCode()));
    result = ((result * 31) + ((this.swift == null) ? 0 : this.swift.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Card) == false) {
      return false;
    }
    Card rhs = ((Card) other);
    return (((((((this.number == rhs.number)
                            || ((this.number != null) && this.number.equals(rhs.number)))
                        && ((this.iban == rhs.iban)
                            || ((this.iban != null) && this.iban.equals(rhs.iban))))
                    && ((this.additionalProperties == rhs.additionalProperties)
                        || ((this.additionalProperties != null)
                            && this.additionalProperties.equals(rhs.additionalProperties))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
            && ((this.expirationDate == rhs.expirationDate)
                || ((this.expirationDate != null)
                    && this.expirationDate.equals(rhs.expirationDate))))
        && ((this.swift == rhs.swift) || ((this.swift != null) && this.swift.equals(rhs.swift))));
  }
}
