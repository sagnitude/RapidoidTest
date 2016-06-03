package org.test;

import org.rapidoid.http.customize.JsonResponseRenderer;
import org.rapidoid.setup.On;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;

/**
 * Created by sagnitude on 2016/6/4.
 */
public abstract class TestBase {

    protected static long approximateMillis = 0;
    protected static long staticMillis = System.currentTimeMillis();

    static {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                approximateMillis = System.currentTimeMillis();
            }
        }, 1, 1);
    }

    protected static long getTimeMillis() {
        return approximateMillis;
    }

    protected JsonResponseRenderer renderJson = On.custom().jsonResponseRenderer();

    protected void profile(Callable<?> handler) {
        profile(handler, 10000000);
    }

    private void profile(Callable<?> handler, int times) {
        long start = getTimeMillis();
        try {
            for (int i = 0; i < times; i++) {
                handler.call();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(getTimeMillis() - start);
    }

    protected OutputStream nullOutput = new OutputStream() {
        @Override
        public void write(int b) throws IOException {
            //
        }
    };
}
