package com.ter.sort;

import java.util.List;

public class Config {
    public final Type type;
    public final Direction direction;
    public final String outputFile;
    public final List<String> inputFiles;

    public Config(Type type, Direction direction, List<String> inputFiles, String outputFile) {
        this.type = type;
        this.direction = direction;
        this.inputFiles = inputFiles;
        this.outputFile = outputFile;
    }
}
