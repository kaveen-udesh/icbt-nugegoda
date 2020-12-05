/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author trill
 */
public class Employee extends Person {
    private String epfNo;
    
    public Employee(){
        this.epfNo = "";
    }
    
    //This calling overloaded constructors
    public Employee(String epfNo, String firstName, String lastName) {
        //This calling person overloaded constructors
        super(firstName, lastName);
        this.epfNo = epfNo;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }
    
    
    
}
