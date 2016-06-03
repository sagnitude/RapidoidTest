package org.test;

import com.google.gson.Gson;
import org.json.simple.JSONValue;
import org.rapidoid.data.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sagnitude on 2016/6/3.
 */
public class Response {
    private Object d;
    private String m;
    private int    s;
    private String t;

    public Response(Object d) {
        this.d = d;
        this.m = "SUCCESS";
        this.s = 0;
        this.t = ""; //System.currentTimeMillis() costs 0.7s per 10,000,000 processes
    }

    public static Object failed() {
        Response resp = new Response(null);
        resp.m = "FAILED";
        resp.s = -1;
        resp.t = System.currentTimeMillis() + "";
        return resp.asMap();
    }

    public static Object success() {
        return new Response("").asMap();
    }

    public Map<String, Object> asMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("d", d);
        map.put("m", m);
        map.put("s", s);
        map.put("t", t);
        return map;
    }

    private static final Gson gson = new Gson();

    public String toJsonString() {
        return gson.toJson(this);
    }

    public String simpleToJson() {
        return JSONValue.toJSONString(this);
    }

    @Override
    public String toString() {
        String content = (d instanceof String) ? (String) d : JSON.stringify(d);
//        String content = (d instanceof String) ? (String) d : gson.toJson(d);
        return "\"d\"=" + content + "," +
                "\"m\"=" + "" + "," +
                "\"s\"=" + 1 + "," +
                "\"t\"=" + t;
    }
}
