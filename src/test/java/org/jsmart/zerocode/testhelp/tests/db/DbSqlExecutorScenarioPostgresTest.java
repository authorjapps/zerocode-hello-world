package org.jsmart.zerocode.testhelp.tests.db;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

// ----------------------------------------------------------------------------------------
//
// This test is also available in the main repo of "zerocode-tdd" authored by "javiertuya".
// Also, visit the main repo to explore more examples such as:
// - loading a CSV file and validating expected data
// - etc
// ----------------------------------------------------------------------------------------
@TargetEnv("db_test_postgres.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class DbSqlExecutorScenarioPostgresTest {

	// Note: Spin up the DB container before running this test:
	// Example:
	// Using : image: postgres:9.3
	// ➜  zerocode git:(master)> docker-compose -f docker/compose/pg_compose.yml up -d
    @Test
	@Scenario("db/db_sql_execute_postgres.json")
	public void testDbSqlExecute() throws Exception {
	}

}
