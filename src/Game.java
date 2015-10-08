import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by benjamindrake on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to my Text Adventure");
        System.out.println("What is your name, traveler?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Good luck," + name);

        System.out.println("[1] Pick up Sword");
        System.out.println("[2] Pick up mallet");
        String weapon = scanner.nextLine();
        if (weapon.equals ("1")) {
            System.out.println("That's a fine sword!");
        } else if (weapon.equals("2")) {
            System.out.println("Thats a bigass mallet!");
        } else {
            throw new Exception("Invalid weapon.");
        }

        System.out.println("[1] Enter Forest");
        System.out.println("[2] Enter tunnel");
        String area = scanner.nextLine();
        if (area.equals ("1")) {
            System.out.printf("Entering the forest...");
        } else if (area.equals("2")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid area");
        }


    }


}
