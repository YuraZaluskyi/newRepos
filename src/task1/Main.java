package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "point word point green blue screen adidas vasysdas";
        String backwardsWord = "";

        System.out.println("Text = " + text);

        int i = 0;

        while (i < text.length()) {
            String word = "";

//            складаємо слово до пробілу, якщо і = довжині тексту - break.
            while ((int) text.charAt(i) != 32) {
                word = word + text.charAt(i);
                i++;
                if (i == text.length()){
                    break;
                }
            }

//            перевертаємо слово
            for (int k = word.length() - 1; k >= 0; k--) {
                backwardsWord = backwardsWord + word.charAt(k);
            }

//            пропускаємо знайдений пробіл у тексті
            i++;

//            додаємо пробіл у результуєчий тект
            backwardsWord = backwardsWord + " ";

        }
        System.out.println("");

        System.out.println("Backwards text = " + backwardsWord);
    }
}
