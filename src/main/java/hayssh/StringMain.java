package hayssh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringMain {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			DomainRepository repository = context.getBean(DomainRepository.class);
			System.out.println(repository.findById(1,"h1","h2"));
			System.out.println(repository.findById(2,"h1","h2"));
			System.out.println(repository.findById(1,"h1","h1"));
		}
	}
}