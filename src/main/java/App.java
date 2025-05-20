import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println("Сравнение бинов hw: " + (bean1==bean2));

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(cat1.getName() );
        System.out.println(cat2.getName() );
        System.out.println("Сравнение бинов cat: " + (cat1==cat2));


    }
}