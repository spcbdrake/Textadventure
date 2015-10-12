import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by benjamindrake on 10/8/15.
 */
public class Game {
    static PLayer player;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to my Text Adventure");
        player = new PLayer();

        while (true) {
            PLayer player = new PLayer();
            player.chooseName();
            player.chooseWeapon();
            player.chooseArea();
            player.findItem("Shield");
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
            } else if (s.equals("/inv"));
                if (player.items.size() == 0) {
                System.out.println("You have no items");
            }
                for (Object item : player.items) {
                    System.out.println(item);
                }
            return nextLine();
        } else {
            return s;
        }
    }
}
