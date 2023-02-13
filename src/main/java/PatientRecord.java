public class PatientRecord extends Record{
    public PatientRecord() {
    }

    String VisitedDoctor;

    public String getVisitedDoctor() {
        return VisitedDoctor;
    }

    public void setVisitedDoctor(String visitedDoctor) {
        VisitedDoctor = visitedDoctor;
    }

    @Override
    public String toString() {
        return "PatientRecord{" +
                "VisitedDoctor='" + VisitedDoctor + '\'' +
                '}';
    }
}
