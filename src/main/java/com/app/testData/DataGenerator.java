package com.app.testData;

import com.app.model.User;
import com.app.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    private List<String> listOfNames;
    private Random random = new Random();
    private static final String TEST_NAMES_FILE_PATH = "names.txt";

    public DataGenerator() {
        this.listOfNames = getListOfNames();
    }

    private List<String> getListOfNames() {
        File file = FileUtils.readFileFromResource(TEST_NAMES_FILE_PATH);
        try {
            return FileUtils.fileRowsToList(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private int getRandomName() {
        return this.random.nextInt(this.listOfNames.size());
    }

    public User getUser(int id) {
        User user = new User();
        user.setFirstName(this.listOfNames.get(getRandomName()));
        user.setLastName(this.listOfNames.get(getRandomName()));
        user.setDateOfBirth(0);
        user.setWeight(0);
        return user;
    }

}
