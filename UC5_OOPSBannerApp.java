/**
 * OOPSBannerApp
 *
 * UC5: Banner using Array Initialization with String.join()
 *
 * @author Anushka
 * @version 5.0
 */

public class UC5_OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            String.join("  ", "  *****  ", "  *****  ", " ******  ", "  *****  "),
            String.join("  ", " **   ** ", " **   ** ", " **   ** ", " **   ** "),
            String.join("  ", " **   ** ", " **   ** ", " **   ** ", " **      "),
            String.join("  ", " **   ** ", " **   ** ", " ******  ", "  *****  "),
            String.join("  ", " **   ** ", " **   ** ", " **      ", "       **"),
            String.join("  ", " **   ** ", " **   ** ", " **      ", " **   ** "),
            String.join("  ", "  *****  ", "  *****  ", " **      ", "  *****  ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}