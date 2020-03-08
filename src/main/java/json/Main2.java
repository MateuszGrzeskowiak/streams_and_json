package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.zad1.RecipesResponse;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            RecipesResponse response = objectMapper.readValue(new File("recipies.json"), RecipesResponse.class);
            response.getResults().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
