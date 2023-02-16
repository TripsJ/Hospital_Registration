import org.springframework.stereotype.Component;

@Component
public class VisitorRecord extends Record implements PersonRecord {
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
