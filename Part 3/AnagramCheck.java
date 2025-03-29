import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        // Convert both strings to lowercase to ignore case differences
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are NOT Anagram");
        }
    }
}
