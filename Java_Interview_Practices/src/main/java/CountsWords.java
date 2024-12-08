import java.util.HashMap;

public class CountsWords {

    public static void main (String [] args){

        String str = "i am here to to too learn nothing nothing here";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Integer count = 1;

        String[] words = str.split(" ");

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }

}
