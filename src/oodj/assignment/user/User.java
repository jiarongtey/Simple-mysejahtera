package oodj.assignment.user;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    
    private final String username;
    private String password;
    private String email;
    private String fullName;
    private String type;
    private VaccineDetails vaccineDetails; // only people not for admin
    
    
    public User(String username, String password,String email, String fullName, String type){
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.vaccineDetails = null;
        this.type = type;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    
    public String getType(){
        return this.type;
    }
   
    public VaccineDetails getVaccineDetails(){
        return this.vaccineDetails;
    }
    
    public void setPassword(String p){
        this.password = p;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    
    public void setFullName(String f){
        this.fullName = f;
    }
    public void setVaccineDetails(VaccineDetails vc){
        this.vaccineDetails = vc;   
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    
    
    public void logAcitivity(String status){
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String LogTime = "[" + date.format(now) + "] "+ "[" + time.format(now) + "] ";
        
        String logtype = "[" + status + "]" + ": ";
        String user = "Username: " + this.username + " ," +"Account Type: " + this.type;
        String s = LogTime + logtype + user;
        System.out.println(s);
         try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(("src/log.txt"), true));
           
            bw.write(s+ "\n");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        
        }
    }
}
