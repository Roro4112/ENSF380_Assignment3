//Supply class, implemented by Rohan Lange, Feb 15th 2024
//class has two private variables and 5 public functions
package edu.ucalgary.oop;
public class Supply{
    private String type;
    private int quantity;
    //constructor, sets type and quantity to values provided
    public Supply(String type, int quantity){
        this.type = type;
        this.quantity = quantity;
    }
    //returns type
    public String getType(){
        return this.type;
    }
    //returns quantity
    public int getQuantity(){
        return this.quantity;
    }
    //sets type to string provided
    public void setType(String type){
        this.type = type;
    }
    //sets quatity to int provided
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}


