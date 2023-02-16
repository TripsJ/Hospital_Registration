import java.util.Scanner;

import static java.lang.System.exit;

public class Controller {
    public static void menu(Records recs){
        Scanner sc = new Scanner(System.in);
        System.out.println("records register ?");
        String input = sc.nextLine().toLowerCase();
        switch (input) {
            case "records" ->{recs.show();
                sc.close();
                }
            case "register" -> {recs.register();
                sc.close();}
            default -> {sc.close();exit(0);}

        }
}
