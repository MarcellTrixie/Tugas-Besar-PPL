/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.DateRange;
import com.mscheduler.model.Invitation;
import com.mscheduler.model.ListInvitationViewModel;
import java.util.List;
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
public class InvitationControllerTest {
    
    public InvitationControllerTest() {
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
     * Test of getInstance method, of class InvitationController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        InvitationController expResult = null;
        InvitationController result = InvitationController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listInvitationView method, of class InvitationController.
     */
    @Test
    public void testListInvitationView() {
        System.out.println("listInvitationView");
        InvitationController instance = null;
        List<ListInvitationViewModel> expResult = null;
        List<ListInvitationViewModel> result = instance.listInvitationView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listInvitation method, of class InvitationController.
     */
    @Test
    public void testListInvitation() {
        System.out.println("listInvitation");
        int meeting_id = 0;
        List<String> emailList = null;
        InvitationController instance = null;
        List<Invitation> expResult = null;
        List<Invitation> result = instance.listInvitation(meeting_id, emailList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of detailInvitation method, of class InvitationController.
     */
    @Test
    public void testDetailInvitation() {
        System.out.println("detailInvitation");
        int meeting_id = 0;
        InvitationController instance = null;
        String expResult = "";
        String result = instance.detailInvitation(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unionDateRange method, of class InvitationController.
     */
    @Test
    public void testUnionDateRange() {
        System.out.println("unionDateRange");
        List<DateRange> dateList = null;
        InvitationController instance = null;
        List<DateRange> expResult = null;
        List<DateRange> result = instance.unionDateRange(dateList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acceptInvitation method, of class InvitationController.
     */
    @Test
    public void testAcceptInvitation() {
        System.out.println("acceptInvitation");
        int meeting_id = 0;
        List<DateRange> availability = null;
        InvitationController instance = null;
        boolean expResult = false;
        boolean result = instance.acceptInvitation(meeting_id, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rejectInvitation method, of class InvitationController.
     */
    @Test
    public void testRejectInvitation() {
        System.out.println("rejectInvitation");
        int meeting_id = 0;
        InvitationController instance = null;
        boolean expResult = false;
        boolean result = instance.rejectInvitation(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeetingTitle method, of class InvitationController.
     */
    @Test
    public void testGetMeetingTitle() {
        System.out.println("getMeetingTitle");
        int meeting_id = 0;
        InvitationController instance = null;
        String expResult = "";
        String result = instance.getMeetingTitle(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMeetingIdValid method, of class InvitationController.
     */
    @Test
    public void testIsMeetingIdValid() {
        System.out.println("isMeetingIdValid");
        int meeting_id = 0;
        boolean respon = false;
        InvitationController instance = null;
        boolean expResult = false;
        boolean result = instance.isMeetingIdValid(meeting_id, respon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadInvitations method, of class InvitationController.
     */
    @Test
    public void testLoadInvitations() {
        System.out.println("loadInvitations");
        InvitationController instance = null;
        List<Invitation> expResult = null;
        List<Invitation> result = instance.loadInvitations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveInvitations method, of class InvitationController.
     */
    @Test
    public void testSaveInvitations() {
        System.out.println("saveInvitations");
        List<Invitation> invitations_list = null;
        InvitationController instance = null;
        boolean expResult = false;
        boolean result = instance.saveInvitations(invitations_list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
