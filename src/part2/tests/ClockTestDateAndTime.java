package part2.tests;

import static org.junit.Assert.*;

import org.junit.*;

import part2.clock.Clock;

/**
 * Created by nekosaur on 2016-02-16.
 */
public class ClockTestDateAndTime {
	
	Clock clock;
	String defaultTime;
	String defaultDate;
	
	@Before
	public void setUp() {
		clock = new Clock();
		defaultDate = clock.changeMode();
		defaultTime = clock.changeMode();
	}
	
    /**
     *
     * Time tests
     *
     */
	
	@Test
	public void testTimeDefault() throws Exception {
		assertEquals("00:00:00", defaultTime);
	}

    @Test
    public void testTimeSecondLowerBorder() throws Exception {
    	clock.changeMode();
    	clock.Reset();
    	assertEquals(defaultTime, clock.Set(12, 12, -1));
    	assertEquals("12:12:00", clock.Set(12, 12, 0));
    	assertEquals("12:12:01", clock.Set(12, 12, 1));
    }

    @Test
    public void testTimeSecondUpperBorder() throws Exception {
    	clock.changeMode();
    	clock.Reset();
    	assertEquals("12:12:58", clock.Set(12, 12, 58));
    	assertEquals("12:12:59", clock.Set(12, 12, 59));
    	assertEquals(defaultTime, clock.Set(12, 12, 60));
    }

    @Test
    public void testTimeMinuteLowerBorder() throws Exception {
    	clock.changeMode();
    	clock.Reset();
    	assertEquals(defaultTime, clock.Set(12, -1, 12));
    	assertEquals("12:00:12", clock.Set(12, 0, 12));
    	assertEquals("12:01:12", clock.Set(12, 1, 12));
    }

    @Test
    public void testTimeMinuteUpperBorder() throws Exception {
    	clock.changeMode();
    	clock.Reset();
    	assertEquals("12:12:58", clock.Set(12, 58, 12));
    	assertEquals("12:12:59", clock.Set(12, 59, 12));
    	assertEquals(defaultTime, clock.Set(12, 60, 12));
    }

    @Test
    public void testTimeHourLowerBorder() throws Exception {
    	clock.changeMode();
    	clock.Reset();
    	assertEquals(defaultTime, clock.Set(-1, 12, 12));
    	assertEquals("00:12:12", clock.Set(0, 12, 12));
    	assertEquals("01:12:12", clock.Set(1, 12, 12));
    }

    @Test
    public void testTimeHourUpperBorder() throws Exception {
    	clock.changeMode();
    	clock.Reset();
    	assertEquals("58:12:12", clock.Set(58, 12, 12));
    	assertEquals("59:12:12", clock.Set(59, 12, 12));
    	assertEquals(defaultTime, clock.Set(60, 12, 12));
    }


    /**
     *
     * Date tests
     *
     */

    @Test
    public void testDateDefault() throws Exception {
        // Change from Time to Date
        clock.changeMode();

    	assertEquals("2000-01-01", defaultDate);
    }

    @Test
    public void testDateYearLowerBorder() throws Exception {
    	clock.changeMode();
        clock.Reset();
    	String newDate = clock.Set(1999, 6, 15);
    	assertEquals(defaultDate, newDate);
        newDate = clock.Set(2000, 6, 15);
    	assertEquals("2000-06-15", newDate);
        newDate = clock.Set(2001, 6, 15);
    	assertEquals("2001-06-15", newDate);
    }

    @Test
    public void testDateYearUpperBorder() throws Exception {
    	clock.changeMode();
        clock.Reset();
    	String newDate = clock.Set(2099, 6, 15);
    	assertEquals("2099-06-15", newDate);
        newDate = clock.Set(2100, 6, 15);
    	assertEquals("2100-06-15", newDate);
        newDate = clock.Set(2101, 6, 15);
    	assertEquals("2100-06-15", newDate);
    }

    @Test
    public void testDateMonthLowerBorder() throws Exception {
    	clock.changeMode();
        clock.Reset();
    	String newDate = clock.Set(2050, 0, 15);
    	assertEquals(defaultDate, newDate);
        newDate = clock.Set(2050, 1, 15);
    	assertEquals("2050-01-15", newDate);
        newDate = clock.Set(2050, 2, 15);
    	assertEquals("2050-02-15", newDate);
    }

    @Test
    public void testDateMonthUpperBorder() throws Exception {
    	clock.changeMode();
        clock.Reset();
    	String newDate = clock.Set(2050, 11, 15);
    	assertEquals("2050-11-15", newDate);
        newDate = clock.Set(2050, 12, 15);
    	assertEquals("2050-12-15", newDate);
        newDate = clock.Set(2050, 13, 15);
    	assertEquals("2050-12-15", newDate);
    }

    @Test
    public void testDateDayLowerBorder() throws Exception {
    	clock.changeMode();
        clock.Reset();
    	String newDate = clock.Set(2050, 6, 0);
    	assertEquals(defaultDate, newDate);
    	newDate = clock.Set(2050, 6, 1);
    	assertEquals("2050-06-01", newDate);
    	newDate = clock.Set(2050, 6, 2);
    	assertEquals("2050-06-02", newDate);
    }

    @Test
    public void testDateDayUpperBorder() throws Exception {
    	clock.changeMode();
        clock.Reset();
        String newDate = clock.Set(2050, 6, 30);
    	assertEquals("2050-06-30", newDate);
        newDate = clock.Set(2050, 6, 31);
    	assertEquals("2050-06-31", newDate);
        newDate = clock.Set(2050, 6, 32);
    	assertEquals("2050-06-31", newDate);
    }

}