import java.util.Scanner;

import static java.lang.System.exit;

public class Controller {
    public void menu(Records recs,Scanner sc) {

        System.out.println("records register ?");
        String input = sc.nextLine().toLowerCase();
        switch (input) {
            case "records" -> {
                recs.show();
                this.menu(recs,sc);
            }
            case "register" -> {
                recs.register(sc);
                this.menu(recs,sc);
            }
            default -> {
                sc.close();
                exit(0);
            }

        }
    }
}
