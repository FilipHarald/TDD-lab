package part2.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import part2.clock.Clock;

import static org.junit.Assert.*;

/**
 * Created by nekosaur on 2016-02-16.
 */
public class ClockTestStateTransitions {

    Clock clock;

    @Before
    public void setUp() {
        clock = new Clock();
    }

    @Test
    public void testStateFromDateToDateReset() throws Exception {
        // Change mode to Date
        clock.changeMode();

        String alterDate = clock.Reset();

        assertNotNull(alterDate);
        assertEquals("Alter Date", alterDate);
    }

    @Test
    public void testStateFromDateResetToDate() throws Exception {
        // change mode to Date
        clock.changeMode();

        // get into Reset mode
        clock.Reset();

        // set new valid date
        String newDate = clock.Set(2000, 12, 31);

        assertNotNull(newDate);
        assertEquals("2000-12-31", newDate);
    }

    @Test
    public void testStateFromDateToTime() throws Exception {
        // switch to Date mode
        clock.changeMode();

        // switch back to Time
        String time = clock.changeMode();

        assertNotNull(time);
        assertEquals("00:00:00", time);
    }

    @Test
    public void testStateFromTimeToDate() throws Exception {

        String date = clock.changeMode();

        assertNotNull(date);
        assertEquals("2000-01-01", date);
    }

    @Test
    public void testStateFromTimeToTimeReset() throws Exception {

        String alterTime = clock.Reset();

        assertNotNull(alterTime);
        assertEquals("Alter Time", alterTime);
    }

    @Test
    public void testStateFromTimeResetToTime() throws Exception {

        // Go into Reset mode
        clock.Reset();

        // Set new valid date
        String newTime = clock.Set(12, 12, 12);

        assertNotNull(newTime);
        assertEquals("12:12:12", newTime);
    }

    @After
    public void tearDown() {
        clock = null;
    }

}