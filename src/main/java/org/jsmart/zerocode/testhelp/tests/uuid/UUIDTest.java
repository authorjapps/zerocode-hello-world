package org.jsmart.zerocode.testhelp.tests.uuid;

import org.jsmart.zerocode.core.domain.HostProperties;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@HostProperties(host="https://jsonplaceholder.typicode.com", port=443, context = "")
@RunWith(ZeroCodeUnitRunner.class)
public class UUIDTest {

    @Test
    @Scenario("helloworld_uuid/hello_world_uuid.json")
    public void myTest(){

    }
}
