package org.jsmart.zerocode.testhelp.tests.helloworldmore;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("github_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HelloWorldDelayTest {
    @Test
    @JsonTestCase("helloworld_delay/hello_world_delay_step.json")
    public void test_delayStep() throws Exception {
    }
}
