package oodj.assignment.user;

import java.util.Date;

public class VaccineDetails {
       
    private final String location;
    private final String facility;

    //0 : No yet register
    //1 : No yet vaccine
    //2 : First dose done
    //3 : Second dose done
    private int completedDose; 
    
    private String vaccineType;
    
    // New User (Register)
    public VaccineDetails(String location, String facility){
        this.location = location;
        this.facility = facility;
        this.completedDose = 0;
        this.vaccineType = "none";
    }
    
    // Old User
    public VaccineDetails(String location, String facility, int completedDose, String vaccineType){
        this.location = location;
        this.facility = facility;
        this.completedDose = completedDose;
        this.vaccineType = vaccineType;
    }
    public String getVaccineType(){
        return this.vaccineType;
    }
    public void setVaccineType(String t){
        this.vaccineType = t;
    }
    public String getLocation(){
        return this.location;
    }
    
    public String getFacility(){
        return this.facility;
    }
    
    public boolean registered(){
        return completedDose > 0;
    }
    
    public boolean firstDoseCompleted(){
        return completedDose > 1;
    }
    
    public boolean fullyVaccine(){
        return completedDose == 3;
    }
    
    public int completedDose(){
        return completedDose;
    }
    
    public void setCompletedDose(int x){
        this.completedDose = x;
    }
    
    
}
