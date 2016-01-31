package org.apache.aries.samples;

public class Account {

    protected long number;
    protected String description;

    public Account(long number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void init() {
        System.out.println(toString() + " initialized");
    }

    public void destroy() {
        System.out.println(toString() + " destroyed");
    }

    public String toString() {
        return "Account[number=" + number + ", description=" + description + "]";
    }
}
