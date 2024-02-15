//Supply class, implemented by Rohan Lange, Feb 15th 2024
//class has two private variables and 5 public functions
package edu.ucalgary.oop;
public class Supply{
    private String type;
    private int quantity;
    public Supply(String pType, int pQuantity){
        type = pType;
        quantity = pQuantity;
    }
    public String getType(){
        return type;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setType(String pType){
        type = pType;
    }
    public void setQuantity(int pQuantity){
        quantity = pQuantity;
    }
}


