import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by benjamindrake on 10/9/15.
 */
public class PLayer {
    String name;
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    void chooseName() {
        System.out.println("What's your name?");;
        name = Game.nextLine();
        System.out.println("Good Luck ," + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up Sword");
        System.out.println("[2] Pick up mallet");
        weapon = Game.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1) {
            System.out.println("A fine weapon!");
        } else if (weaponNum == 2) {
            System.out.println("Thats a pretty hefty hammer!");
        } else {
            throw new Exception("Invalid weapon.");
        }
    }

    void chooseArea() throws Exception {
        System.out.println("[1] Enter Forest");
        System.out.println("[2] Enter tunnel");
        area = Game.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Entering the forest...");
        } else if (areaNum == 2) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid area");
        }
    }

    void findItem(String item) {
        System.out.println("Found item! Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")) {
            System.out.println("You found a " + item);
            items.add(item);
        }
    }
}
