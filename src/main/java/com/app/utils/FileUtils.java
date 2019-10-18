package com.app.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {


    public static File readFileFromResource(String fileName) {
        return new File(FileUtils.class.getClassLoader().getResource(fileName).getFile());
    }

    public static List fileRowsToList(File file) throws IOException {
        List<String> list = new ArrayList<>();
        if (file == null) {
            return null;
        }
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        return list;
    }

}
