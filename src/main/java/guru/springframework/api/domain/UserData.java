package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class UserData implements Serializable {

  private static final long serialVersionUID = -3315586742447908809L;
  private List<User> data;

  public UserData() {}

  public UserData(List<User> data) {
    this.data = data;
  }

  public List<User> getData() {
    return data;
  }

  public void setData(List<User> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("UserData [data=").append(data).append("]");
    return builder.toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof UserData)) {
      return false;
    }
    UserData other = (UserData) obj;
    return Objects.equals(data, other.data);
  }
}
