## Spring Cloud Config Server

- @EnableConfigServer
- http://localhost:8888/config/refresh (https://github.com/kimjunghak/msa-config.git/config.yml) 를 이용하여 갱신가능

### Config Client 에서 수정된 사항
- spring.cloud.config.uri=http://localhost:8888, default 사항 -> 이 주소가 아닐 경우 사용
- spring.config.import=optional:configserver: -> config server를 사용할 경우 사용