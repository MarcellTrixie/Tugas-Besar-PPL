/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.view.user;

import java.util.Scanner;
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
public class UserMenuViewerTest {
    
    public UserMenuViewerTest() {
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
     * Test of getInstance method, of class UserMenuViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserMenuViewer expResult = null;
        UserMenuViewer result = UserMenuViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInputLogin method, of class UserMenuViewer.
     */
    @Test
    public void testHandleInputLogin() {
        System.out.println("handleInputLogin");
        Scanner sc = null;
        UserMenuViewer instance = null;
        String expResult = "";
        String result = instance.handleInputLogin(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of success method, of class UserMenuViewer.
     */
    @Test
    public void testSuccess() {
        System.out.println("success");
        String res = "";
        UserMenuViewer instance = null;
        instance.success(res);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class UserMenuViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        UserMenuViewer instance = null;
        instance.handleInput(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class UserMenuViewer.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        String command = "";
        UserMenuViewer instance = null;
        AbstractUserViewer expResult = null;
        AbstractUserViewer result = instance.getView(command);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class UserMenuViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        UserMenuViewer instance = null;
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
