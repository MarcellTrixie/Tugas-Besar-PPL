/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.InvitationStatus;
import com.mscheduler.model.LastIndex;
import com.mscheduler.model.ListMeetingViewModel;
import com.mscheduler.model.Meeting;
import com.mscheduler.model.MeetingStatus;
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
public class MeetingControllerTest {
    
    public MeetingControllerTest() {
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
     * Test of getInstance method, of class MeetingController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MeetingController expResult = null;
        MeetingController result = MeetingController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMeeting method, of class MeetingController.
     */
    @Test
    public void testCreateMeeting() {
        System.out.println("createMeeting");
        Meeting meeting = null;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.createMeeting(meeting);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listMeeting method, of class MeetingController.
     */
    @Test
    public void testListMeeting() {
        System.out.println("listMeeting");
        MeetingController instance = null;
        List<Meeting> expResult = null;
        List<Meeting> result = instance.listMeeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of detailMeeting method, of class MeetingController.
     */
    @Test
    public void testDetailMeeting() {
        System.out.println("detailMeeting");
        int meeting_id = 0;
        MeetingController instance = null;
        Meeting expResult = null;
        Meeting result = instance.detailMeeting(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editMeeting method, of class MeetingController.
     */
    @Test
    public void testEditMeeting() {
        System.out.println("editMeeting");
        Meeting m = null;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.editMeeting(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMeeting method, of class MeetingController.
     */
    @Test
    public void testUpdateMeeting() {
        System.out.println("updateMeeting");
        Meeting m = null;
        MeetingStatus ms = null;
        InvitationStatus is = null;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.updateMeeting(m, ms, is);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMeetingStatus method, of class MeetingController.
     */
    @Test
    public void testUpdateMeetingStatus() {
        System.out.println("updateMeetingStatus");
        Meeting m = null;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.updateMeetingStatus(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelMeeting method, of class MeetingController.
     */
    @Test
    public void testCancelMeeting() {
        System.out.println("cancelMeeting");
        int meeting_id = 0;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.cancelMeeting(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listMeetingView method, of class MeetingController.
     */
    @Test
    public void testListMeetingView() {
        System.out.println("listMeetingView");
        MeetingController instance = null;
        List<ListMeetingViewModel> expResult = null;
        List<ListMeetingViewModel> result = instance.listMeetingView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runScheduler method, of class MeetingController.
     */
    @Test
    public void testRunScheduler() {
        System.out.println("runScheduler");
        int meeting_id = 0;
        MeetingController instance = null;
        int expResult = 0;
        int result = instance.runScheduler(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeetingTitle method, of class MeetingController.
     */
    @Test
    public void testGetMeetingTitle() {
        System.out.println("getMeetingTitle");
        int meeting_id = 0;
        MeetingController instance = null;
        String expResult = "";
        String result = instance.getMeetingTitle(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadMeetings method, of class MeetingController.
     */
    @Test
    public void testLoadMeetings() {
        System.out.println("loadMeetings");
        MeetingController instance = null;
        List<Meeting> expResult = null;
        List<Meeting> result = instance.loadMeetings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveMeetings method, of class MeetingController.
     */
    @Test
    public void testSaveMeetings() {
        System.out.println("saveMeetings");
        List<Meeting> meeting_list = null;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.saveMeetings(meeting_list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastMeetingIndex method, of class MeetingController.
     */
    @Test
    public void testGetLastMeetingIndex() {
        System.out.println("getLastMeetingIndex");
        MeetingController instance = null;
        LastIndex expResult = null;
        LastIndex result = instance.getLastMeetingIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLastMeetingIndex method, of class MeetingController.
     */
    @Test
    public void testUpdateLastMeetingIndex() {
        System.out.println("updateLastMeetingIndex");
        LastIndex index = null;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.updateLastMeetingIndex(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastInvitationIndex method, of class MeetingController.
     */
    @Test
    public void testGetLastInvitationIndex() {
        System.out.println("getLastInvitationIndex");
        MeetingController instance = null;
        LastIndex expResult = null;
        LastIndex result = instance.getLastInvitationIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLastInvitationIndex method, of class MeetingController.
     */
    @Test
    public void testUpdateLastInvitationIndex() {
        System.out.println("updateLastInvitationIndex");
        LastIndex index = null;
        MeetingController instance = null;
        boolean expResult = false;
        boolean result = instance.updateLastInvitationIndex(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
