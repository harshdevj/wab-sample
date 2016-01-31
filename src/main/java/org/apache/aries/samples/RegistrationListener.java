package org.apache.aries.samples;

import java.util.Map;

public class RegistrationListener {

    public void register(Account account, Map properties) {
        System.out.println("RegistrationListener, service registered: " + account + " with properties " + properties);
    }

    public void unregister(Account account, Map properties) {
        System.out.println("RegistrationListener, service unregistered: " + account + " with properties " + properties);
    }

    public String toString() {
        return "RegistrationListener";
    }
}
