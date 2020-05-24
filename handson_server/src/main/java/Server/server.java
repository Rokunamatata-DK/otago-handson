/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.concurrent.CompletableFuture;
import org.jooby.Jooby;
import org.jooby.json.Gzon;
import dao.*;
import domain.*;

/**
 *
 * @author Derek Zou
 */
public class server extends Jooby{

    //static StudentDAOInterface student_dao= new DBStudentJDBC();
    //testing: 
    static StudentDAOInterface student_dao= new StudentDAO();

//    static DAO Product_dao = new Product_manage_dao();
//    static Customer_dao_interface Customer_dao = new Customer_manage_dao();
//    static SaleDAO sale_dao= new SaleJdbcDAO();
    public server() {
        port(8080);
        use(new Gzon());  
        use(new studentModule(student_dao));
      
        use(new AssetModule());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\nStarting Server.");
        server servers = new server();
        
        
        CompletableFuture.runAsync(() -> {
            servers.start();
        });
        
        servers.onStarted(() -> {
            System.out.println("\nPress Enter to stop the server.");
        });
        
        // wait for user to hit the Enter key
        System.in.read();
      //  System.exit(0);
    }
}


