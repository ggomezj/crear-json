package com.qualitas.modelo.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ggomez
 */
public class MotherBoardTest {
    
    public MotherBoardTest() {
    }
    
    
    @Test
    public void testGetMemoria() {
        System.out.println("getMemoria");
        MotherBoard instance = new MotherBoard("","");
        int expResult = 0;
        int result = instance.getMemoria();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}