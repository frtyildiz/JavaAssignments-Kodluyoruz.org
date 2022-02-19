package hw01;

import java.util.Scanner;

public class StringiTersYazdirma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entry: ");
        System.out.println(reverse(s.nextLine()));
    }

    public static String reverse(String str) {
        String dummyReverse = "";

        for (int i = str.length()-1; 0 <= i; i--)
            dummyReverse = dummyReverse +  str.charAt(i);
        return dummyReverse;
    }
}
