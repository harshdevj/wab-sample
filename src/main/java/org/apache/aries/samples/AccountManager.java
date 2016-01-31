package org.apache.aries.samples;

import org.osgi.framework.Bundle;
import java.util.List;

public class AccountManager {

    protected Bundle bundle;
    protected Account account;
    protected List<Long> accounts;

    public void setManagerBundle(Bundle bundle) {
        this.bundle = bundle;
        System.out.println("AccountManager, injected bundle: " + bundle);
    }

    public Bundle getManagerBundle() {
        return this.bundle;
    }

    public void setManagedAccount(Account account) {
        this.account = account;
        System.out.println("AccountManager, injected account: " + account);
    }

    public Account getManagedAccount() {
        return this.account;
    }

    public void setAccountNumbers(List<Long> accounts) {
        this.accounts = accounts;
        System.out.println("AccountManager, injected account numbers: " + accounts);
    }

    public List<Long> getAccountNumbers() {
        return this.accounts;
    }

    public String toString() {
        return "AccountManager";
    }
}
