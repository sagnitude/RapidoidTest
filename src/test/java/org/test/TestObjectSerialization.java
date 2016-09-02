package org.test;

import org.junit.Test;

/**
 * Created by sagnitude on 2016/6/4.
 */
public class TestObjectSerialization extends TestBase {

    @Test
    public void testJackjsonObject() {
//        profile(() -> {
//            renderJson.renderJson(new Response(new Response("").asMap()).asMap(), nullOutput);
//            return null;
//        });
    }

    @Test
    public void testPartialObject() {
        profile(() -> new Response(new Response("").asMap()).toString());
    }

    @Test
    public void testGsonObject() {
        profile(() -> new Response(new Response("").asMap()).toJsonString());
    }

    @Test
    public void testSimpleJsonObject() {
        profile(() -> new Response(new Response("").asMap()).simpleToJson());
    }
}
