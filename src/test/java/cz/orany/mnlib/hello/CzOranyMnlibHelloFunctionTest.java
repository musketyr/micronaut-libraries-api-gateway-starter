package cz.orany.mnlib.hello;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CzOranyMnlibHelloFunctionTest {

    @Test
    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        CzOranyMnlibHelloClient client = server.getApplicationContext().getBean(CzOranyMnlibHelloClient.class);

        assertEquals(client.index().blockingGet(), "cz-orany-mnlib-hello");
        server.stop();
    }
}
