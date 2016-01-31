package org.apache.aries.samples;

public class MyAccount extends Account implements java.io.Serializable {

    public MyAccount(long number) {
        super(number);
    }

    public String toString() {
        return "MyAccount[number=" + number + ", description=" + description + "]";
    }
}
