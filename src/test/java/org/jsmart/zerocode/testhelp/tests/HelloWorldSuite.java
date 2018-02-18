package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.TestPackageRoot;
import org.jsmart.zerocode.core.runner.ZeroCodePackageRunner;
import org.junit.runner.RunWith;

@TargetEnv("hello_world_host.properties")
@RunWith(ZeroCodePackageRunner.class)
@TestPackageRoot("helloworld_tests")
public class HelloWorldSuite {

}
