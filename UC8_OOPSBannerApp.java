import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 *
 * UC8: Use Map for Character Patterns
 *
 * @author Anushka
 * @version 8.0
 */

public class UC8_OOPSBannerApp {

    // Function to render banner
    public static void printBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "**   **",
                "**     ",
                " ***** ",
                "     **",
                "**   **",
                " ***** "
        });

        printBanner("OOPS", patternMap);
    }
}