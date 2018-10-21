package cz.orany.mnlib.hello;

import io.micronaut.function.FunctionBean;
import java.util.function.Supplier;

@FunctionBean("cz-orany-mnlib-hello")
public class CzOranyMnlibHelloFunction implements Supplier<String> {

    @Override
    public String get() {
        return "cz-orany-mnlib-hello";
    }
}
