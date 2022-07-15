package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Welcome to CDS22 and Kube Native Java, Quarkus: " + name;
    }
    
}
