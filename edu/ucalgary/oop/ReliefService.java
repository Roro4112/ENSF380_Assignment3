package edu.ucalgary.oop;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, 
            String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() { return this.inquirer; }
    public DisasterVictim getMissingPerson() { return this.missingPerson; }
    public String getDateOfInquiry() { return this.dateOfInquiry; }
    public String getInfoProvided() { return this.infoProvided; }
    public Location getLastKnownLocation() { return this.lastKnownLocation; }
    public String getLogDetails() {
        if (missingPerson == null) {
            throw new IllegalArgumentException("No disaster victim associated with this relief service.");
        }
        return "Inquirer: " + inquirer.getFirstName() + ", Missing Person: " + missingPerson.getFirstName() 
                + missingPerson.getLastName() + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: " 
                + infoProvided + ", Last Known Location: " + lastKnownLocation.getName();
    }
    

    public void setInquirer(Inquirer inquirer) { this.inquirer = inquirer; }
    public void setMissingPerson(DisasterVictim missingPerson) { this.missingPerson = missingPerson; }
    public void setDateOfInquiry(String dateOfInquiry) {
        String tempRegex = "\\d{4}-\\d{2}-\\d{2}";
        if (dateOfInquiry.matches(tempRegex) == false) {
            throw new IllegalArgumentException("Invalid date format: " + dateOfInquiry);
        }
        this.dateOfInquiry = dateOfInquiry;
    }
    public void setInfoProvided(String infoProvided) { this.infoProvided = infoProvided; }
    public void setLastKnownLocation(Location lastKnownLocation) { this.lastKnownLocation = lastKnownLocation; }
}
