public class CountCharacterOccurances {

    public static void main(String[] args) {

        String str = "My name is Pradeep mishra";
        int i = str.length();
        System.out.println("Length of complete string is"+ ": "+i);

         int j = i-str.replaceAll("m","").length();
        System.out.println("Occurance of Search Char"+": "+j);
    }
}
