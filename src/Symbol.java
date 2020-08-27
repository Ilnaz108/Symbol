public class Symbol {

    public static class ArbitrarySymbols {
        public static String one() {
            String l = "";
            String str = "hello Wrold";
            int count = 0;
            int count1 = 0;
            char chars[] = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (chars[i] == chars[j]) {

                        count++;
                    }

                }
                if (count > 1) {
                } else {
                    l += str.charAt(i);
                    count = 0;
                }
            }
            return l;
        }

        public static void main(String[] args) {
            System.out.println(one());

        }
    }
}
