public class VisitorRecord extends Record {
    public VisitorRecord() {
    }

    @Override
    public String toString() {
        return "Visitor Record: [" +'\n'+
                "name: '" + getName() + '\n' +
                ", firstname: " + "'" + getFirstname()+ '\n' +
                ", timestamp: " + getTimestamp() + '\n'+
                ']';
    }
}
