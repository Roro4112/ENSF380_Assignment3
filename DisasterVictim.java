package edu.ucalgary.oop;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private int counter;
    public DisasterVictim(String pFirstName, String pENTRY_DATE){
        firstName = pFirstName;
        ENTRY_DATE = pENTRY_DATE;
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
    public MedicalRecords[] getMedicalRecords(){
        return medicalRecords;
    }
    public String getEntryDate(){
        return ENTRY_DATE;
    }
    public int getAssignedSocialID(){
        return ASSIGNED_SOCIAL_ID;
    }
    public Supply[] getPersonalBelongings(){
        return personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections(){
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
    public void setMedicalRecords(MedicalRecord[] pMedicalRecords){
        medicalRecords = pMedicalRecords;
    }
    public void setPersonalBelongings(Supply[] pPersonalBelongings){
        personalBelongings = pPersonalBelongings;
    }
    public void setFamilyConnections(FamilyRelation[] pFamilyConnections){
        familyConnections = pFamilyConnections;
    }
    public void setGender(String pGender){
        gender = pGender;
    }
    public void addPersonalBelonging(Supply pPersonalBelonging){
        
    }
}
