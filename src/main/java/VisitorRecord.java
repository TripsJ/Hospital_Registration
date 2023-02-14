public class VisitorRecord extends Record {
    public VisitorRecord() {
    }

    @Override
    public String toString() {
        return "Patient Record{" +
                "name: '" + getName() + '\'' +
                ", firstname=" + "'" + getFirstname()+ '\'' +
                ", timestamp=" + getTimestamp() +
                '}';
    }
}
