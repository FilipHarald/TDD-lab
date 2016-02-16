package part1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nekosaur on 2016-02-16.
 */
public class RovarTest {

    @Test
    public void testEnrovNull() throws Exception {

        String s = Rovar.enrov(null);
        assertNull(s);

    }

    @Test
    public void testEnrovEmpty() throws Exception {

        String s = Rovar.enrov("");
        assertEquals(s, "");

    }

    @Test
    public void testEnrovCorrectLower() throws Exception {

        String s;

        s = Rovar.enrov("abcdefghijklmnopqrstuvwxyzåäö1234567890!");
        assertEquals("abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzozåäö1234567890!", s);

    }

    @Test
    public void testEnrovCorrectUpper() throws Exception {
        String s = Rovar.enrov("ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ1234567890!");
        assertEquals("ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNqONOPOPQOQRORSOSTOTUVOVWOWXOXYZOZÅÄÖ1234567890!", s);
    }

    @Test
    public void testDerovNull() throws Exception {
    	String s = Rovar.derov(null);
    	assertNull(s);
    }

    @Test
    public void testDerovEmpty() throws Exception {
    	String s = Rovar.derov("");
    	assertEquals("", s);
    }

    @Test
    public void testDerovCorrectLowerCase() throws Exception {
    	String s = Rovar.derov("abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzozåäö1234567890");
    	assertEquals("abcdefghijklmnopqrstuvwxyzåäö1234567890", s);
    }
    
    @Test
    public void testDerovCorrectUpperCase() throws Exception {
    	String s = Rovar.derov("ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNqONOPOPQOQRORSOSTOTUVOVWOWXOXYZOZÅÄÖ1234567890");
    	assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ1234567890", s);
    }
}