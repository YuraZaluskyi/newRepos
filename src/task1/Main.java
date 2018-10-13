package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "$poi$nt j$av$a $$wo$rd";
        String backwardsWord = "";

        System.out.println("Text = " + text);

        int i = 0;

//        проходимо по тексту
        while (i < text.length()) {
            String word = "";

//            складаємо слово до пробілу, якщо і = довжині тексту - break.
            while ((int) text.charAt(i) != 32) {
                word = word + text.charAt(i);
                i++;
                if (i == text.length()) {
                    break;
                }
            }
            int j = 0;
            int k = 0;

//            перевертаємо число попускаючи спецсимволи


            // УСЯ МАГІЯ ТУТ!!!!!!!!!!
////////////////////////////////////////////////////////////////////////////////////////////////////
            while (j < word.length()) {

                if (word.charAt(j) == '$') {
                    backwardsWord = backwardsWord + word.charAt(j);
                    /*
                    * Стосовно спецсимволів - то не проблема. Можна перелічити усі через
                    * логічний оператор ||
                    * Хоча, я думаю краще використати регулярні вирази,
                    * але про них потрібно почитати ;-)
                    * */

                } else if (word.charAt(j) != '$') {
                    while ((word.charAt(word.length() - 1 - k) == '$') && (k < word.length())) {
                        k++;
                    }
                    backwardsWord = backwardsWord + word.charAt(word.length() - 1 - k);
                    k++;
                }
                j++;
            }
// ///////////////////////////////////////////////////////////////////////////////////////////////////
            i++;

//            додаємо пробіл у результуючий тект
            backwardsWord = backwardsWord + " ";

        }
        System.out.println("");
        System.out.println("Backwards text = " + backwardsWord);
    }
}
