package cz.orany.mnlib.hello;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface CzOranyMnlibHelloClient {

    @Named("cz-orany-mnlib-hello")
    Single<String> index();

}
