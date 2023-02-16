import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Records recs;
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RecordConfiguration.class);

        recs = (Records)context.getBean("storageinit");
        recs.setContext(context);

    }


    }



    }
}
