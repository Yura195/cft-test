package com.ter.sort;

/**
 *  Ошибка отсутствия передаваемых файлов
 */
public class FilesNotFoundException extends Exception {
    public FilesNotFoundException(String message) {
        super(message);
    }
}
