public class Capitalize {

    public static String capitalize(String s) {

        String res = "";

        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
            char ch = (char) ((int) s.charAt(0) - 32);
            res += ch;
        }
        else {
            res += s.charAt(0);
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                char ch = (char) ((int) s.charAt(i) + 32);
                res += ch;

            }
            else {
                res += s.charAt(i);
            }
        }
        return res;

    }

    public static void main(String[] args) {

        System.out.println(capitalize("AdredA"));

    }
}
