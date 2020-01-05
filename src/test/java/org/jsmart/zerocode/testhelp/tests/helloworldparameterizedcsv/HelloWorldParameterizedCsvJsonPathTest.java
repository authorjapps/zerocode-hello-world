package org.jsmart.zerocode.testhelp.tests.helloworldparameterizedcsv;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("github_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HelloWorldParameterizedCsvJsonPathTest {

    @Test
    @Scenario("parameterized_csv/hello_world_test_parameterized_csv_json_path.json")
    public void testGetByUserNames_csvJsonPath() throws Exception {
    }


}
