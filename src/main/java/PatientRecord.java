public class PatientRecord extends Record implements PersonRecord{
    public PatientRecord() {
    }

    private String VisitedDoctor;

    public String getVisitedDoctor() {
        return VisitedDoctor;
    }

    public void setVisitedDoctor(String visitedDoctor) {
        VisitedDoctor = visitedDoctor;
    }

    @Override
    public String toString() {
        return "Patient Record: [" +'\n'+
                "Visited Doctor: " + getVisitedDoctor() + '\n' +
                "name: " + getName() + '\n' +
                ", firstname: " + "'" + getFirstname()+ '\n' +
                ", timestamp: " + getTimestamp() +
                '\n'+']';
    }
}
