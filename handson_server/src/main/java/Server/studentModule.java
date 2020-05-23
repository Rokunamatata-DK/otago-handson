/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import org.jooby.Jooby;
import org.jooby.Result;
import org.jooby.Status;
import dao.*;
import domain.*;

/**
 *
 * @author Derek Zou
 */
public class studentModule extends Jooby {
      static StudentDAOInterface dao;

    public studentModule(StudentDAOInterface arg_dao) {
        dao = arg_dao;
        post("/api/register", (req, rsp) -> {
              
            Student a = req.body().to(Student.class);
            
           
           //TODO dao function
           dao.saveStudent(a);
           
            rsp.status(Status.CREATED);
        });
        
      
    }
}
