package org.apache.aries.samples;

public class AccountFactory {

    private String factoryName;

    public AccountFactory(String factoryName) {
        this.factoryName = factoryName;
    }

    public Account createAccount(long number) {
        return new Account(number);
    }

    public String toString() {
        return "AccountFactory[name=" + factoryName + "]";
    }
}
