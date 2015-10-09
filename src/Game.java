import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by benjamindrake on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to my Text Adventure");

        while (true) {
            PLayer player = new PLayer();
            player.chooseName();
            player.chooseWeapon();
            player.chooseArea();
        }
    }
    static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.startsWith("/")) {
            if (s.equals("/help")) {
                System.out.println("These are the available commands:");
                System.out.println("/help => List available commands");
            } else if (s.equals("/exit")) {
                System.exit(0);
            }
            return nextLine();
        } else {
            return s;
        }
    }
}
