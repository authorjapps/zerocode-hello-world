package org.jsmart.zerocode.testhelp.tests.helloworld;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("hello_world_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class JustHelloWorldTest {

    @Test
    @JsonTestCase("helloworld_tests/hello_world_ok_status_200.json")
    public void testHelloWorld_localhostApi() throws Exception {

    }

}
