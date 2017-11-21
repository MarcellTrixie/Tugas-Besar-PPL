/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.view.invitation;

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
public class InvitationListViewerTest {
    
    public InvitationListViewerTest() {
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
     * Test of getInstance method, of class InvitationListViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        InvitationListViewer expResult = null;
        InvitationListViewer result = InvitationListViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class InvitationListViewer.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        InvitationListViewer instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class InvitationListViewer.
     */
    @Test
    public void testGetText_0args() {
        System.out.println("getText");
        InvitationListViewer instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class InvitationListViewer.
     */
    @Test
    public void testGetText_int() {
        System.out.println("getText");
        int page = 0;
        InvitationListViewer instance = null;
        String expResult = "";
        String result = instance.getText(page);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class InvitationListViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        InvitationListViewer instance = null;
        instance.handleInput(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class InvitationListViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        InvitationListViewer instance = null;
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
