import java.util.Scanner;

/**
 * Created by benjamindrake on 10/9/15.
 */
public class PLayer {
    String name;
    String weapon;
    String area;

    void chooseName() {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Fuck you!," + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up Sword");
        System.out.println("[2] Pick up mallet");
        Scanner scanner = new Scanner(System.in);
        weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1) {
            System.out.println("What is that shit?");
        } else if (weaponNum == 2) {
            System.out.println("What the shit are you going to do with that bigass hammer?");
        } else {
            throw new Exception("Invalid weapon.");
        }
    }

    void chooseArea() throws Exception {
        System.out.println("[1] Enter Forest");
        System.out.println("[2] Enter tunnel");
        Scanner scanner = new Scanner(System.in);
        area = scanner.nextLine();
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
