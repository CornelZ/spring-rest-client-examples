package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ApiServiceImpl implements ApiService {

  private final RestTemplate restTemplate;
  private final String apiUri;

  public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUri) {
    this.restTemplate = restTemplate;
    this.apiUri = apiUri;
  }

  @Override
  public List<User> getUsers(Integer limit) {
    UriComponentsBuilder uiBuiler =
        UriComponentsBuilder.fromUriString(apiUri).queryParam("limit", limit);
    UserData userData = restTemplate.getForObject(uiBuiler.toUriString(), UserData.class);
    return userData.getData();
  }
}
