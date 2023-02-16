import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

@Component
public class Records {
    enum Staff{
        DR_BANKEN("Dr. N. Banken"),
        DR_BROODCOORENS("Dr. M. Broodcoorens" );

        private final String name;
        Staff(String n){
            name = n;
        }

    }

    public Records() {
    }

    private ArrayList <PersonRecord> records = new ArrayList<>();

    public void setContext(AnnotationConfigApplicationContext context) {
        this.context = context;
    }

    private AnnotationConfigApplicationContext context;
    public ArrayList<PersonRecord> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<PersonRecord> records) {
        this.records = records;
    }


    public void show() {
        for (PersonRecord rec:records
             ) {
            System.out.println(rec);

        }
    }

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you seeing?: ");
        System.out.println(" ");
        System.out.println("Enter 1 for "+Staff.DR_BROODCOORENS.name);
        System.out.println("Enter 2 for "+Staff.DR_BANKEN.name);
        System.out.println("enter 3 to visit a Patient");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> makeApointement(Staff.DR_BROODCOORENS);
            case 2 -> makeApointement(Staff.DR_BANKEN);
            default -> makeVisit();
        }
        sc.close();
    }

    private void makeVisit() {
            VisitorRecord visitor = (VisitorRecord) this.context.getBean("visitorinit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your Firstname: ");
            String first = sc.nextLine();
            System.out.println("Please enter your Lastname: ");
            String last =sc.nextLine();
            visitor.setFirstname(first);
            visitor.setName(last);
            visitor.setTimestamp(LocalDateTime.now());
            records.add(visitor);
            sc.close();


    }

    private void makeApointement(Staff member) {
        PatientRecord patient = (PatientRecord) this.context.getBean("patientinit");
        Scanner sc = new Scanner(System.in);
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
        sc.close();
        System.out.println("You are registered, please proceed");


    }
}
