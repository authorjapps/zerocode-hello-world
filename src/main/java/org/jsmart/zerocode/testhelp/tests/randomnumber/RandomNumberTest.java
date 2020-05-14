package org.jsmart.zerocode.testhelp.tests.randomnumber;

import org.jsmart.zerocode.core.domain.HostProperties;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@HostProperties(host="https://jsonplaceholder.typicode.com", port=443, context = "")
@RunWith(ZeroCodeUnitRunner.class)
public class RandomNumberTest {

    @Test
    @Scenario("helloworld_random_number/hello_world_random_numbers.json")
    public void myTest(){

    }

}
