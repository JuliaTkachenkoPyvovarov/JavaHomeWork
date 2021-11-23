package com.pb.tkachenko.hw9;

import java.io.IOException;

public class main {
    public main() throws IOException {
    }

    public static void main(String[] args) throws Exception {
        FileNumbers.createNumbersFile();
        FileNumbers.createOddNumbersFile();
    }
}
