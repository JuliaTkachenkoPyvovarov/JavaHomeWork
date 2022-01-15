package com.pb.tkachenko.hw9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.pb.tkachenko.hw9.FileNumbers.readPath;

public class main {
    public main() throws IOException {
    }

    public static void main(String[] args) throws Exception {
        FileNumbers.createNumbersFile();
        Path path = Paths.get("files/numbers.txt");
        readPath(path);

        FileNumbers.createOddNumbersFile();
    }
}
