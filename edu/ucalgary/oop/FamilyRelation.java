package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;
    //sets person one and two to corresponding disastervictim provided and relationshipto to string provided
    public FamilyRelation(DisasterVictim personOne,String relationshipTo,DisasterVictim personTwo){
        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationshipTo = relationshipTo;
    }
    //returns personOne
    public DisasterVictim getPersonOne(){
        return this.personOne;
    }
    //returns personTwo
    public DisasterVictim getPersonTwo(){
        return this.personTwo;
    }
    //returns relationshipto
    public String getRelationshipTo(){
        return this.relationshipTo;
    }
    //set personOne to disastervictim provided
    public void setPersonOne(DisasterVictim personOne){
        this.personOne = personOne;
    }
    //set personTow to disastervictim provided
    public void setPersonTwo(DisasterVictim personTwo){
        this.personTwo = personTwo;
    }
    //sets relationship to to string provided
    public void setRelationshipTo(String relationshipTo){
        this.relationshipTo = relationshipTo;
    }
}
