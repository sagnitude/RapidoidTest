package org.test;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by sagnitude on 2016/6/3.
 */
@Ignore
public class TestSerialization extends TestBase {

    @Test
    public void testJackjsonString() {
//        profile((req) -> {
//            renderJson.renderJson(req, Response.success(), nullOutput);
//            return null;
//        });
    }

    @Test
    public void testPartialString() {
        profile(() -> new Response("").toString());
    }

    @Test
    public void testGsonString() {
        profile(() -> new Response("").toJsonString());
    }

    @Test
    public void testSimpleJson() {
        profile(() -> new Response("").simpleToJson());
    }
}
