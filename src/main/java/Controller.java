import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Controller {
    private ArrayList<PersonRecord> records = new ArrayList<>();

    Scanner sc =new Scanner(System.in);
    AnnotationConfigApplicationContext context;

    public void setContext(AnnotationConfigApplicationContext context) {
        this.context = context;
    }




    enum Staff{
        DR_BANKEN("Dr. N. Banken"),
        DR_BROODCOORENS("Dr. M. Broodcoorens" );

        private final String name;
        Staff(String n){
            name = n;
        }

    }
    public void menu() {

        System.out.println("records register ?");
        String input = sc.nextLine().toLowerCase();
        switch (input) {
            case "records" -> {
                this.show();
                this.menu();
            }
            case "register" -> {
                register();
                this.menu();
            }
            default -> {
                sc.close();
                exit(0);
            }

        }
    }
    public void show() {
        for (PersonRecord rec:records
        ) {
            System.out.println(rec);

        }
    }


    private void makeVisit() {
        VisitorRecord visitor = (VisitorRecord) this.context.getBean("visitorinit");
        System.out.println("Please enter your Firstname: ");
        String first = sc.nextLine();
        System.out.println("Please enter your Lastname: ");
        String last =sc.nextLine();
        visitor.setFirstname(first);
        visitor.setName(last);
        visitor.setTimestamp(LocalDateTime.now());
        records.add(visitor);
}

    public void register() {

        System.out.println("Who are you seeing?: ");
        System.out.println(" ");
        System.out.println("Enter 1 for "+ Staff.DR_BROODCOORENS.name);
        System.out.println("Enter 2 for "+ Staff.DR_BANKEN.name);
        System.out.println("enter 3 to visit a Patient");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> makeApointement(Staff.DR_BROODCOORENS);
            case 2 -> makeApointement(Staff.DR_BANKEN);
            default -> makeVisit();
        }
    }

    private void makeApointement(Staff member) {
        PatientRecord patient = (PatientRecord) this.context.getBean("patientinit");
        patient.setVisitedDoctor(member.name);
        System.out.println("You have an appointement with "+ member.name);
        System.out.println("Please enter your Firstname: ");
        String first = sc.nextLine();
        System.out.println("Please enter your Lastname: ");
        String last =sc.nextLine();
        patient.setFirstname(first);
        patient.setName(last);
        patient.setTimestamp(LocalDateTime.now());
        records.add(patient);
        System.out.println("You are registered, please proceed");


    }
}
