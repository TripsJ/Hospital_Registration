import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Records recs;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RecordConfiguration.class);
        Controller cr = (Controller) context.getBean("controllerinit");
        recs = (Records)context.getBean("storageinit");
        recs.setContext(context);
        cr.menu(recs,sc);


    }


    }


