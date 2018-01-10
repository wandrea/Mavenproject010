import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Person p = objectMapper.readValue(new File("C:\\Users\\Helix6\\Documents\\WAndrea\\Mavenproject\\src\\main\\resources\\data.json"),Person.class);
            System.out.println(p.toString());

            Example example = objectMapper.readValue("C:\\Users\\Helix6\\Documents\\WAndrea\\Mavenproject\\src\\main\\resources\\example.json", Example.class);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
