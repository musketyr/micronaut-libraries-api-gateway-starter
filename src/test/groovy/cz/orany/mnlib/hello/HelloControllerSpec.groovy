package cz.orany.mnlib.hello

import com.agorapulse.gru.Gru
import com.agorapulse.gru.agp.ApiGatewayProxy
import com.agorapulse.micronaut.agp.ApiGatewayProxyHandler
import org.junit.Rule
import spock.lang.Specification

class HelloControllerSpec extends Specification {

    @Rule Gru gru = Gru.equip(ApiGatewayProxy.steal(this) {
        map '/hello' to ApiGatewayProxyHandler
    })

    void "test index"() {
        expect:
            gru.test {
                get '/hello'
                expect {
                    text inline('Hello from API Gateway')
                }
            }
    }
}
