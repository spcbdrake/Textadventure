import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by benjamindrake on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to my Text Adventure");
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Fuck you!," + name);

        System.out.println("[1] Pick up Sword");
        System.out.println("[2] Pick up mallet");
        String weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1) {
            System.out.println("What is that shit?");
        } else if (weaponNum == 2) {
            System.out.println("What the shit are you going to do with a bigass hammer?");
        } else {
            throw new Exception("Invalid weapon.");
        }

        System.out.println("[1] Enter Forest");
        System.out.println("[2] Enter tunnel");
        String area = scanner.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Entering the forest...");
        } else if (areaNum == 2) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid area");
        }


    }


}
