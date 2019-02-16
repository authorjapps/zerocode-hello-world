package org.jsmart.zerocode.testhelp.tests.loadtesting;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeLoadRunner;
import org.jsmart.zerocode.testhelp.tests.loadtesting.restendpoint.TestGitGubEndPoint;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@Ignore
@LoadWith("load_config_sample.properties")
@TestMapping(testClass = TestGitGubEndPoint.class, testMethod = "testGitHubGET_load")
@RunWith(ZeroCodeLoadRunner.class)
public class LoadGetEndPointTest {

}