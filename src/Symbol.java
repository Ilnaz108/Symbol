public class Symbol {

    public static String one() {
        String l = "";
        String str = "hello World";
        int count = 0;
        char chars[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (chars[i] == chars[j] && i != j) {
                    count++;
                }
            }

            if (count < 1) {
                l += str.charAt(i);
            } else {
                count = 0;
            }
        }

        return l;
    }
}