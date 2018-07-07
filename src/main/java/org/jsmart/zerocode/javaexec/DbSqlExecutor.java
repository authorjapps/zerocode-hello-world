package org.jsmart.zerocode.javaexec;

import org.jsmart.zerocode.javaexec.pojo.DbResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbSqlExecutor {

    public static final String RESULTS_KEY = "results";

    public Map<String, List<DbResult>> fetchDbCustomers(String sqlStatement){

        Map<String, List<DbResult>> results = executeSelectSql(sqlStatement);

        return results;
    }

    private Map<String, List<DbResult>> executeSelectSql(String sqlStatement) {
        /**
         * ------------------------------------------------------------------------------
         * e.g.
         * You can use JDBC connection and fetch teh result
         * -or-
         * Use spring JDBC template with the data source to your DB(Oracle or MySql etc)
         * ------------------------------------------------------------------------------
         */

        /**
         * Suppose you finish execution and you got the list of results from DB
         * Hard coded values are for example understanding only.
         * In reality you get this from DB.
         */
        List<DbResult> results = new ArrayList<>();
        results.add(new DbResult(1, "Elon Musk"));
        results.add(new DbResult(2, "Jeff Bezos"));

        Map<String, List<DbResult>> resultsMap = new HashMap<>();
        resultsMap.put(RESULTS_KEY, results);

        return resultsMap;

    }
}
