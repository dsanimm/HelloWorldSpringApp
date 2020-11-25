import com.bridgelabz.Batch;

import com.bridgelabz.MyConfiguration;
import com.bridgelabz.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyConfiguration.class);
        context.refresh();
        Batch batch= (Batch)context.getBean("batch");
        batch.getStudent().displayInfo();
    }
}
