/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj.assignment.gui;

import javax.swing.JOptionPane;
import oodj.assignment.location.LocationManager;
import oodj.assignment.OODJAssignment;
import oodj.assignment.location.Location;
import oodj.assignment.user.User;
import oodj.assignment.user.UserManager;
import oodj.assignment.user.VaccineDetails;
import oodj.assignment.utility.Validation;
/**
 *
 * @author teyji
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private LocationManager locationManager;
    private UserManager userManager;
    private Validation validation;
    
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.locationManager = OODJAssignment.locationManager;
        this.userManager = OODJAssignment.userManager;
        this.validation = new Validation();
        this.locationBox.addItem("");
        for(Location l : this.locationManager.getLocations()){
            this.locationBox.addItem(l.getName());
        }
        this.errorTxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        password2Txt = new javax.swing.JPasswordField();
        locationBox = new javax.swing.JComboBox<>();
        facilityBox = new javax.swing.JComboBox<>();
        errorTxt = new javax.swing.JLabel();
        errorTxt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 255, 249));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 157, 174));
        jLabel1.setText("Register");

        jButton1.setBackground(new java.awt.Color(255, 230, 82));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Email:");

        jLabel3.setText("Full Name:");

        jLabel5.setText("Username:");

        jLabel6.setText("Password:");

        jLabel7.setText("Confirm Password:");

        jLabel8.setText("Location:");

        jLabel9.setText("Facility:");

        locationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationBoxActionPerformed(evt);
            }
        });

        facilityBox.setEnabled(false);

        errorTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        errorTxt.setForeground(new java.awt.Color(255, 0, 0));
        errorTxt.setText("jLabel4");

        errorTxt1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorTxt1.setForeground(new java.awt.Color(0, 51, 204));
        errorTxt1.setText("Back");
        errorTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                errorTxt1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorTxt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(emailTxt)
                                    .addComponent(usernameTxt)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(passwordTxt)
                                    .addComponent(locationBox, 0, 200, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(nameTxt)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(password2Txt)
                                    .addComponent(facilityBox, 0, 200, Short.MAX_VALUE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errorTxt1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorTxt1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(password2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facilityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(errorTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String email = this.emailTxt.getText();
        String name = this.nameTxt.getText();
        String username = this.usernameTxt.getText();
        String password = String.valueOf(this.passwordTxt.getPassword());
        String password2 = String.valueOf(this.password2Txt.getPassword());
        String location = this.locationBox.getSelectedItem().toString();
        
        
        if(!validation.isValidEmail(email)){
            this.errorTxt.setText("Please enter a valid email");
            return;
        }
        if(!validation.isValidName(name)){
            this.errorTxt.setText("Please enter a valid name");
            return;
        }
        if(!validation.isValidUsername(username)){
            this.errorTxt.setText("Please enter a valid username");
            return;
        } 
        if(!validation.isValidPassword(password)){
            this.errorTxt.setText("Please enter a valid password");
            return;
        }
        if(!validation.isValidConfirmPassword(password, password2)){
            this.errorTxt.setText("Passwords does not match");
            return;
        }
        
        if(location.equals("")){
            this.errorTxt.setText("Please select your current location");
            return;
        }
        String facility = this.facilityBox.getSelectedItem().toString();
        
        User newUser = new User(username,password,email,name,"PEOPLE");
        newUser.setVaccineDetails(new VaccineDetails(location,facility));
        this.userManager.addUser(newUser);
        
        JOptionPane.showMessageDialog(null, "Successfully registered");
        this.dispose();
        new Login().setVisible(true);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void locationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBoxActionPerformed
       this.facilityBox.setEnabled(true);
       Location l = this.locationManager.getLocationByName(this.locationBox.getSelectedItem().toString());
       if(l == null){
            this.facilityBox.setEnabled(false);
            

       }else{
           
            for(String s : l.getFacilities()){
                this.facilityBox.addItem(s);
            }
            this.facilityBox.setSelectedIndex(0);
       }
    }//GEN-LAST:event_locationBoxActionPerformed

    private void errorTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_errorTxt1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_errorTxt1MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel errorTxt;
    private javax.swing.JLabel errorTxt1;
    private javax.swing.JComboBox<String> facilityBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> locationBox;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField password2Txt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}