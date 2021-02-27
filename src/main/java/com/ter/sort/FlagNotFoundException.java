package com.ter.sort;

public class FlagNotFoundException extends Exception {
    public FlagNotFoundException() {
        super("Data type flag is not set");
    }
}
