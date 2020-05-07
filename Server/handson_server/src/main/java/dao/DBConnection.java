/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author vincenttoailoa
 

public class DBConnection implements ConnectionDAO{
    
   private static final String USERNAME = "sa";
   private static final String PASSWORD = "sa";

   private static final Integer DB_PORT = 9092;
   private static final String DEFAULT_URI = "jdbc:h2:tcp://localhost:" + DB_PORT + "/project";

   private static JdbcConnectionPool pool;

   public static Connection getConnection(String uri) {

      if (pool == null) {
         pool = JdbcConnectionPool.create(uri, USERNAME, PASSWORD);
      }

      return pool.getConnection();
   }

   public static String getDefaultConnectionUri() {
      return DEFAULT_URI;
   }
}
* 
*/




