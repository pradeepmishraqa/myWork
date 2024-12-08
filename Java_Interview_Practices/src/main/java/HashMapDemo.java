import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String [] args){

        HashMap<String, Integer> hashmap = new HashMap<>();
                    hashmap.put("A", 5);
                    hashmap.put("B", 2);
                    hashmap.put("C", 3);
                    hashmap.put("D", 4);

                    String key = hashmap.keySet().iterator().next();
                    System.out.println(hashmap.get(key));
                    System.out.println(hashmap.getOrDefault(key, 0));

                    for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }

                    for(int i=0;i<hashmap.size();i++){
                        System.out.println(hashmap.getOrDefault(key,0));
                    }

    }
}
