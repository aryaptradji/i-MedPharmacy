/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aryap
 */
public class StaffTest {
    
    public StaffTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class Staff.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.login();
        assertEquals(expResult, result);
    }

    /**
     * Test of logout method, of class Staff.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.logout();
        assertEquals(expResult, result);
    }

    /**
     * Test of regraff method, of class Staff.
     */
    @Test
    public void testRegraff() {
        System.out.println("regraff");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.regraff();
        assertEquals(expResult, result);
    }

    /**
     * Test of getByUsrId method, of class Staff.
     */
    @Test
    public void testGetByUsrId() {
        System.out.println("getByUsrId");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getByUsrId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Staff.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Staff instance = new Staff();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Staff.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Staff instance = new Staff();
        instance.setId(id);
    }

    /**
     * Test of getUsername method, of class Staff.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class Staff.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Staff instance = new Staff();
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class Staff.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Staff.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Staff instance = new Staff();
        instance.setPassword(password);
    }

    /**
     * Test of getIcode method, of class Staff.
     */
    @Test
    public void testGetIcode() {
        System.out.println("getIcode");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getIcode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIcode method, of class Staff.
     */
    @Test
    public void testSetIcode() {
        System.out.println("setIcode");
        String icode = "";
        Staff instance = new Staff();
        instance.setIcode(icode);
    }
    
}
