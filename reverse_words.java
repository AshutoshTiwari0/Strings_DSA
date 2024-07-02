package Strings;
import java.util.Scanner;

public class reverse_words {

    // Reverse method to reverse characters in a char array from index low to high
    static void reverse(char str[], int low, int high) {
        while (low <= high) {
            // swap
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }

    // Method to reverse words in a char array
    static void reverseWords(char str[], int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1); // Reverse the last word
        reverse(str, 0, n - 1);     // Reverse the entire string
    }

    public static void main(String[] args) {
        System.out.println("Enter a sentence:");
        Scanner ob = new Scanner(System.in);
        String a = ob.nextLine();
        char[] str = a.toCharArray();
        reverseWords(str, str.length);
        System.out.println("Reversed sentence:");
        System.out.println(new String(str));
        ob.close();
    }
}
