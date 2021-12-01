/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj.assignment.vaccine;

import oodj.assignment.user.*;
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
public class SupplimentManager{
    
    private final List<Suppliment> suppliments;
    private final String directory;
    
    public SupplimentManager(){
        this.directory = "src/suppliments.txt";
        
        this.suppliments = new ArrayList<>();
        loadSuppliments();
    }
    
    public void addSuppliment(Suppliment s){
        this.suppliments.add(s);
    }
    
    public List<Suppliment> getSuppliments(){
        return this.suppliments;
    }
    
    public Suppliment getSupplimentByName(String s){
        for(Suppliment u : this.suppliments){
            if(u.getName().equals(s)){
                return u;
            }
        }
        return null;
    }
    
    private void loadSuppliments(){
        try {
            File f = new File(this.directory);
            f.createNewFile();
            BufferedReader br;
            br = new BufferedReader(new FileReader(directory));
            String currentline;
            while ((currentline = br.readLine()) != null) {
                String[] splited;
                splited = currentline.split(":");
                suppliments.add(new Suppliment(splited[0], Integer.valueOf(splited[1])));

            }
            br.close();
        }catch(FileNotFoundException e){
            
            System.out.println("Creating new suppliments.txt");
        } catch (IOException e) {
            System.out.println(e);
        } 
    
    }
    
    public void saveSuppliments(){
        
        try {
            File file = new File(this.directory);
            if(file.delete()){
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter((this.directory), true));
            for(Suppliment u : this.suppliments){
                bw.write(u.getName() +":" + u.getStock()+"\n") ;

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        
        }
    }
    
  
    
   
  
}
