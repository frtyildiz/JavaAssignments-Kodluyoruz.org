package hw03;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entry: ");
        System.out.println(palindrome(s.nextLine()));
    }

    public static String palindrome(String str)
    {
        String userEntry = str.replaceAll(" ", "");

        boolean isPalindrome = true;
        String reverse = "";
        for (int i = userEntry.length() - 1; 0 <= i; i--)
        {
            reverse += userEntry.charAt(i);
        }

        if (userEntry.equals(reverse))
        {
            System.out.println(isPalindrome);
        }
        else
        {
            System.out.println(!isPalindrome);
        }
        return reverse;
    }
}
