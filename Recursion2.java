public class Recursion2 {
    public static void permute(String begin, String end) {
        if (end.length() <= 1) {
            System.out.println(begin + end);
        } else {
            for (int i = 0; i < end.length(); i++) {
                String newString = end.substring(0, i) +
                        end.substring(i + 1);
                permute(begin +
                        end.charAt(i), newString);
            }
        }
    }

    public static void main(String[] args) {
        permute("", "ABC");
    }
}