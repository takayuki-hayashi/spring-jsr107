package hayssh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DomainRepository repository = context.getBean(DomainRepository.class);
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(1));
	}
}