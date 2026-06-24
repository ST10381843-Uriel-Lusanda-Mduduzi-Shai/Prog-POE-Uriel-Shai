package com.mycompany.mychatapp;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class MyChatApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String Username;
        String Password;
        String firstName;
        String lastName;
        String Pnumber;
<<<<<<< HEAD
        String Rnumber;
        int option;
        int totalNum;
        String SEND;
=======
        String option;
>>>>>>> de665ebc2b1390df3a5bc7d9c327b0cdf17b066a
        String message;
        UserLogin user1 = new UserLogin();
        Messages message1 = new Messages();
        
        String fileName = "StoredMessages.json";
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(fileName);
        ArrayNode messagesArray;
        
        try{
            if(file.exists() && file.length() > 0){
                ArrayNode ArrayNode;
                messagesArray = (ArrayNode)mapper.readTree(file);
            }else{
                messagesArray = mapper.createArrayNode();
            }
            
            ObjectNode entry = mapper.createObjectNode();
            
            messagesArray.add(entry);
            
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, messagesArray);
        
        
        System.out.println("Please  enter your first name:");
        firstName = scan.nextLine();
        System.out.println("Please  enter your last name :");
        lastName = scan.nextLine();
        
        System.out.println("Please  enter your Username:");
        Username = scan.nextLine();
        System.out.println(user1.checkUsername(Username));
        
        System.out.println("Please  enter your Password:");
        Password = scan.nextLine();
        System.out.println(user1.checkPasswordComplexity(Password));
        
        System.out.println("Please  enter your valid SA number :");
        Pnumber = scan.nextLine();
        user1.checkCellPhoneNumber(Pnumber);
       
        System.out.println(user1.registerUser(Username, Password));
        
        System.out.println(user1.loginUser(Username, Password));
        
        System.out.println(user1.returnLoginUser(Username, Password));
        
        //Part 2
        
<<<<<<< HEAD
        System.out.println("Welcome " + firstName + "," + lastName + " " + "it is great to see you again." );
      
        System.out.println("Welcome to QuickChat");
            System.out.println("----QuickChat Menu----");
            System.out.println("Option 1. Send Messages : ");
            System.out.println("Option 2. Show recent mesagges :  ");
            System.out.println("Option 3. Quit : ");
            option = scan.nextInt();
            message1.menuOptions(option);
=======
        
        System.out.println(message1.messageID);
        
        message = scan.next();
        message1.checkMessage(message);
>>>>>>> de665ebc2b1390df3a5bc7d9c327b0cdf17b066a

            System.out.println("Enter the amount of messages you would like to send");
            totalNum = scan.nextInt();
            message1.totalMessages(totalNum);
            
            System.out.println("Please enter the recipeints cell number");
            Rnumber = scan.nextLine();
            message1.recipientCellNo(Rnumber);

            System.out.println("Type your message");
            message = scan.nextLine();
            message1.checkMessage(message);
            System.out.println("Message ID:" + message1.messageID);
            message1.messageHash();

            System.out.println("Type 'Send', 'Store' or 'Disregard' ");
            SEND = scan.nextLine();
            message1.sentMessage(SEND);
            
            //Part 3
            
            String[] sentMessages={};
            String[] disregaredMessages={};
            String[] storedMessages={};
            String[] messageHash={};
            int[] messageID={};
            
            
            
        }catch(IOException e){
            System.out.println("Error storing message: " + e.getMessage());
        }
            
    }
    
    
    }
