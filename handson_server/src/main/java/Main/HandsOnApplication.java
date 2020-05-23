//package Main;
//
//import java.io.IOException;
//import java.util.concurrent.CompletableFuture;
//
//import dao.*;
//
//
//
//
//public class HandsOnApplication extends Jooby {
//   public HandsOnApplication() {
//
//		StudentDAOInterface dao = new StudentDAO();
//
//		port(8080);
//
//		use(new Gzon());
//
////		use(new CustomersResource(dao));
////		use(new CustomerResource(dao));
//
//		use(new ApiTool().swagger(new ApiTool.Options("/swagger").use("accounts.yaml")));
//
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		HandsOnApplication server = new HandsOnApplication();
//
//		CompletableFuture.runAsync(() -> {
//			server.start();
//		});
//
//		server.onStarted(() -> {
//			System.out.println("\nPress Enter to stop service.");
//		});
//
//		System.in.read();
//		System.exit(0);
//	}
//
//}
//
