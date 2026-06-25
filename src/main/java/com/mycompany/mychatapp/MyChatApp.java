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
        String Rnumber;
        int option;
        int totalNum;
        String SEND;
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
        
        System.out.println("Welcome " + firstName + "," + lastName + " " + "it is great to see you again." );
      
        System.out.println("Welcome to QuickChat");
            System.out.println("----QuickChat Menu----");
            System.out.println("Option 1. Send Messages : ");
            System.out.println("Option 2. Show recent mesagges :  ");
            System.out.println("Option 3. Quit : ");
            option = scan.nextInt();
            message1.menuOptions(option);
        
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
            
            System.out.println("Enter the number of messages used");
            int record = scan.nextInt();
            scan.nextLine();
            
            //Parallel arrays where users can populate them
            String[] sentMessages= new String[record];
            String[] disregardedMessages= new String[record];
            String[] storedMessages= new String[record];
            String[] messageHash= new String[record];
            int[] messageID= new int[record];
            int[] messageNo= new int[record];
            
            for(int i = 0; i < record; i++){
                System.out.println("Enter the amount of messages used");
                messageNo[i] = scan.nextInt();
                System.out.println("Enter your sent messages: ");
                sentMessages[i] = scan.nextLine();
                System.out.println("Enter your disregarded message: ");
                disregardedMessages[i] = scan.nextLine();
                System.out.println("Enter your stored message: ");
                storedMessages[i] = scan.nextLine();
                System.out.println("Enter the message hash: ");
                messageHash[i] = scan.nextLine();
                System.out.println("Enter the message ID: ");
                messageID[i] = scan.nextInt();
                
                System.out.println("---Entered Messages Data---");
                System.out.println("Sent Messages: " + sentMessages[i] + 
                        " | Disregarded Messages: " + disregardedMessages[i] +
                        " | Stored Messages: " + storedMessages[i] +
                        " | Message Hash: " + messageHash[i] +
                        " | Message ID: " + messageID[i] + 
                        " | Message Number: " + messageNo[i]);
            }
            
            
            
        }catch(IOException e){
            System.out.println("Error storing message: " + e.getMessage());
        }
            
    }
    
    
    }
