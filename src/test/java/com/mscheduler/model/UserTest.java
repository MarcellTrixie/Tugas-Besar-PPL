/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcell
 */
public class UserTest {

    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User("marcell.chelsea@gmail.com");
        String expResult = "marcell.chelsea@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "albert_hijau@gmail.com";
        User instance = new User();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User("passwordTest");
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "nomnom";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User("Reza Beato");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Daniel";
        User instance = new User();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAdmin method, of class User.
     */
    @Test
    public void testIsIsAdmin() {
        System.out.println("isIsAdmin");
        User instance = new User("", "", "", false);
        boolean expResult = false;
        boolean result = instance.isIsAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        boolean isAdmin = false;
        User instance = new User();
        instance.setIsAdmin(isAdmin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saving method, of class User.
     */
    @Test
    public void testSaving() {
        System.out.println("saving");
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.saving();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readUser method, of class User.
     */
    @Test
    public void testReadUser() {
        System.out.println("readUser");
        User instance = new User();
        User expResult = null;
        User result = instance.readUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * // * Test of BooleanReadUser method, of class User. //
     */
    @Test
    public void testBooleanReadUser() {
        System.out.println("BooleanReadUser");
        String input = "marcell.chelsea@gmail.com";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.BooleanReadUser(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BooleanReadPass method, of class User.
     */
    @Test
    public void testBooleanReadPass() {
        System.out.println("BooleanReadPass");
        String email = "marcell.chelsea@gmail.com";
        String input = "marcell123";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.BooleanReadPass(email, input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of readUserOne method, of class User.
     */
    @Test
    public void testReadUserOne() {
        System.out.println("readUserOne");
        String email = "beato@gmail.com";
        User instance = new User();
        User expResult = new User("beato@gmail.com", "beato123", "Reza Karyo", false);
        User result = instance.readUserOne(email);
        assertEquals(expResult.getPassword(), result.getPassword());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
//    /**
//     * Test of encr method, of class User.
//     */
//    @Test
//    public void testEncr() {
//        System.out.println("encr");
//        String text = "";
//        User instance = new User();
//        String expResult = "";
//        String result = instance.encr(text);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of checkLoginDb method, of class User.
     */
    @Test
    public void testCheckLoginDb() {
        System.out.println("checkLoginDb");
        User usr = null;
        User instance = new User();
        String expResult = "";
        String result = instance.checkLoginDb(usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of lastAdmin method, of class User.
     */
    @Test
    public void testLastAdmin() {
        System.out.println("lastAdmin");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.lastAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of editAll method, of class User.
     */
    @Test
    public void testEditAll() {
        System.out.println("editAll");
        User usr = null;
        User instance = new User("marcell.chelsea@gmail.com","marcell123", "Marcell", false);
        boolean expResult = true;
        boolean result = instance.editAll(instance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of editOne method, of class User.
     */
    @Test
    public void testEditOne() {
        System.out.println("editOne");
        String condition = "";
        User usr = null;
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.editOne(condition, usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
//    /**
//     * Test of readAll method, of class User.
//     */
//    @Test
//    public void testReadAll() {
//        System.out.println("readAll");
//        User instance = new User();
//        String expResult = "admin@ms.com\n" +
//                            "user1@ms.com\n" +
//                            "user2@ms.com\n" +
//                            "user3@ms.com\n" +
//                            "user4@ms.com\n" +
//                            "user5@ms.com\n" +
//                            "user6@ms.com\n" +
//                            "user7@ms.com\n" +
//                            "user8@ms.com\n" +
//                            "user9@ms.com\n" +
//                            "user10@ms.com\n" +
//                            "user11@ms.com\n" +
//                            "user12@ms.com\n" +
//                            "user13@ms.com\n" +
//                            "user14@ms.com\n" +
//                            "user15@ms.com\n" +
//                            "user16@ms.com\n" +
//                            "user17@ms.com\n" +
//                            "user18@ms.com\n" +
//                            "user19@ms.com\n" +
//                            "user20@ms.com\n" +
//                            "albert_hijau@gmail.com\n" +
//                            "marcell.chelsea@gmail.com\n" +
//                            "samuel_merah@gmail.com\n" +
//                            "daniel_biru@gmail.com\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "kevin_johan@gmail.com\n"+
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                            "\n" +
//                "\n" + 
//                "\n" +
//                "\n"+
//                "\n"+
//                "\n"+
//                "\n"+
//                "\n"+
//                "\n";
//        String result = instance.readAll();
//        System.out.println(result);
//        System.out.println("Pico");
//        System.out.println(expResult);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
    /**
     * Test of del method, of class User.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.del();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkdel method, of class User.
     */
    @Test
    public void testCheckdel() {
        System.out.println("checkdel");
        String Email = "marcell.chelsea@gmail.com";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.checkdel(Email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
