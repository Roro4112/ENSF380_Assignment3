package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private List<MedicalRecord> medicalRecords;
    private List<FamilyRelation> familyConnections;
    private String ENTRY_DATE;
    private List<Supply> personalBelongings;
    private String gender;
    private static int counter;
    public DisasterVictim(String firstName, String ENTRY_DATE){
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = counter;
        counter++;
        this.medicalRecords = new ArrayList<MedicalRecord>();
        this.familyConnections = new ArrayList<FamilyRelation>();
        this.personalBelongings = new ArrayList<Supply>();
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLAstName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public String getComments(){
        return this.comments;
    }
    public List<MedicalRecord> getMedicalRecords(){
        return this.medicalRecords;
    }
    public String getEntryDate(){
        return this.ENTRY_DATE;
    }
    public int getAssignedSocialID(){
        return this.ASSIGNED_SOCIAL_ID;
    }
    public List<Supply> getPersonalBelongings(){
        return this.personalBelongings;
    }
    public List<FamilyRelation> getFamilyConnections(){
        return this.familyConnections;
    }
    public String getGender(){
        return this.gender;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDateOFBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void  setComments(String comments){
        this.comments = comments;
    }
    public void setMedicalRecords(List<MedicalRecord> medicalRecords){
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(List<Supply> personalBelongings){
        this.personalBelongings = personalBelongings;
    }
    public void setFamilyConnections(List<FamilyRelation> familyConnections){
        this.familyConnections = familyConnections;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void addPersonalBelonging(Supply personalBelonging){
        this.personalBelongings.add(personalBelonging);
    }
    public void addMedicalRecord(MedicalRecord medicalRecord){
        this.medicalRecords.add(medicalRecord);
    }
    public void addFamilyConnection(FamilyRelation familyConnection){
        this.familyConnections.add(familyConnection);
    }
    public void removePersonalBelonging(Supply personalBelonging){
        for(int i = 0; i < this.personalBelongings.size();i++){
            if(this.personalBelongings.get(i).getType() == personalBelonging.getType()){
                this.personalBelongings.remove(i);
                i = this.personalBelongings.size();
            }
        }
    }
    public void removeFamilyConnection(FamilyRelation familyConnection){
        for(int i = 0; i < this.familyConnections.size();i++){
            if(this.familyConnections.get(i).getPersonTwo().getAssignedSocialID() == familyConnection.getPersonTwo().getAssignedSocialID()){
                this.familyConnections.remove(i);
                i = this.familyConnections.size();
            }
        }
    }
}
