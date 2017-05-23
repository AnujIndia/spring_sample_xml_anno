import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pularsight.service.CustomerService;
import com.pularsight.service.CustomerServiceImpl;


public class Applcation {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applcationContext.xml");
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		System.out.print(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		
		

	}

}
