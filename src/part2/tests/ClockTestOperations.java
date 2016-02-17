package part2.tests;

import static org.junit.Assert.*;

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
        // Change from Time to Date
        clock.changeMode();

        // Put clock in Reset mode
        String alterDate = clock.Reset();

        // Press Reset again, no change
        String stillAlterDate = clock.Reset();

        assertNotNull(alterDate);
        assertEquals(alterDate, stillAlterDate);
    }

    @Test
    public void testResetFromTimeReset() throws Exception {
        // Put clock in Reset mode
        String alterTime = clock.Reset();

        // Press Reset again, no change
        String stillAlterTime = clock.Reset();

        assertNotNull(alterTime);
        assertEquals(alterTime, stillAlterTime);
    }

    @Test
    public void testChangeModeFromDateReset() throws Exception {
        // Change from Time to Date
        clock.changeMode();

        // Put clock in Reset mode
        String alterDate = clock.Reset();

        // Try pressing Change Mode, but we should still be in Alter Date mode
        String stillAlterDate = clock.changeMode();

        assertNotNull(alterDate);
        assertEquals(alterDate, stillAlterDate);
    }

    @Test
    public void testChangeModeFromTimeReset() throws Exception {
        // Put clock in Reset mode
        String alterTime = clock.Reset();

        // Try pressing Change Mode, but we should still be in Alter Time mode
        String stillAlterTime = clock.changeMode();

        assertNotNull(alterTime);
        assertEquals(alterTime, stillAlterTime);
    }

    @Test
    public void testSetFromDate() throws Exception {
        // Change from Time to Date, store current date
        String curDate = clock.changeMode();

        // Try using Set from Date
        String newDate = clock.Set(2015, 2, 15);

        assertNotNull(curDate);
        assertEquals(curDate, newDate);
    }

    @Test
    public void testSetFromTime() throws Exception {
        // Change from Time to Date
        clock.changeMode();

        // Change back to Time, store current time
        String curTime = clock.changeMode();

        // Try using Set from Time
        String newTime = clock.Set(16, 30, 0);

        assertNotNull(curTime);
        assertEquals(curTime, newTime);
    }

    @After
    public void tearDown() {
        clock = null;
    }
}
