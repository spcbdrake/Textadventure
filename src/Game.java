import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by benjamindrake on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to my Text Adventure");

        PLayer player = new PLayer();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
    }


}
