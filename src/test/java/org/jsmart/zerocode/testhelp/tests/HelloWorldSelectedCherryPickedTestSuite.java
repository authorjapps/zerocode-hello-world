package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.Scenarios;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseHttpClient;
import org.jsmart.zerocode.core.runner.ZeroCodePackageRunner;
import org.jsmart.zerocode.zerocodejavaexec.httpclient.CustomHttpClient;
import org.junit.runner.RunWith;

/**
 * This is an example of cherry-picking any number of tests and running them as a suite.
 */
@TargetEnv("my_web_app.properties")
@UseHttpClient(CustomHttpClient.class)
@RunWith(ZeroCodePackageRunner.class)
@Scenarios({
        @Scenario("helloworld_more/hello_world_all_integrated_apis.json"),
        @Scenario("helloworld_properties_reading/use_common_SAML_token_as_headers.json"),
})
public class HelloWorldSelectedCherryPickedTestSuite {
}
