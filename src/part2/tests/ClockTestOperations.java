package part2.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import part2.clock.Clock;

/**
 * Created by nekosaur on 2016-02-16.
 */
public class ClockTestOperations {

    private Clock clock;

    @Before
    public void setUp() {
        clock = new Clock();
    }

    @Test
    public void testResetFromDateReset() throws Exception {
        
    }

    @Test
    public void testResetFromTimeReset() throws Exception {

    }

    @Test
    public void testChangeModeFromDateReset() throws Exception {

    }

    @Test
    public void testChangeModeFromTimeReset() throws Exception {

    }

    @Test
    public void testSetFromDate() throws Exception {

    }

    @Test
    public void testSetFromTime() throws Exception {

    }

    @After
    public void tearDown() {
        clock = null;
    }
}
