package oodj.assignment.location;

import java.util.ArrayList;
import java.util.List;

public class Location {
    
    private final String name;
    private final List<String> facilities;
    
    public Location(String name){
        this.name =name;
        this.facilities = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addFacility(String f){
        this.facilities.add(f);
    }
    
    public List<String> getFacilities(){
        return this.facilities;
    }
    
    
}
