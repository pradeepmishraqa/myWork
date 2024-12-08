public class ReverseStringByStringBuffer {

    public static void main(String[] args) {

        String str = "Selenium";
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString().toLowerCase());
    }
}
