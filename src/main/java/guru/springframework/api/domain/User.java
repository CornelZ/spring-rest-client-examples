package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class User implements Serializable {

  private String gender;
  private Name name;
  private Location location;
  private String email;
  private Login login;
  private String phone;
  private Job job;
  private Billing billing;
  private String language;
  private String currency;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private static final long serialVersionUID = -8043383318835439276L;

  /** No args constructor for use in serialization */
  public User() {}

  /**
   * @param gender
   * @param phone
   * @param name
   * @param location
   * @param language
   * @param currency
   * @param login
   * @param job
   * @param email
   * @param billing
   */
  public User(
      String gender,
      Name name,
      Location location,
      String email,
      Login login,
      String phone,
      Job job,
      Billing billing,
      String language,
      String currency) {
    super();
    this.gender = gender;
    this.name = name;
    this.location = location;
    this.email = email;
    this.login = login;
    this.phone = phone;
    this.job = job;
    this.billing = billing;
    this.language = language;
    this.currency = currency;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public Billing getBilling() {
    return billing;
  }

  public void setBilling(Billing billing) {
    this.billing = billing;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
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
    sb.append(User.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("gender");
    sb.append('=');
    sb.append(((this.gender == null) ? "<null>" : this.gender));
    sb.append(',');
    sb.append("name");
    sb.append('=');
    sb.append(((this.name == null) ? "<null>" : this.name));
    sb.append(',');
    sb.append("location");
    sb.append('=');
    sb.append(((this.location == null) ? "<null>" : this.location));
    sb.append(',');
    sb.append("email");
    sb.append('=');
    sb.append(((this.email == null) ? "<null>" : this.email));
    sb.append(',');
    sb.append("login");
    sb.append('=');
    sb.append(((this.login == null) ? "<null>" : this.login));
    sb.append(',');
    sb.append("phone");
    sb.append('=');
    sb.append(((this.phone == null) ? "<null>" : this.phone));
    sb.append(',');
    sb.append("job");
    sb.append('=');
    sb.append(((this.job == null) ? "<null>" : this.job));
    sb.append(',');
    sb.append("billing");
    sb.append('=');
    sb.append(((this.billing == null) ? "<null>" : this.billing));
    sb.append(',');
    sb.append("language");
    sb.append('=');
    sb.append(((this.language == null) ? "<null>" : this.language));
    sb.append(',');
    sb.append("currency");
    sb.append('=');
    sb.append(((this.currency == null) ? "<null>" : this.currency));
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
    result = ((result * 31) + ((this.gender == null) ? 0 : this.gender.hashCode()));
    result = ((result * 31) + ((this.phone == null) ? 0 : this.phone.hashCode()));
    result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
    result = ((result * 31) + ((this.location == null) ? 0 : this.location.hashCode()));
    result = ((result * 31) + ((this.language == null) ? 0 : this.language.hashCode()));
    result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.login == null) ? 0 : this.login.hashCode()));
    result = ((result * 31) + ((this.job == null) ? 0 : this.job.hashCode()));
    result = ((result * 31) + ((this.email == null) ? 0 : this.email.hashCode()));
    result = ((result * 31) + ((this.billing == null) ? 0 : this.billing.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof User) == false) {
      return false;
    }
    User rhs = ((User) other);
    return ((((((((((((this.gender == rhs.gender)
                                                || ((this.gender != null)
                                                    && this.gender.equals(rhs.gender)))
                                            && ((this.phone == rhs.phone)
                                                || ((this.phone != null)
                                                    && this.phone.equals(rhs.phone))))
                                        && ((this.name == rhs.name)
                                            || ((this.name != null) && this.name.equals(rhs.name))))
                                    && ((this.location == rhs.location)
                                        || ((this.location != null)
                                            && this.location.equals(rhs.location))))
                                && ((this.language == rhs.language)
                                    || ((this.language != null)
                                        && this.language.equals(rhs.language))))
                            && ((this.currency == rhs.currency)
                                || ((this.currency != null) && this.currency.equals(rhs.currency))))
                        && ((this.additionalProperties == rhs.additionalProperties)
                            || ((this.additionalProperties != null)
                                && this.additionalProperties.equals(rhs.additionalProperties))))
                    && ((this.login == rhs.login)
                        || ((this.login != null) && this.login.equals(rhs.login))))
                && ((this.job == rhs.job) || ((this.job != null) && this.job.equals(rhs.job))))
            && ((this.email == rhs.email)
                || ((this.email != null) && this.email.equals(rhs.email))))
        && ((this.billing == rhs.billing)
            || ((this.billing != null) && this.billing.equals(rhs.billing))));
  }
}
