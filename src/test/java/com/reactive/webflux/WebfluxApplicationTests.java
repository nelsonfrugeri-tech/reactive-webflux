package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}cpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}kpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}gpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
} package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}cpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}mpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}cpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}vpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}wpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}bpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}fpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}lpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}upackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}xpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
};package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}mpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
} package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}gpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}jpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}upackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}npackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}jpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}upackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
};package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}mpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
} package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}gpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}npackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}gpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}fpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}mpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}wpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}kpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}bpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}cpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}npackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}xpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}.package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}npackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}gpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Bpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
};package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}@package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}rpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}npackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}gpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Bpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}cpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}lpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
} package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Wpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}bpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}fpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}lpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}upackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}xpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ppackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}lpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}cpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}npackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
} package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}{package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}	package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}@package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}	package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}vpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}ipackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}dpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
} package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}cpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}npackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}epackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}xpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}tpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}Lpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}opackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}apackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}dpackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}spackage com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}(package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
})package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
} package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}{package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}	package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}}package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}}package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}
package com.reactive.webflux;

import com.reactive.webflux.api.NobelApi;
import com.reactive.webflux.dto.NobelPrizeResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class WebfluxApplicationTests {

  @Autowired
  private NobelApi nobelApi;

  @Test
  public void testList() {
    Mono<NobelPrizeResponseDto> response = nobelApi.list(0, 10, 2020);

    StepVerifier.create(response)
        .expectNextMatches(nobelPrizeResponseDto -> nobelPrizeResponseDto != null)
        .verifyComplete();
  }
}