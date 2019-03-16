package org.jsmart.zerocode.testhelp.tests.helloworldcustomclient;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseHttpClient;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.jsmart.zerocode.zerocodejavaexec.httpclient.CustomHttpClient;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("github_host.properties")
@UseHttpClient(CustomHttpClient.class)
@RunWith(ZeroCodeUnitRunner.class)
public class GitHubSecurityHeaderTokenTest {

    @Test
    @JsonTestCase("helloworld/hello_world_status_ok_assertions.json")
    public void testHelloWorld_localhostApi() throws Exception {
    }

}
