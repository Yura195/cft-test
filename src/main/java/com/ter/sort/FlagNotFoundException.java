package com.ter.sort;

/**
 * Ошибка отсутствия флага входных параметров
 */
public class FlagNotFoundException extends Exception {
    public FlagNotFoundException() {
        super("Data type flag is not set");
    }
}
