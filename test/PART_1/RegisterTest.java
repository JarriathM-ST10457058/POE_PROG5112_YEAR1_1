/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PART_1;

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
public class RegisterTest {
    
    public RegisterTest() {
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
     * Test of getFirstName method, of class Register.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Register.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String FirstName = "";
        Register instance = new Register();
        instance.setFirstName(FirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Register.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Register.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String Surname = "";
        Register instance = new Register();
        instance.setSurname(Surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Register.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Register.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String Username = "";
        Register instance = new Register();
        instance.setUsername(Username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellNum method, of class Register.
     */
    @Test
    public void testGetCellNum() {
        System.out.println("getCellNum");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getCellNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellNum method, of class Register.
     */
    @Test
    public void testSetCellNum() {
        System.out.println("setCellNum");
        String CellNum = "";
        Register instance = new Register();
        instance.setCellNum(CellNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Register.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Register.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        Register instance = new Register();
        instance.setPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UserInfo method, of class Register.
     */
    @Test
    public void testUserInfo() {
        System.out.println("UserInfo");
        Register instance = new Register();
        instance.UserInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegisterUser method, of class Register.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("RegisterUser");
        Register instance = new Register();
        boolean expResult = false;
        boolean result = instance.RegisterUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegisterPassword method, of class Register.
     */
    @Test
    public void testRegisterPassword() {
        System.out.println("RegisterPassword");
        Register instance = new Register();
        boolean expResult = false;
        boolean result = instance.RegisterPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegisterCellNum method, of class Register.
     */
    @Test
    public void testRegisterCellNum() {
        System.out.println("RegisterCellNum");
        Register instance = new Register();
        boolean expResult = false;
        boolean result = instance.RegisterCellNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
