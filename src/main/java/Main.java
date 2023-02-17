import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RecordConfiguration.class);
        Controller cr = (Controller) context.getBean("controllerinit");
        cr.setContext(context);
        for(;;){
            cr.menu();}


    }


    }


