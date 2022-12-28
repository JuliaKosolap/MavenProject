package Module1.Task1;

import com.google.gson.Gson;

import java.util.Map;

public class MyApp {
    public static void main(String[] args) {
        Map<String, String> myName = Map.of("name", "Julia", "lastName", "Kosolap");
        System.out.println(new Gson().toJson(myName));
    }
}
