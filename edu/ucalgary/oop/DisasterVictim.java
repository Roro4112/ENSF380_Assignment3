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
    private static int counter = 1;
    private static final String REGEX = "^(\\d{4})([_/ -.]{1})(\\d{2})([_/ -.]{1})(\\d{2})";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    //constructor
    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
        //making sure date format is correct
        Matcher match = PATTERN.matcher(ENTRY_DATE);
        boolean matchFound = match.find();
        if(matchFound == true){
            //assign variables to provided values
            this.firstName = firstName;
            this.ENTRY_DATE = ENTRY_DATE;
            //assign the disaster victim an ID
            this.ASSIGNED_SOCIAL_ID = counter;
            counter++;
            //initialize arrays
            this.medicalRecords = new ArrayList<MedicalRecord>();
            this.familyConnections = new ArrayList<FamilyRelation>();
            this.personalBelongings = new ArrayList<Supply>();
        }else{
            throw new IllegalArgumentException("Invalid Date Format:"+ENTRY_DATE);
        }
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
        Matcher match = PATTERN.matcher(dateOfBirth);
        boolean matchFound = match.find();
        if(matchFound == true){
            this.dateOfBirth = dateOfBirth;
        }else{
            throw new IllegalArgumentException("Invalid Date Format:"+dateOfBirth);
        }
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
        //iterate through array
        for(int i = 0; i < this.personalBelongings.size();i++){
            //if the correct element is found, remove it and exit loop
            if(this.personalBelongings.get(i).getType() == personalBelonging.getType()){
                this.personalBelongings.remove(i);
                i = this.personalBelongings.size();
            }
        }
    }
    public void removeFamilyConnection(FamilyRelation familyConnection){
         //iterate through array
        for(int i = 0; i < this.familyConnections.size();i++){
            //if the correct element is found, remove it and exit loop
            if(this.familyConnections.get(i).getPersonTwo().getAssignedSocialID() == familyConnection.getPersonTwo().getAssignedSocialID()){
                this.familyConnections.remove(i);
                i = this.familyConnections.size();
            }
        }
    }
}
