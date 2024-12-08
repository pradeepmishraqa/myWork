public class RemoveJunkChars {

    public static void main(String[] args) {
        String str ="&^%&%%$&%^*^^Selenium ^&^&^&^& JAVA(&(&*&**&*&";

        //By using regular expression [^a-zA-Z0-9] ^ means except these nothing accepted

      str=  str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(str);
    }
}
