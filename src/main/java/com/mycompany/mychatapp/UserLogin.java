package com.mycompany.mychatapp;

public class UserLogin {
   
    String Password;
    String Username;
    
    /**
     * this method is from Stack Overflow
     * https://stackoverflow.com/questions/72061438/how-do-i-run-a-method-boolean-checkusername-this-method-ensures-that-any-use
     * RealSkeptic 
     * I learned how to use and implement the underscore condition in my method
     */
    public boolean checkUsername(String Username){
        
        if(Username.contains("_") && Username.length() >= 5){
            System.out.println("Username is formatted correctly");
            return true;
        }else{
            System.out.println("Username is formatted incorrectly");
            return false;
        }
        
    }
    
    /**
     * this method format is from Mr Rikhotoso Simon
     * I learned how to add and declare special characters for my password checker
     */
    public boolean checkPasswordComplexity(String Password){
        
        String[] specialChar = {"!","@","#","$","%","^","&","*"};
        
        if(Password.length() >= 8 && Password.contains(".*[0-9].*") && Password.contains(".*[A-Z].*")){
            System.out.println("Password format is correct");
            return true;
        }else{
            System.out.println("Password format is incorrect");
            return false;
        }
        
    }
    
    /**
     * this method is from Stack Overflow
     * https://stackoverflow.com/questions/4058001/validate-south-africa-cell-phone-number
     * Duncanmoo
     * I learned how to implement and declare the South African national number code for my method
     */
     public boolean checkCellPhoneNumber(String Pnumber) {
        String regexSANumber = "^(\\+27)[0-9]{9}$";
        boolean isValid = Pnumber != null && Pnumber.matches(regexSANumber);
        
        if(isValid){
            System.out.println("Cellphone number is successfully added.");
        }else{
            System.out.println("Cellphone number is incorrectly formatted or it does not contain an international code! Please try again.");
        }
        return isValid;
    }
     
    public String registerUser(String Username, String Password){
        if(Username.equals(Username) && Password.equals(Password)){
            return "The two conditions above have been met";
        }else{
            return "The Username is incorrctly formatted or the Password complextity isnt matched";
        }
    }
    
    public boolean loginUser(String Username, String Password){
        if(Username.equals(Username) && Password.equals(Password)){
            System.out.println("User has successfully logged in.");
            return true;
        }else{
            System.out.println("User has not successfully logged in.");
            return false;
        }
    }
    
    public String returnLoginUser(String Username, String Password){
        if(Username.equals(Username) && Password.equals(Password)){
            return "Login is successful";
        }else{
            return "Login is unsuccessful";
        }
    }
}


//References
// https://stackoverflow.com/questions/72061438/how-do-i-run-a-method-boolean-checkusername-this-method-ensures-that-any-use [Accessed 13 April 2026]
// https://stackoverflow.com/questions/4058001/validate-south-africa-cell-phone-number [Accessed 13 April 2026]