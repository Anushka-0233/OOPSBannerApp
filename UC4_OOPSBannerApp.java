/**
 * OOPSBannerApp
 *
 * UC4: Render OOPS as Banner using Array & Loop
 *
 * @author Anushka
 * @version 4.0
 */

public class UC4_OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in array
        String[] banner = {

            "  *****    *****    ******    *****  ",
            " **   **  **   **  **   **  **   ** ",
            " **   **  **   **  **   **  **       ",
            " **   **  **   **  ******    *****  ",
            " **   **  **   **  **            ** ",
            " **   **  **   **  **        **   ** ",
            "  *****    *****    **        *****  "
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}