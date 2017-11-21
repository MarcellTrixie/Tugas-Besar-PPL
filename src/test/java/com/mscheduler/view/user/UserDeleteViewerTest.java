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
public class UserDeleteViewerTest {
    
    public UserDeleteViewerTest() {
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
     * Test of getInstance method, of class UserDeleteViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserDeleteViewer expResult = null;
        UserDeleteViewer result = UserDeleteViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class UserDeleteViewer.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        String email = "";
        UserDeleteViewer instance = null;
        String expResult = "";
        String result = instance.getText(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class UserDeleteViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        String email = "";
        UserDeleteViewer instance = null;
        instance.handleInput(sc, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class UserDeleteViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        UserDeleteViewer instance = null;
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
