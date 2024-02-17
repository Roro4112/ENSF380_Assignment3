package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;
    public Location(String name, String address){
        this.name = name;
        this.address = address;
        //initialize
        this.occupants = new ArrayList<DisasterVictim>();
        this.supplies = new ArrayList<Supply>();
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public ArrayList<DisasterVictim> getOccupants(){
        return this.occupants;
    }
    public ArrayList<Supply> getSupplies(){
        return this.supplies;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setOccupants(ArrayList<DisasterVictim> occupants){
        this.occupants = occupants;
    }
    public void setSupplies(ArrayList<Supply> supplies){
        this.supplies = supplies;
    }
    public void addOccupant(DisasterVictim occupant){
        this.occupants.add(occupant);
    }
    public void addSupply(Supply supply){
        this.supplies.add(supply);
    }
    public void removeOccupant(DisasterVictim occupant){
        //iterate through array
        for(int i = 0; i< this.occupants.size();i++){
            //if element is located remove it and exit loop
            if(this.occupants.get(i).getAssignedSocialID() == occupant.getAssignedSocialID()){
                this.occupants.remove(i);
                i = this.occupants.size();
            }
        }
    }
    public void removeSupply(Supply supply){
        //iterate through array
        for(int i = 0; i< this.supplies.size();i++){
            //if element is located remove it and exit loop
            if(this.supplies.get(i).getType() == supply.getType()){
                this.supplies.remove(i);
                i = this.supplies.size();
            }
        }
    }
}
