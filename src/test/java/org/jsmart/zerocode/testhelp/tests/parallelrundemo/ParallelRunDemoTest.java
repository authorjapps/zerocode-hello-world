package org.jsmart.zerocode.testhelp.tests.parallelrundemo;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseHttpClient;
import org.jsmart.zerocode.core.httpclient.ssl.SslTrustHttpClient;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("github_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
@UseHttpClient(SslTrustHttpClient.class)
public class ParallelRunDemoTest {
    @Test
    @JsonTestCase("helloworld/hello_world_status_ok_assertions.json")
    public void testGet_a() throws Exception {
    }

    @Test
    @JsonTestCase("helloworld/hello_world_status_ok_assertions.json")
    public void testGet_b() throws Exception {
    }

    @Test
    @JsonTestCase("helloworld/hello_world_status_ok_assertions.json")
    public void testGet_c() throws Exception {
    }

    @Test
    @JsonTestCase("helloworld/hello_world_status_ok_assertions.json")
    public void testGet_d() throws Exception {
    }

    @Test
    @JsonTestCase("helloworld/hello_world_status_ok_assertions.json")
    public void testGet_e() throws Exception {
    }

}
