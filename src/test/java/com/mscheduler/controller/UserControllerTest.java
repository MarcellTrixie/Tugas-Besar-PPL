/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import com.mscheduler.model.User;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcell
 */
public class UserControllerTest {
    
    public UserControllerTest() {
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
     * Test of getInstance method, of class UserController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserController expResult = null;
        UserController result = UserController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadUser method, of class UserController.
     */
    @Test
    public void testLoadUser() {
        System.out.println("loadUser");
        UserController instance = null;
        List<User> expResult = null;
        List<User> result = instance.loadUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUser method, of class UserController.
     */
    @Test
    public void testListUser() {
        System.out.println("listUser");
        UserController instance = null;
        List<User> expResult = null;
        List<User> result = instance.listUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsersAll method, of class UserController.
     */
    @Test
    public void testListUsersAll() {
        System.out.println("listUsersAll");
        UserController instance = null;
        String expResult = "";
        String result = instance.listUsersAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUserAll method, of class UserController.
     */
    @Test
    public void testListUserAll() {
        System.out.println("listUserAll");
        int page = 0;
        UserController instance = null;
        String expResult = "";
        String result = instance.listUserAll(page);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserController.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User usr = null;
        UserController instance = null;
        boolean expResult = false;
        boolean result = instance.addUser(usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLogin method, of class UserController.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        String email = "";
        String pass = "";
        UserController instance = null;
        String expResult = "";
        String result = instance.checkLogin(email, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editUser method, of class UserController.
     */
    @Test
    public void testEditUser() {
        System.out.println("editUser");
        String email = "";
        User user = null;
        UserController instance = null;
        boolean expResult = false;
        boolean result = instance.editUser(email, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userEditAll method, of class UserController.
     */
    @Test
    public void testUserEditAll() {
        System.out.println("userEditAll");
        String email = "";
        User usr = null;
        UserController instance = null;
        int expResult = 0;
        int result = instance.userEditAll(email, usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userEditOne method, of class UserController.
     */
    @Test
    public void testUserEditOne() {
        System.out.println("userEditOne");
        String email = "";
        String condition = "";
        User usr = null;
        UserController instance = null;
        int expResult = 0;
        int result = instance.userEditOne(email, condition, usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intEditUser method, of class UserController.
     */
    @Test
    public void testIntEditUser() {
        System.out.println("intEditUser");
        String email = "";
        UserController instance = null;
        int expResult = 0;
        int result = instance.intEditUser(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delUser method, of class UserController.
     */
    @Test
    public void testDelUser() {
        System.out.println("delUser");
        String email = "";
        UserController instance = null;
        int expResult = 0;
        int result = instance.delUser(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UserController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "";
        String password = "";
        UserController instance = null;
        User expResult = null;
        User result = instance.login(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByEmail method, of class UserController.
     */
    @Test
    public void testGetUserByEmail() {
        System.out.println("getUserByEmail");
        String email = "";
        UserController instance = null;
        User expResult = null;
        User result = instance.getUserByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existUser method, of class UserController.
     */
    @Test
    public void testExistUser() {
        System.out.println("existUser");
        String email = "";
        UserController instance = null;
        boolean expResult = false;
        boolean result = instance.existUser(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
