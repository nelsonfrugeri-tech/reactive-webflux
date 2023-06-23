package com.reactive.webflux.exception;

import com.reactive.webflux.dto.InputValidationResponseDto;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.reactive.error.AbstractErrorWebExceptionHandler;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
//
//@Component
//public class GlobalErrorWebExceptionHandler extends AbstractErrorWebExceptionHandler {
//
//    public GlobalErrorWebExceptionHandler(GlobalErrorAttributes g, ApplicationContext applicationContext,
//        ServerCodecConfigurer serverCodecConfigurer) {
//        super(g, new WebProperties.Resources(), applicationContext);
//        super.setMessageWriters(serverCodecConfigurer.getWriters());
//        super.setMessageReaders(serverCodecConfigurer.getReaders());
//    }
//
//    @Override
//    protected RouterFunction<ServerResponse> getRoutingFunction(ErrorAttributes errorAttributes) {
//        return RouterFunctions.route(RequestPredicates.all(), this::renderErrorResponse);
//    }
//
//    private Mono<ServerResponse> renderErrorResponse(ServerRequest request) {
//        Throwable error = getError(request);
//        if (error instanceof InputValidationException) {
//            return ServerResponse.status(HttpStatus.BAD_REQUEST)
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromValue(new InputValidationResponseDto(1, "", 100, 1 )));
//        }
//        return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR)
//            .contentType(MediaType.APPLICATION_JSON)
//            .body(BodyInserters.fromValue(new InputValidationResponseDto(1, "", 100, 1 )));
//    }
//}
