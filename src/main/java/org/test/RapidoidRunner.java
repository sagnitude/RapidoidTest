package org.test;

import org.rapidoid.http.Req;
import org.rapidoid.setup.On;
import org.rapidoid.web.Rapidoid;

/**
 * Created by sagnitude on 5/13/2016.
 */
public class RapidoidRunner {

    public static void main(String[] args) {

        On.address("0.0.0.0").port(5432);

        Rapidoid.run(args);

        On.get("/showUri").json(Req::uri);

        On.get("/test").json("Hi!");
    }
}
