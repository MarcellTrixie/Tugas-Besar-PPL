/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.view.invitation;

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
public class InvitationDetailVewerTest {
    
    public InvitationDetailVewerTest() {
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
     * Test of getInstance method, of class InvitationDetailVewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        InvitationDetailVewer expResult = null;
        InvitationDetailVewer result = InvitationDetailVewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class InvitationDetailVewer.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        int meeting_id = 0;
        InvitationDetailVewer instance = null;
        String expResult = "";
        String result = instance.getText(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class InvitationDetailVewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        InvitationDetailVewer instance = null;
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
