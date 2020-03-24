import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to door register center. Let's register a door, shall we?" +
                            "\nYour door lead to where?");
        String positionedRoom = read.next();
        System.out.println("Cool! Now tell me, is it open? \nPress N if it's closed, otherwise we'll consider it open.");
        String open = read.next();
        boolean isOpen;
        if (open.equals("n")|open.equals("N")) {
            isOpen = false;
        } else {
            isOpen = true;
        }
        Door door = new Door("kid bedroom", isOpen);
        System.out.println("For now, that's all we need. Would you like to add color or material? Press Y if so, otherwise, well show you the results");
        String menu = read.next();
        if (menu.equals("y")|menu.equals("Y")) {
            System.out.println("What color is your door?");
             String color = read.next();
            door.setColor(color);
            System.out.println("What material is your door?");
            String material;
            material = read.next();
            door.setMaterial(material);
        }
        System.out.println("Congratulations! Your door is now ready. \n" + door);
    }
}
