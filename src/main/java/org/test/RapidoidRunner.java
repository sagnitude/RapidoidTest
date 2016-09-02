package org.test;

import org.rapidoid.setup.App;
import org.rapidoid.setup.On;
import org.rapidoid.web.Rapidoid;

/**
 * Created by sagnitude on 5/13/2016.
 */
public class RapidoidRunner {

    public static void main(String[] args) {
        App.bootstrap().adminCenter();
    }
}
