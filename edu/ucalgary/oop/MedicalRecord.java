package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;
    private static final String REGEX = "^(\\d{4})([-]{1})(\\d{2})([-]{1})(\\d{2})";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        Matcher match = PATTERN.matcher(dateOfTreatment);
        boolean matchFound = match.find();
        if(matchFound == true){
            this.dateOfTreatment = dateOfTreatment;
        } else {
            throw new IllegalArgumentException("Invalid Date Format: " + dateOfTreatment);
        }
    }

    public Location getLocation() { 
        return this.location; 
    }
    public String getTreatmentDetails() { 
        return this.treatmentDetails; 
    }
    public String getDateOfTreatment() {
         return this.dateOfTreatment; 
    }
    public void setLocation(Location location) {
         this.location = location; 
    }
    public void setTreatmentDetails(String treatmentDetails) {
         this.treatmentDetails = treatmentDetails; 
    }
    public void setDateOfTreatment(String dateOfTreatment) {
        Matcher match = PATTERN.matcher(dateOfTreatment);
        boolean matchFound = match.find();
        if(matchFound == true){ 
            this.dateOfTreatment = dateOfTreatment; 
        }else{
            throw new IllegalArgumentException("Invalid Date Format: "+dateOfTreatment);
        }
    }
}
