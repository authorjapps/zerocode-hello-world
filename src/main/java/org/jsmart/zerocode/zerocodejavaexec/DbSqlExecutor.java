package org.jsmart.zerocode.zerocodejavaexec;

import org.jsmart.zerocode.zerocodejavaexec.pojo.Order;
import org.jsmart.zerocode.zerocodejavaexec.pojo.DbResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbSqlExecutor {

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
        List<DbResult> dbResults = new ArrayList<>();
        dbResults.add(new DbResult(1, "Elon Musk"));
        dbResults.add(new DbResult(2, "Jeff Bezos"));

        Map<String, List<DbResult>> resultsMap = new HashMap<>();
        resultsMap.put("dbResults", dbResults);

        return resultsMap;

    }
}
