package org.jsmart.zerocode.zerocodejavaexec;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DbSqlExecutorTest {

    @Test
    public void testJavaMethod_exec() throws JsonProcessingException {
        DbSqlExecutor executor = new DbSqlExecutor();
        Map<String, List<DbResult>> resultMap = executor.fetchDbCustomers("select id, name from customers");

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(resultMap);

        assertThat(json, is("{\"dbResults\":[{\"id\":1,\"name\":\"Elon\"},{\"id\":2,\"name\":\"Jeff\"}]}"));
        System.out.println("json: " + json);

    }
}