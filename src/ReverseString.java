public class ReverseString {

    public static void main(String[] args) {

        // Reverse a String
        System.out.println(reverse("Max").equals("xaM"));

        // Reverse multiple words in a String
        System.out.println(reverseMulti("Max Derek Joe").equals("eoJ kereD xaM"));

    }

    public static String reverse(String str) {
        String reverse = "";
        int length = str.length();
        for(int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
            System.out.println(reverse);
        }
        return reverse;
    }

    public static String reverseMulti(String str) {
        String reverse = "";
        int length = str.length();
        for(int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
            System.out.println(reverse);
        }
        return reverse;
    }

}
