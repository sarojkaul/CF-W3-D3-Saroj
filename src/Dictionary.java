import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//single key mutiple values
public class Dictionary {
    public static void main(String[] args) {
        Map<String, HashMap<String, String>> dictionary = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> word1 = new HashMap<>();
        word1.put("Meaning","looking for something");
        word1.put("Description","google");

        dictionary.put("Search", word1);

        for(String element : dictionary.keySet() ) {
            System.out.println("Name of the word: " + element + "\nMeaning: " + dictionary.get(element).get("Meaning") + "\nDescription: " + dictionary.get(element).get("Description"));
        }




        System.out.println(dictionary);

    }
}
