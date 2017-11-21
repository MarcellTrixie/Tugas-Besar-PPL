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
public class InvitationMenuViewerTest {
    
    public InvitationMenuViewerTest() {
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
     * Test of getInstance method, of class InvitationMenuViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        InvitationMenuViewer expResult = null;
        InvitationMenuViewer result = InvitationMenuViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class InvitationMenuViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        InvitationMenuViewer instance = null;
        instance.handleInput(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class InvitationMenuViewer.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        String command = "";
        InvitationMenuViewer instance = null;
        AbstractInvitationViewer expResult = null;
        AbstractInvitationViewer result = instance.getView(command);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class InvitationMenuViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        InvitationMenuViewer instance = null;
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
