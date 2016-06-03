package org.test;

import org.junit.Test;

/**
 * Created by sagnitude on 2016/6/4.
 */
public class BasicTests extends TestBase {

    @Test
    public void noop() {
        profile(() -> "\"d\"=" + "" + "," +
                "\"m\"=" + "" + "," +
                "\"s\"=" + 1 + "," +
                "\"t\"=" + staticMillis);
    }

    private String temp;

    @Test
    public void testSingleResponseStringBuilder() {
        profile(() -> temp = "\"d\"=" + "" + "," +
                "\"m\"=" + "" + "," +
                "\"s\"=" + 1 + "," +
                "\"t\"=" + staticMillis);
    }

    @Test
    public void testSingleResponse() {
        profile(() -> new Response(""));
    }

    @Test
    public void testSingleResponseAsMap() {
        profile(() -> new Response("").asMap());
    }

    @Test
    public void testNestedResponse() {
        profile(() -> new Response(new Response("")));
    }

    @Test
    public void testNestedResponseAsMap() {
        profile(() -> new Response(new Response("").asMap()));
    }

}
