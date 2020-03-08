package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import structures.zad1.Osoba;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Osoba pawelek = new Osoba("Paweł", "Recław", 20);


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String result = objectMapper.writeValueAsString(pawelek);

            System.out.println(result);


            objectMapper.writeValue(new File("person.json"), pawelek);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
