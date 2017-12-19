package ru.itis;

public class Main {

    public static void main(String[] args) {
        String words[] = {"бээ!", "б", "", "бэээээ!", "бэ", "!"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " isGoodWordBySwitch:" +
                    isGoodWordBySwitch(words[i]));
            System.out.println(words[i] + " isGoodWordByMatrix:" +
                    isGoodWordByMatrix(words[i]));
            System.out.println();
        }
    }

    public static boolean isGoodWordBySwitch(String text) {
        boolean isGoodWord = false;
        boolean isNotFiniteState = true;
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        while (isNotFiniteState & i < array.length) {
            switch (state) {
                case 0:
                    if (array[i] == 'б') {
                        i++;
                        state++;
                    } else i = array.length;
                    break;
                case 1:
                    if (array[i] == 'э') {
                        i++;
                    } else if (array[i] != 'э') {
                        state++;
                    } else i = array.length;
                    break;
                case 2:
                    if (array[i] == '!') {
                        i++;
                        state++;
                        isNotFiniteState = false;
                    } else i = array.length;
                    break;
            }
        }
        if (!isNotFiniteState) {
            isGoodWord = true;
        }
        return isGoodWord;
    }

    public static boolean isGoodWordByMatrix(String text) {
        boolean isGoodWord = false;
        char[] array = text.toCharArray();
        int[][] matrix = new int[array.length][3];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
            matrix[i][1] = 0;
            matrix[i][2] = 0;
            if (count < array.length & array.length > 1) {
                if (array[count] == 'б') {
                    matrix[i][0] += 1;
                    count++;
                } else if (array[count] == 'э') {
                    matrix[i][1] += 1;
                    count++;
                } else if (array[count] == '!') {
                    matrix[i][2] += 1;
                    count++;
                    if (matrix[0][0] == 1 & matrix[1][1] != 0) {
                        isGoodWord = !isGoodWord;
                    }
                }
            }
        }
        return isGoodWord;
    }
}
