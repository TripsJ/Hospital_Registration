import java.time.LocalDateTime;

public interface PersonRecord {
    String getName();

    void setName(String name);

    String getFirstname();

    void setFirstname(String firstname);

     LocalDateTime getTimestamp();

    void setTimestamp(LocalDateTime timestamp);

    String toString();
}
