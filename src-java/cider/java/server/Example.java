package cider.java.server;

import cider.java.server.CiderServer;

public class Example {

    public static void main(String[] args) {
        CiderServer.start(1112);
        CiderServer.put("h", "Hello World");
        System.out.println("Should now be running");
    }

}
