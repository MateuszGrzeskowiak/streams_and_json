package json.zad2;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.zad1.RecipesResponse;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            MenuResponse response = objectMapper.readValue(new File("menu.json"), MenuResponse.class);
            response.getMenuItems().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
