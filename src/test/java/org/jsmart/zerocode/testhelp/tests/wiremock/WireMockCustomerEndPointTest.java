package org.jsmart.zerocode.testhelp.tests.wiremock;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("customer_web_app.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class WireMockCustomerEndPointTest {

    @Test
    @JsonTestCase("wiremock_tests/mock_via_wiremock_then_test_the_end_point.json")
    public void testHelloWorld_localhostApi() throws Exception {

    }

}
