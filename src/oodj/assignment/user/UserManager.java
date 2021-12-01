/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj.assignment.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author teyji
 */
public class UserManager{
    
    private final List<User> users;
    private final String directory;
    
    public UserManager(){
        this.directory = "src/users.txt";
        
        this.users = new ArrayList<>();
        loadUsers();
    }
    
    public void addUser(User user){
        this.users.add(user);
    }
    
    public User getUserByUsername(String username){
        for(User u : this.users){
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }
    
    public User getUserByName(String fullName){
        for(User user : this.users){
            if(user.getFullName().equalsIgnoreCase(fullName)){
                return user;
            }
        }
        return null;
    }
    private void loadUsers(){
        try {
            File f = new File(this.directory);
            f.createNewFile();
            BufferedReader br;
            br = new BufferedReader(new FileReader(directory));
            String currentline;
            while ((currentline = br.readLine()) != null) {
                String[] splited;
                splited = currentline.split(":");
                if(splited.length == 5){
                    users.add(new User(splited[0],splited[1], splited[2],splited[3],splited[4]));
                }else{
                    User newUser = new User(splited[0],splited[1], splited[2],splited[3],splited[4]);
                    newUser.setVaccineDetails(new VaccineDetails(splited[5],splited[6], Integer.valueOf(splited[7]), splited[8]));
                   
                    users.add(newUser);
                }
            }
            br.close();
        }catch(FileNotFoundException e){
            
            System.out.println("Creating new users.txt");
        } catch (IOException e) {
            System.out.println(e);
        } 
    
    }
    
    public void saveUsers(){
        
        try {
            File file = new File(this.directory);
            if(file.delete()){
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter((this.directory), true));
            for(User u : this.users){
                if(u.getVaccineDetails()!= null){ // People
                    bw.write(u.getUsername() +":" + u.getPassword() +":" + u.getEmail() +":" + u.getFullName() +":" + u.getType() +":" + u.getVaccineDetails().getLocation() +":" + u.getVaccineDetails().getFacility() + ":" + u.getVaccineDetails().completedDose() + ":" + u.getVaccineDetails().getVaccineType()+ "\n") ;
                }else{ // Admin
                    bw.write(u.getUsername() +":" + u.getPassword() +":" + u.getEmail() +":" + u.getFullName() +":" + u.getType() + "\n") ;

                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        
        }
    }
    
    public List<User> getUsers(){
        return this.users;
    }
    
   
  
}
