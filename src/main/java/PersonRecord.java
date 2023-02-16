import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public interface PersonRecord {
    String getName();

    void setName(String name);

    String getFirstname();

    void setFirstname(String firstname);

     LocalDateTime getTimestamp();

    void setTimestamp(LocalDateTime timestamp);

    String toString();
}
