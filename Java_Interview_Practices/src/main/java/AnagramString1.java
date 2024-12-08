import java.util.Arrays;

public class AnagramString1 {

    public static void main(String[] args) {

        String s1 = "army";
        String s2 = "mary";
        char[] arr1=s1.toLowerCase().toCharArray();
        char[] arr2=s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println("Given String is an Anagram");
        }
        else {
            System.out.println("Given String is Not Anagram");
        }
    }
}
