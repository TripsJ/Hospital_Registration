import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Records recs = new Records();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        switch (input) {
            case "records" -> recs.show();
            case "register" -> recs.register();
        }
        recs.show();
    }
}
