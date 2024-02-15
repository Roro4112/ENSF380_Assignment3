package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;
    public Location(String pName, String pAddress){
        name = pName;
        address = pAddress;
        occupants = new ArrayList<DisasterVictim>();
        supplies = new ArrayList<Supply>();
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public List<DisasterVictim> getOccupants(){
        return occupants;
    }
    public List<Supply> getSupplies(){
        return supplies;
    }
    public void setName(String pName){
        name = pName;
    }
    public void setAddress(String pAddress){
        address = pAddress;
    }
    public void setOccupants(List<DisasterVictim> pOccupants){
        occupants = pOccupants;
    }
    public void setSupplies(List<Supply> pSupplies){
        supplies = pSupplies;
    }
    public void addOccupant(DisasterVictim pOccupant){
        occupants.add(pOccupant);
    }
    public void addSupply(Supply pSupply){
        supplies.add(pSupply);
    }
    public void removeOccupant(DisasterVictim pOccupant){
        for(int i = 0; i< occupants.size();i++){
            if(occupants.get(i).getAssignedSocialID() == pOccupant.getAssignedSocialID()){
                occupants.remove(i);
                i = occupants.size();
            }
        }
    }
    public void removeSupply(Supply pSupply){
        for(int i = 0; i< supplies.size();i++){
            if(supplies.get(i).getType() == pSupply.getType()){
                supplies.remove(i);
                i = supplies.size();
            }
        }
    }
}
