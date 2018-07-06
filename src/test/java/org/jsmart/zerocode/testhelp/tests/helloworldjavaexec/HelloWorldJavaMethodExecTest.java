package org.jsmart.zerocode.testhelp.tests.helloworldjavaexec;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("github_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HelloWorldJavaMethodExecTest {

    @Test
    @JsonTestCase("helloworldjavaexec/hello_world_java_method_return_assertions.json")
    public void testJavaDbExec() throws Exception {

    }

    @Test
    @JsonTestCase("helloworldjavaexec/hello_world_javaexec_req_resp_as_json.json")
    public void testJavaReqRespJson() throws Exception {

    }

    @Test
    @JsonTestCase("helloworldjavaexec/read_config_properties_into_test_case.json")
    public void testJavaExecReadPropertiesIntoTest() throws Exception {

    }

}
