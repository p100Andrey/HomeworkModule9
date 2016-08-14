package Homework.Exercise1;

public class CodingText {
    private static final String largeSimvoly = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String smallSimbol = largeSimvoly.toLowerCase();

    private static final int key = 3;

    public String caesar(String input) {
        return new String(getChars(input, -largeSimvoly.length(), key));
    }

    public String caesarDeshifrator(String input) {
        return new String(getChars(input, largeSimvoly.length(), -key));
    }

    private char[] getChars(String input, int n, int k) {
        char[] outPutArr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (largeSimvoly.indexOf(c) != -1) {
                if ((largeSimvoly.indexOf(c) + k) < largeSimvoly.length()) {
                    outPutArr[i] = largeSimvoly.charAt(largeSimvoly.indexOf(c) + k);
                } else {
                    outPutArr[i] = largeSimvoly.charAt(largeSimvoly.indexOf(c) + k + n);
                }
            }
            if (smallSimbol.indexOf(c) != -1) {
                if ((smallSimbol.indexOf(c) + k) < largeSimvoly.length()) {
                    outPutArr[i] = smallSimbol.charAt(smallSimbol.indexOf(c) + k);
                } else {
                    outPutArr[i] = smallSimbol.charAt(smallSimbol.indexOf(c) + k + n);
                }
            }
            if (c < 'А' || c > 'я') {
                outPutArr[i] = c;
            }
        }
        return outPutArr;
    }
}
