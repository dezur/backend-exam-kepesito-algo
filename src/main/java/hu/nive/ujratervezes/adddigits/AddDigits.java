package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int sum = 0;

        try {
            if (input.length() == 0) {
                return -1;
            }

            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    String tmp = input.substring(i, i + 1);
                    sum += Integer.parseInt(tmp);
                }
            }
            return sum;
        } catch (NullPointerException ex) {
            return -1;
        }
    }
}
