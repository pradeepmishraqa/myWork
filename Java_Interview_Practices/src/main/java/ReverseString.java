public class ReverseString {

    public static void main(String [] args){

        String st = "Selenium";

        System.out.println(st.length());

        String rev ="";

        for (int i = st.length()-1;i>=0;i--){

            rev = rev + st.charAt(i);
        }
        System.out.println(rev.toLowerCase());
    }
}
