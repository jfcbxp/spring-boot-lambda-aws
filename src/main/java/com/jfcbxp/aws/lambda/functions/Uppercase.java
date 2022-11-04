package com.jfcbxp.aws.lambda.functions;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Uppercase implements Function<APIGatewayProxyRequestEvent,String> {

    @Override
    public String apply(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent) {
        return apiGatewayProxyRequestEvent.getBody().toUpperCase();
    }

    @Override
    public <V> Function<V, String> compose(Function<? super V, ? extends APIGatewayProxyRequestEvent> before) {
        return Function.super.compose(before);
    }

    @Override
    public <V> Function<APIGatewayProxyRequestEvent, V> andThen(Function<? super String, ? extends V> after) {
        return Function.super.andThen(after);
    }
}
