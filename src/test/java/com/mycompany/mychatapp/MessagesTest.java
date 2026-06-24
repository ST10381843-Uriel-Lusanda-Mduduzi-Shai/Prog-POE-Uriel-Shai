package com.mycompany.mychatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessagesTest {
    
    public MessagesTest() {
    }

    @Test
    public void testCheckNumGen() {
        long min = 1000000000L;
        long max = 9999999999L;
        
        long messageID = (long) (Math.random()*(max - min + 1) + min);
        Messages msTest = new Messages();
        
        System.out.println(msTest.checkNumGen((int) messageID));
        
    }

    @Test
    public void testCheckMessage() {
        String message = "Hi Mike, are you coming tonight?";
        Messages msTest = new Messages();
        
        System.out.println(msTest.checkMessage(message));
    }

    @Test
    public void testMenuOptions() {
        int options = 1;
        Messages msTest = new Messages();
        
        System.out.println(msTest.menuOptions(options));
    }

    @Test
    public void testSentMessage() {
        String sent = "Disregard";
        Messages msTest = new Messages();
        
        System.out.println(msTest.sentMessage(sent));
    }

    @Test
    public void testRecipientCellNo() {
        String Rnumber = "+27647384647";
        Messages msTest = new Messages();
        
        System.out.println(Rnumber);
    }

}
