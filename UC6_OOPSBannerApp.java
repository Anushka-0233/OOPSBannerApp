/**
 * OOPSBannerApp
 *
 * UC6: Banner using Static Helper Methods
 *
 * @author Anushka
 * @version 6.0
 */

public class UC6_OOPSBannerApp {

    // Static method for letter O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "**   **",
                "**     ",
                " ***** ",
                "     **",
                "**   **",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}