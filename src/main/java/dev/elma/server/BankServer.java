package dev.elma.server;

import dev.elma.services.BankServices;
import jakarta.xml.ws.Endpoint;

public class BankServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:2001/",new BankServices());
    }
}
