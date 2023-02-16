import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
abstract class Record implements PersonRecord{
    private String name;
    private String firstname;

    public Record() {
    }

    private LocalDateTime timestamp;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
