package edu.ucalgary.oop;

import java.util.Arrays;
import java.util.regex.*;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords = {};
    private FamilyRelation[] familyConnections = {};
    private String ENTRY_DATE;
    private Supply[] personalBelongings = {};
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
        }else{
            throw new IllegalArgumentException("Invalid Date Format:"+ENTRY_DATE);
        }
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public String getComments(){
        return this.comments;
    }
    public MedicalRecord[] getMedicalRecords(){
        return this.medicalRecords;
    }
    public String getEntryDate(){
        return this.ENTRY_DATE;
    }
    public int getAssignedSocialID(){
        return this.ASSIGNED_SOCIAL_ID;
    }
    public Supply[] getPersonalBelongings(){
        return this.personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections(){
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
    public void setDateOfBirth(String dateOfBirth){
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
    public void setMedicalRecords(MedicalRecord[] medicalRecords){
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(Supply[] personalBelongings){
        this.personalBelongings = personalBelongings;
    }
    public void setFamilyConnections(FamilyRelation[] familyConnections){
        this.familyConnections = familyConnections;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void addPersonalBelonging(Supply personalBelonging){
        this.personalBelongings = Arrays.copyOf(this.personalBelongings,this.personalBelongings.length+1);
        this.personalBelongings[this.personalBelongings.length-1] = personalBelonging;
    }
    public void addMedicalRecord(MedicalRecord medicalRecord){
        this.medicalRecords = Arrays.copyOf(this.medicalRecords,this.medicalRecords.length+1);
        this.medicalRecords[this.medicalRecords.length-1] = medicalRecord;
    }
    public void addFamilyConnection(FamilyRelation familyConnection){
        this.familyConnections = Arrays.copyOf(this.familyConnections,this.familyConnections.length+1);
        this.familyConnections[this.familyConnections.length-1] = familyConnection;
    }
    public void removePersonalBelonging(Supply personalBelonging){
        //iterate through array
        Supply[] temp = new Supply[this.personalBelongings.length];
        Boolean found = false;
        for(int i = 0,k=0; i < this.personalBelongings.length;i++){
            if(this.personalBelongings[i].getType() != personalBelonging.getType()){
                temp[k] = this.personalBelongings[i];
                k++;
            }else{
                found = true;
            }
        }
        if(found = true){
            this.personalBelongings = Arrays.copyOf(temp,temp.length-1);
        }
    }
    public void removeFamilyConnection(FamilyRelation familyConnection){
        //iterate through array
        FamilyRelation[] temp = new FamilyRelation[this.familyConnections.length];
        Boolean found = false;
        for(int i = 0,k=0; i < this.familyConnections.length;i++){
            if(this.familyConnections[i].getPersonTwo().getAssignedSocialID() != familyConnection.getPersonTwo().getAssignedSocialID()){
                temp[k] = this.familyConnections[i];
                k++;
            }else{
                found = true;
            }
        }
        if(found = true){
            this.familyConnections = Arrays.copyOf(temp,temp.length-1);
        }
    }
}
