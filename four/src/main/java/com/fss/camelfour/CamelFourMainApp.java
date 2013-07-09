package com.fss.camelfour;

import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class CamelFourMainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.enableHangupSupport();
        main.addRouteBuilder(new CamelFourRouteBuilder());
        main.run(args);
    }

}

