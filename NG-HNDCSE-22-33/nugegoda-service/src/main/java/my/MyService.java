/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "MyService")
public class MyService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hi " + txt + " !!";
    }
    
    @WebMethod(operationName = "getStudent")
    public Student getStudent() {    
        Student st = new Student("02", "George", "456");
        return st;
    }
    
    @WebMethod(operationName = "addStudent")
    public boolean addStudent(@WebParam(name = "student") Student student) {    
        return true;
    }
}
