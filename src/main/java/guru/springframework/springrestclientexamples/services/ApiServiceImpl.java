package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Created by jt on 9/21/17. */
@Service
public class ApiServiceImpl implements ApiService {

  private final RestTemplate restTemplate;
  private final String api_url;

  public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
    this.restTemplate = restTemplate;
    this.api_url = api_url;
  }

  @Override
  public List<User> getUsers(Integer limit) {

    UserData userData =
        restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
    return userData.getData();
  }

  @Override
  public Flux<User> getUsers(Mono<Integer> limit) {

    return WebClient.create(api_url)
        .get()
        .uri(uriBuilder -> uriBuilder.queryParam("limit", limit.block()).build())
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        .flatMap(resp -> resp.bodyToMono(UserData.class))
        .flatMapIterable(UserData::getData);
  }
}
