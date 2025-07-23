public class Assignment3 {

    public static void main(String[] args) {
        String str = "AEIOUABCD";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
            if (ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
               System.out.println(ch);
                count++;
            }
        }
        System.out.println("Number of Vowels:"+count);
    }


}
