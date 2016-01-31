package org.apache.aries.samples;

public class StaticAccountFactory {

    public static Account createAccount(long number) {
        return new Account(number);
    }

}
