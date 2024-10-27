import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat catbean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catbean1.getMessage());

        Cat catbean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catbean1.getMessage());

        if (bean == bean2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (catbean1 == catbean2) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}