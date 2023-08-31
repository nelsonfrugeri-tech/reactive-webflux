import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  void list() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);
    assertNotNull(response.block());
  }
}
