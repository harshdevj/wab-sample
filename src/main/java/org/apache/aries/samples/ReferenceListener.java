package org.apache.aries.samples;

import org.osgi.framework.ServiceReference;
import java.io.Serializable;

public class ReferenceListener {

    public void bind(ServiceReference reference) {
        System.out.println("ReferenceListener, service bound: " + reference);
    }

    public void unbind(ServiceReference reference) {
        System.out.println("ReferenceListener, service unbound: " + reference);
    }

    public String toString() {
        return "ReferenceListener";
    }
}
