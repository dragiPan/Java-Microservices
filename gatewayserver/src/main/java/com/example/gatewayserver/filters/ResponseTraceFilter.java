package com.example.gatewayserver.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import reactor.core.publisher.Mono;

@Configuration
public class ResponseTraceFilter {
    private static final Logger logger = LoggerFactory.getLogger(ResponseTraceFilter.class);

    private final FilterUtility filterUtility;

    public ResponseTraceFilter(FilterUtility filterUtility) {
        this.filterUtility = filterUtility;
    }

    @Bean
    public GlobarFilter postGlobalFiler() {
        return (exchange, chain) -> {
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                HttpHeaders responseHeaders = exchange.getRequest().getHeaders();
                String correaltionId = filterUtility.getCorrelationId(requestHeaders());
                logger.debug("Updated bank-correlation-id:{}", correaltionId);
                exhange.getResponse().getHeaders().add(FilterUtility.CORRELATION_ID, correaltionId);
            }));
        };
   }

}
