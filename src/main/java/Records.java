import java.util.ArrayList;

public class Records {

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
    }
}
