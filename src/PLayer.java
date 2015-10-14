import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by benjamindrake on 10/9/15.
 */
public class PLayer extends Character {
    String area;
    ArrayList items = new ArrayList();

    public PLayer() {
        health = 100;
        damage = 20;
    }

    void chooseName() {
        System.out.println("What's your name?");
        name = Game.nextLine();
        System.out.println(String.format("Good luck, %s", name));
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up Sword");
        System.out.println("[2] Pick up Warhammer");
        int weaponNum = Integer.valueOf(Game.nextLine());
        if (weaponNum == 1) {
            weapon = new Weapon();
            weapon.name = "Sword";
            weapon.damage = 10;
        } else if (weaponNum == 2) {
            weapon= new Weapon();
            weapon.name = "Warhammer";
            weapon.damage = 10;
        } else {
            throw new Exception("That is not a weapon!");
        }
        System.out.println(String.format("That's a fine %s!", weapon.name.toLowerCase()));
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
            throw new Exception("You can't go there!");
        }
    }

    void findItem(String item) {
        System.out.println("Found item! Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")) {
            System.out.println(String .format("You found a %s", item));
            items.add(item);
        }
    }
}
