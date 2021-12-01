
package oodj.assignment;

import oodj.assignment.appointment.AppointmentManager;
import oodj.assignment.gui.Login;
import oodj.assignment.location.LocationManager;
import oodj.assignment.user.UserManager;
import oodj.assignment.vaccine.SupplimentManager;

public class OODJAssignment {
    
    public static UserManager userManager;
    public static LocationManager locationManager;
    public static AppointmentManager appointmentManager;
    public static SupplimentManager supplimentManager;
    
    public static void main(String[] args) {
        userManager = new UserManager();
        locationManager = new LocationManager();
        appointmentManager = new AppointmentManager();
        supplimentManager = new SupplimentManager();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
        
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                userManager.saveUsers();
                appointmentManager.saveAppointments();
                supplimentManager.saveSuppliments();
            }
        });
        
    }
    
    
    
}
