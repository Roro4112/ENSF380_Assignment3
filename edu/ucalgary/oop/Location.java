package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;
    public Location(String name, String address){
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<DisasterVictim>();
        this.supplies = new ArrayList<Supply>();
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public List<DisasterVictim> getOccupants(){
        return this.occupants;
    }
    public List<Supply> getSupplies(){
        return this.supplies;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setOccupants(List<DisasterVictim> occupants){
        this.occupants = occupants;
    }
    public void setSupplies(List<Supply> supplies){
        this.supplies = supplies;
    }
    public void addOccupant(DisasterVictim occupant){
        this.occupants.add(occupant);
    }
    public void addSupply(Supply supply){
        this.supplies.add(supply);
    }
    public void removeOccupant(DisasterVictim occupant){
        for(int i = 0; i< this.occupants.size();i++){
            if(this.occupants.get(i).getAssignedSocialID() == occupant.getAssignedSocialID()){
                this.occupants.remove(i);
                i = this.occupants.size();
            }
        }
    }
    public void removeSupply(Supply supply){
        for(int i = 0; i< this.supplies.size();i++){
            if(this.supplies.get(i).getType() == supply.getType()){
                this.supplies.remove(i);
                i = this.supplies.size();
            }
        }
    }
}
