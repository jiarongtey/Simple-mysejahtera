
package oodj.assignment.appointment;

import java.util.Date;
import oodj.assignment.user.User;

public class Appointment {
    
    private final User user;
    private Date firstDose;
    private Date secondDose;
    private String vaccineType;
    
    private final String location;
    private final String facility;
    
    //Craeting new appointment
    public Appointment(User user, Date firstDose,Date secondDose, String type){
        this.user = user;
        this.firstDose = firstDose;
        this.secondDose = secondDose;
        this.vaccineType = type;
        
        this.location = user.getVaccineDetails().getLocation();
        this.facility = user.getVaccineDetails().getFacility();
        this.user.getVaccineDetails().setVaccineType(type);
    }
    
    public User getUser(){
        return this.user;
    }
    
    public Date getFirstDoseDate(){
        return this.firstDose;
    }
    
    public void setFirstDoseDate(Date d){
        this.firstDose = d;
    }
    
    public Date getSecondDoseDate(){
        return this.secondDose;
    }
    
    public void setSecondDoseDate(Date d){
        this.secondDose = d;
    }
    
    public String getVaccineType(){
        return this.vaccineType;
    }
    
    public void setVaccineType(String t){
        this.vaccineType = t;
        this.user.getVaccineDetails().setVaccineType(t);
    }
    
    public String getLocation(){
        return this.location;
    }
    
    public String getFacility(){
        return this.facility;
    }
    
}
