package com.mycompany.mychatapp;

public class Messages {
    private int totalMessages;
    private int options;
    private String message;
    private String sentMessage;
    private String recipientCellNo;
    private String messageHash;
    private String status;
    
    long min = 1000000000L;
    long max = 9999999999L;
        
    long messageID = (long) (Math.random()*(max - min + 1) + min);
    
<<<<<<< HEAD
    //Random 10 digit number generator checker
=======
    //random 10 digit number generator checker
>>>>>>> de665ebc2b1390df3a5bc7d9c327b0cdf17b066a
    public boolean checkNumGen(int messageID){
        if(messageID <= 10){
            return true;
        }else{
            return false;
        }
    }
    
<<<<<<< HEAD
    //This method checks for the word limit of the messages
=======
>>>>>>> de665ebc2b1390df3a5bc7d9c327b0cdf17b066a
    public String checkMessage(String message){
        if(message.length() <= 250){
            System.out.println("Message is ready to be sent.");
        }else{
<<<<<<< HEAD
            System.out.println("You have exceeded 250 characters for your message.");
            
        }
        this.message = message;
        return message;
    }
    
    //add the method in main
    public boolean checkMessageID(){
        String MessID = String.valueOf(messageID);
        return MessID.length() <= 10;
    }
    
    //This method allows the user to choose which option they want to use on the app
    /**
     * this method is from geeks for geeks
     * https://www.geeksforgeeks.org/java/system-exit-in-java/
     * I learned how to stop or end the application
     */
    public int menuOptions(int options){
        if(options == 1){
            System.out.println("Welcome to messages");
        }else if(options == 2){
            System.out.println("Coming soon.........");
        }else if(options == 3){
            System.exit(0);
        }
        return options;
    }
    
    public int totalMessages(int numMess){
        for(int i = 1; i <= numMess; i++);{
            System.out.println("Number of messages: " + numMess);
        }
        return numMess;
    }
    
    //This method allows the user to choose whether to send, store or disregard the message
    public String sentMessage(String sent){
        if(sent.contains("Send")){
            System.out.println("Message sent successfully.");
            totalMessages++;
        }else if(sent.contains("Disregard")){
            System.out.println("Press 0 to delete the message.");
            totalMessages++;
        }else if(sent.contains("Store")){
            System.out.println("Message has been stored.");
        }
        return sent;
    }
    
    //Checks the recipients cellphone number
    /**
     * this method is from Stack Overflow
     * https://stackoverflow.com/questions/4058001/validate-south-africa-cell-phone-number
     * Duncanmoo
     * I learned how to implement and declare the South African national number code for my method
     */
    public boolean recipientCellNo(String Rnumber) {
        String regexSANumber = "^(\\+27)[0-9]{9}$";
        boolean isValid = Rnumber != null && Rnumber.matches(regexSANumber);
        
        if(isValid){
            System.out.println("Cellphone number is successfully added.");
        }else{
            System.out.println("Cellphone number is incorrectly formatted or it does not contain an international code! Please try again.");
        }
        return isValid;
    }
    
    //Add to main
    public String messageHash(){
        String IDPrefix = String.valueOf(messageID).substring(0,2);
        String[] words = message.trim().split("\\s+");
        String firstWord = words[0].replaceAll("[^a-zA-Z0-9]"+"[^A-Z]", "");
        String lastWord = words[words.length - 1].replaceAll("[^a-zA-Z0-9]", "");
        this.messageHash = (IDPrefix + ":" + sentMessage + ":" + firstWord + lastWord).toUpperCase();
        return this.message;
    }
=======
            System.out.println("You have exeeded 250 characters for your message.");
            
        }
        return message;
    }
>>>>>>> de665ebc2b1390df3a5bc7d9c327b0cdf17b066a
    
}
