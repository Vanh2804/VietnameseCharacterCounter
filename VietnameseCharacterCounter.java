import java.util.HashSet;
import java.util.Scanner;

public class VietnameseCharacterCounter {
    public static int countVietnameseCharacters(String input) {
        HashSet<String> vietnameseChars = new HashSet<>();
        vietnameseChars.add("aw");
        vietnameseChars.add("aa");
        vietnameseChars.add("dd");
        vietnameseChars.add("ee");
        vietnameseChars.add("oo");
        vietnameseChars.add("ow");
        vietnameseChars.add("w");

        int count = 0;
        int i = 0;
        while (i < input.length()) {
            if (i + 1 < input.length() && vietnameseChars.contains(input.substring(i, i + 2))) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).next();;
        int result = countVietnameseCharacters(inputStr);
        System.out.println(result); 
    }
}