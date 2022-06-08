import java.util.HashMap;
import java.util.*;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Bark at The Sun", "Bark at the sun...");
        userMap.put("Hungry Like A Cow", "Im hungry like a cow....");
        userMap.put("Happy", "I am happy happy happy....");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}

