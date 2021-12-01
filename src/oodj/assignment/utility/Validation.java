package oodj.assignment.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public boolean isValidUsername(String content){
    String regex = "^[A-Za-z]\\w{3,14}$"; //Starts with alphabert, min 4, max 15, no special characters
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the username is empty
        // return false
        if (content == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(content);
  
        // Return if the username
        // matched the ReGex
        return m.matches();
}
       public boolean isValidPassword(String content){
        if (content.contains(" ")==true){ // no spaces
            return false;
        }
       
     
        if (content == null) { //not null,empty
            return false;
        }
        
        if (content.length()< 4 | content.length() > 20){ //minimum 4, maximum 20 characters
            return false;
        }
        
        return true;
    }
    
    public boolean isValidEmail(String content){
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return content.matches(regex);
    }
    
    public boolean isValidName(String content){
        if (content.contains(" ")==false){ // Spaces Allowed
            return false;
        }
       
     
        if (content == null) { //not null,empty
            return false;
        }
        
        if (content.length()< 4 | content.length() > 40){ //minimum 4, maximum 40 characters
            return false;
        }
       
        return true;
    }
    public boolean isValidConfirmPassword(String pass1, String pass2){
        return pass1.equals(pass2);
    }
//        public boolean isValidItem(String content){
//        if (content.contains(" ")==false){ // Spaces Allowed
//            return false;
//        }
//       
//     
//        if (content == null) { //not null,empty
//            return false;
//        }
//        
//        return true;
//    }
}
