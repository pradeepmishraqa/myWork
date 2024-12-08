import java.util.HashMap;

public class FindDuplicateChars {

    public static void main(String[] args) {

        String str = "javaaaaaaa pragaagaa";

        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Integer count = 1;
        for (char word : arr) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Character word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}