package org.test;

import org.rapidoid.setup.On;

/**
 * Created by sagnitude on 5/13/2016.
 */
public class RapidoidRunner {

    public static void main(String[] args) {
        On.port(8888);
        On.get("/size").json((String msg) -> msg.length());
    }
}
