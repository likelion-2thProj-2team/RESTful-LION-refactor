package com.hppystay.hotelreservation.api.KNTO.config;

import com.hppystay.hotelreservation.api.KNTO.service.HotelComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class KNTORestClientConfig {
    @Bean
    public HotelComponent kntoRestClient() {
        RestClient restClient = RestClient.builder().baseUrl("http://apis.data.go.kr/B551011/KorService1").build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(HotelComponent.class);
    }
}
