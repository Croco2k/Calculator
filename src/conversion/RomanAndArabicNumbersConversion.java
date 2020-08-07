package conversion;

public class RomanAndArabicNumbersConversion {

    public static int getRomanNumber(String value) {
        switch (value) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        return 0;
    }

    public static String getArabicNumber(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        int times = 0;
        String[] romans = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] arabic = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        for (int i = arabic.length - 1; i >= 0; i--) {
            times = value / arabic[i];
            value %= arabic[i];
            while (times > 0) {
                stringBuilder.append(romans[i]);
                times--;
            }
        }
        return stringBuilder.toString();
    }
}
