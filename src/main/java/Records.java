import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Records {
    private enum Staff{
        DR_BANKEN("Dr. N. Banken"),
        DR_BROODCOORENS("Dr. M. Broodcoorens" );

        private final String name;
        Staff(String n){
            name = n;
        }

    }

    private ArrayList <Record> records = new ArrayList<>();
    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }


    public void show() {
        for (Record rec:records
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
        switch (choice){
            case 1:
                makeApointement(Staff.DR_BROODCOORENS);
                break;
            case 2:
                makeApointement(Staff.DR_BANKEN);
                break;
            default:makeVisit();
            break;
        }
        sc.close();
    }

    private void makeVisit() {
        VisitorRecord visitor = new VisitorRecord();
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
        System.out.println("Registration complete");


    }

    private void makeApointement(Staff member) {
        PatientRecord patient = new PatientRecord();
        Scanner sc = new Scanner(System.in);
        patient.setVisitedDoctor(member.name);
        System.out.println("You have an appointement with "+ member.name);
        System.out.println("Please enter your Firstname: ");
        String first = sc.nextLine();
        System.out.println("Please enter your Lastname: ");
        String last =sc.nextLine();
        System.out.println(first);
        System.out.println(last);
        patient.setFirstname(first);
        patient.setName(last);
        patient.setTimestamp(LocalDateTime.now());
        records.add(patient);
        sc.close();
        System.out.println("You are registered, please proceed");


    }
}
