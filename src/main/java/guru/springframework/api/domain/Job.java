package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Job implements Serializable {

  private String title;
  private String company;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private static final long serialVersionUID = -5546321490656248987L;

  /** No args constructor for use in serialization */
  public Job() {}

  /**
   * @param company
   * @param title
   */
  public Job(String title, String company) {
    super();
    this.title = title;
    this.company = company;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
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
    sb.append(Job.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("title");
    sb.append('=');
    sb.append(((this.title == null) ? "<null>" : this.title));
    sb.append(',');
    sb.append("company");
    sb.append('=');
    sb.append(((this.company == null) ? "<null>" : this.company));
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
    result = ((result * 31) + ((this.company == null) ? 0 : this.company.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.title == null) ? 0 : this.title.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Job) == false) {
      return false;
    }
    Job rhs = ((Job) other);
    return ((((this.company == rhs.company)
                || ((this.company != null) && this.company.equals(rhs.company)))
            && ((this.additionalProperties == rhs.additionalProperties)
                || ((this.additionalProperties != null)
                    && this.additionalProperties.equals(rhs.additionalProperties))))
        && ((this.title == rhs.title) || ((this.title != null) && this.title.equals(rhs.title))));
  }
}
