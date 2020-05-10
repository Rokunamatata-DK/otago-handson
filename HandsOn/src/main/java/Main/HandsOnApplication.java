package Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import dao.*;


@SpringBootApplication
public class HandsOnApplication {

	
    
    public HandsOnApplication() {

		StudentDAOInterface dao = new StudentDAO();

//		port(8080);
//
//		use(new Gzon());
//
//		use(new CustomersResource(dao));
//		use(new CustomerResource(dao));
//
//		use(new ApiTool().swagger(new ApiTool.Options("/swagger").use("accounts.yaml")));

	}
    
    public static void main(String[] args) {
		SpringApplication.run(HandsOnApplication.class, args);
	}

}

