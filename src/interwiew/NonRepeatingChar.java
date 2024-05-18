package interwiew;

public class NonRepeatingChar {
    public static void main(String[] args) {
    String str = "leetcode";
    int[] freq = new int[26];
    for (int i = 0; i < str.length(); i++) {
        freq[str.charAt(i) - 'a']++;//l-12; a-1
    }

    for (int i = 0; i < str.length(); i++) {
        if (freq[str.charAt(i) - 'a'] == 1) {
            System.out.println("First non-repeating character: " + str.charAt(i));
            return;
        }
    }
    System.out.println("There are no non-repeating characters in the string.");
}
}
