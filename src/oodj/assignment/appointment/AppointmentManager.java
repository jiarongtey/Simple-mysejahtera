package oodj.assignment.appointment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import oodj.assignment.OODJAssignment;
import oodj.assignment.user.User;
import oodj.assignment.user.UserManager;

public class AppointmentManager {
    
    private final List<Appointment> appointments;
    private final UserManager userManager;
    private final String directory;
    
    public AppointmentManager(){
        this.appointments= new ArrayList<>();
        this.userManager = OODJAssignment.userManager;
        this.directory = "src/appointments.txt";

        loadAppointments();   
    }
    
    private void loadAppointments(){
        try {
            File f = new File(this.directory);
            f.createNewFile();
            BufferedReader br;
            br = new BufferedReader(new FileReader(directory));
            String currentline;
            while ((currentline = br.readLine()) != null) {
                String[] splited;
                splited = currentline.split(":");
                DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date fDate,sDate;
                if(" ".equals(splited[1])){
                    fDate = null;
                }else{
                    fDate = format.parse(splited[1]);
                }
                
                if(" ".equals(splited[2])){
                    sDate = null;
                }else{
                    sDate = format.parse(splited[2]);
                } 
                 
                User u = userManager.getUserByUsername(splited[0]);
                appointments.add(new Appointment(u,fDate,sDate,splited[3]));
                
            }
            br.close();
        }catch(FileNotFoundException e){
            
            System.out.println("Creating new appointments.txt");
        }catch( ParseException e){
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        } 
    
    }
    
    public void saveAppointments(){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            File file = new File(this.directory);
            if(file.delete()){
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter((this.directory), true));
            for(Appointment a : this.appointments){
                String fDate,sDate;
                if(a.getFirstDoseDate()== null){
                    fDate = " ";
                }else{
                    fDate = format.format(a.getFirstDoseDate());
                }
                if(a.getSecondDoseDate() == null){
                    sDate = " ";
                }else{
                    sDate = format.format(a.getSecondDoseDate());

                }
                
                bw.write(a.getUser().getUsername()+":" +fDate +":" + sDate + ":" + a.getVaccineType() + "\n") ;

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        
        }
    }

    public void addAppointment(Appointment newAppointment) {
        this.appointments.add(newAppointment);
    }
    
    public  List<Appointment> getAppointments(){
        return this.appointments;
    }
    
    public Appointment getAppointmentByUsername(User u){
        for(Appointment a : this.appointments){
            if(a.getUser().equals(u)){
                return a;
            }
        }
        return null;
    }
}
