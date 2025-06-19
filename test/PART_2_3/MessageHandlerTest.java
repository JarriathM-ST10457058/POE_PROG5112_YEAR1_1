/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PART_2_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */
public class MessageHandlerTest {
    
    public MessageHandlerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sendMessages method, of class MessageHandler.
     */
    @Test
    public void testSendMessages() {
        System.out.println("sendMessages");
        MessageHandler.sendMessages();
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of showReportMenu method, of class MessageHandler.
     */
    @Test
    public void testShowReportMenu() {
        System.out.println("showReportMenu");
        MessageHandler.showReportMenu();
        
        fail("The test case is a prototype.");
    }
    
}
