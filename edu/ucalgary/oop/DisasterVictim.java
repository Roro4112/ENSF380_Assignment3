package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

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
    private int counter;
    public DisasterVictim(String pFirstName, String pENTRY_DATE){
        firstName = pFirstName;
        ENTRY_DATE = pENTRY_DATE;
        medicalRecords = new ArrayList<MedicalRecords>();
        familyConnections = new ArrayList<FamilyRelation>();
        personalBelongings = new ArrayList<Supply>();
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLAstName(){
        return lastName;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getComments(){
        return comments;
    }
    public List<MedicalRecords> getMedicalRecords(){
        return medicalRecords;
    }
    public String getEntryDate(){
        return ENTRY_DATE;
    }
    public int getAssignedSocialID(){
        return ASSIGNED_SOCIAL_ID;
    }
    public List<Supply> getPersonalBelongings(){
        return personalBelongings;
    }
    public List<FamilyRelation> getFamilyConnections(){
        return familyConnections;
    }
    public String getGender(){
        return gender;
    }
    public void setFirstName(String pName){
        firstName = pName;
    }
    public void setLastName(String pName){
        lastName = pName;
    }
    public void setDateOFBirth(String pDateOfBirth){
        dateOfBirth = pDateOfBirth;
    }
    public void  setComments(String pComments){
        comments = pComments;
    }
    public void setMedicalRecords(List<MedicalRecord> pMedicalRecords){
        medicalRecords = pMedicalRecords;
    }
    public void setPersonalBelongings(List<Supply> pPersonalBelongings){
        personalBelongings = pPersonalBelongings;
    }
    public void setFamilyConnections(List<FamilyRelation> pFamilyConnections){
        familyConnections = pFamilyConnections;
    }
    public void setGender(String pGender){
        gender = pGender;
    }
    public void addPersonalBelonging(Supply pPersonalBelonging){
        personalBelongings.add(pPersonalBelonging);
    }
    public void addMedicalRecord(MedicalRecord pMedicalRecord){
        medicalrecords.add(pMedicalRecord);
    }
    public void addFamilyConnection(FamilyRelation pFamilyConnection){
        familyConnections.add(pFamilyConnection);
    }
    public void removePersonalBelonging(Supply pPersonalBelonging){
        for(int i = 0; i < personalBelongings.size();i++){
            if(personalBelongings.get(i).getType() == pPersonalBelonging.getType()){
                personalBelongings.remove(i);
                i = personalBelongings.size();
            }
        }
    }
    public void removeFamilyConnection(FamilyRelation pFamilyConnection){
        for(int i = 0; i < familyConnections.size();i++){
            if(familyConnections.get(i).getPersonTwo().getAssignedSocialID() == pFamilyConnection.getPersonTwo().getAssignedSocialID()){
                familyConnections.remove(i);
                i = familyConnections.size();
            }
        }
    }
}
