package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Login implements Serializable {

  private String username;
  private String password;
  private String md5;
  private String sha1;
  private String sha256;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private static final long serialVersionUID = -1600989662651364559L;

  /** No args constructor for use in serialization */
  public Login() {}

  /**
   * @param sha1
   * @param password
   * @param sha256
   * @param username
   * @param md5
   */
  public Login(String username, String password, String md5, String sha1, String sha256) {
    super();
    this.username = username;
    this.password = password;
    this.md5 = md5;
    this.sha1 = sha1;
    this.sha256 = sha256;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
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
    sb.append(Login.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("username");
    sb.append('=');
    sb.append(((this.username == null) ? "<null>" : this.username));
    sb.append(',');
    sb.append("password");
    sb.append('=');
    sb.append(((this.password == null) ? "<null>" : this.password));
    sb.append(',');
    sb.append("md5");
    sb.append('=');
    sb.append(((this.md5 == null) ? "<null>" : this.md5));
    sb.append(',');
    sb.append("sha1");
    sb.append('=');
    sb.append(((this.sha1 == null) ? "<null>" : this.sha1));
    sb.append(',');
    sb.append("sha256");
    sb.append('=');
    sb.append(((this.sha256 == null) ? "<null>" : this.sha256));
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
    result = ((result * 31) + ((this.sha1 == null) ? 0 : this.sha1.hashCode()));
    result = ((result * 31) + ((this.password == null) ? 0 : this.password.hashCode()));
    result = ((result * 31) + ((this.sha256 == null) ? 0 : this.sha256.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.username == null) ? 0 : this.username.hashCode()));
    result = ((result * 31) + ((this.md5 == null) ? 0 : this.md5.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Login) == false) {
      return false;
    }
    Login rhs = ((Login) other);
    return (((((((this.sha1 == rhs.sha1) || ((this.sha1 != null) && this.sha1.equals(rhs.sha1)))
                        && ((this.password == rhs.password)
                            || ((this.password != null) && this.password.equals(rhs.password))))
                    && ((this.sha256 == rhs.sha256)
                        || ((this.sha256 != null) && this.sha256.equals(rhs.sha256))))
                && ((this.additionalProperties == rhs.additionalProperties)
                    || ((this.additionalProperties != null)
                        && this.additionalProperties.equals(rhs.additionalProperties))))
            && ((this.username == rhs.username)
                || ((this.username != null) && this.username.equals(rhs.username))))
        && ((this.md5 == rhs.md5) || ((this.md5 != null) && this.md5.equals(rhs.md5))));
  }
}
