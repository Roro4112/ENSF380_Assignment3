package edu.ucalgary.oop;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
    private String SERVICES_PHONE;
    //constructor, sets first name last name services phone and info to strings provided
    public Inquirer(String FIRST_NAME,String LAST_NAME,String SERVICES_PHONE,String INFO){
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.INFO = INFO;
        this.SERVICES_PHONE =SERVICES_PHONE;
    }
    //returns firtname
    public String getFirstName(){
        return this.FIRST_NAME;
    }
    //returns lastname
    public String getLastName(){
        return this.LAST_NAME;
    }
    //returns info
    public String getInfo(){
        return this.INFO;
    }
    //returns phone number
    public String getServicesPhoneNum(){
        return this.SERVICES_PHONE;
    }
}
