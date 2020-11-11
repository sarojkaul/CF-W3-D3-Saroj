import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("saroj", 98003456);
        phonebook.put("kaul", 2345677);
        phonebook.put("gannna", 234556);
        for (Map.Entry m : phonebook.entrySet()) {
            System.out.println(m.getKey() +"  " +m.getValue());
        }
        //Deleting specific phonenumber
        if(phonebook.containsKey("gannna")){
            phonebook.remove("gannna",234556);
            System.out.println(phonebook);
        }
    }
}
