/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

/**
 *
 * @author wethekings303
 */
public class Person {
    private String SalesID;
    private String firstName;
    private String lastName;
    private int age;
    public String getSalesID() {
        return SalesID;
    }
    public void setSalesID (String salesID)
    {
        this.SalesID = salesID;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    @Override
    public String toString() {
        return "Person{" + "SalesID" + SalesID + "firstName=" + firstName + ", lastName=" + 
                lastName + '}';
    }
    
}
