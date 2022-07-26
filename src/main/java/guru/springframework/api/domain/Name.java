package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Name implements Serializable {

  private String title;
  private String first;
  private String last;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private static final long serialVersionUID = 601042703538526952L;

  /** No args constructor for use in serialization */
  public Name() {}

  /**
   * @param last
   * @param title
   * @param first
   */
  public Name(String title, String first, String last) {
    super();
    this.title = title;
    this.first = first;
    this.last = last;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
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
    sb.append(Name.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("title");
    sb.append('=');
    sb.append(((this.title == null) ? "<null>" : this.title));
    sb.append(',');
    sb.append("first");
    sb.append('=');
    sb.append(((this.first == null) ? "<null>" : this.first));
    sb.append(',');
    sb.append("last");
    sb.append('=');
    sb.append(((this.last == null) ? "<null>" : this.last));
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
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.title == null) ? 0 : this.title.hashCode()));
    result = ((result * 31) + ((this.last == null) ? 0 : this.last.hashCode()));
    result = ((result * 31) + ((this.first == null) ? 0 : this.first.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Name) == false) {
      return false;
    }
    Name rhs = ((Name) other);
    return (((((this.additionalProperties == rhs.additionalProperties)
                    || ((this.additionalProperties != null)
                        && this.additionalProperties.equals(rhs.additionalProperties)))
                && ((this.title == rhs.title)
                    || ((this.title != null) && this.title.equals(rhs.title))))
            && ((this.last == rhs.last) || ((this.last != null) && this.last.equals(rhs.last))))
        && ((this.first == rhs.first) || ((this.first != null) && this.first.equals(rhs.first))));
  }
}
