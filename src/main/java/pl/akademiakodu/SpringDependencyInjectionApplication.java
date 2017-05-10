package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.akademiakodu.beans.MessagePrinter;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDependencyInjectionApplication.class, args);

//		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
//		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
//		System.out.println("DZIAŁA");
//		printer.print();
//
//		Employee employee = ctx.getBean((Employee.class));
//		employee.setName("Dominik");
//		employee.getMessage().printEmployee(employee);
//
//		ctx.close();
	}
}
