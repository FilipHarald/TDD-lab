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
    	String s = Rovar.derov("rorovovarorsospoprorakoketot");
    	assertEquals("rovarspraket", s);
    }
    
    @Test
    public void testDerovCorrectUpperCase() throws Exception {
    	String s = Rovar.derov("ROROVOVARORSOSPOPRORAKOKETOT");
    	assertEquals("ROVARSPRAKET", s);
    }
    
    @Test
    public void testDerovNumbers() throws Exception {
    	String s = Rovar.derov("123");
    	assertEquals("123", s);
    }
    
    @Test
    public void testDerovOtherChars() throws Exception {
    	String s = Rovar.derov("!=&");
    	assertEquals("!=&", s);
    }
}