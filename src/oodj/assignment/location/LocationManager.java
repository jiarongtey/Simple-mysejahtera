package oodj.assignment.location;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocationManager {
    
    private final List<Location> locations;
    private final File locationFolder;
    
    public LocationManager(){
        this.locations = new ArrayList<>();
        this.locationFolder = new File("src/location");
        loader();
    }
    
    public List<Location> getLocations(){
        return this.locations;
    }
    
    public Location getLocationByName(String name){
        for(Location l : this.locations){
            if(l.getName().equals(name)){
                return l;
            }
        }
        return null;
    }
    
    private void loader(){
        for(File f : locationFolder.listFiles()){

            try {
                String fname = f.getName().replace(".txt", "");
                Location newLocation = new Location(fname);
                BufferedReader br;
                br = new BufferedReader(new FileReader(f.getAbsolutePath()));
                String currentline;
                while ((currentline = br.readLine()) != null) {
                    newLocation.addFacility(currentline);
               
                    
                }
                br.close();
                locations.add(newLocation);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LocationManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LocationManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

    
        
    }
    
}
