import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beenTree =
                (Cat) applicationContext.getBean("cat");
        Cat beenFour =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanOne.equals(beanTwo));
        System.out.println(beenTree.equals(beenFour));
    }
}