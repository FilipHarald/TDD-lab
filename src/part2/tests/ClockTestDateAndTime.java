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
    	clock.Set(12, 12, -1);
    	clock.changeMode();
    	assertEquals(defaultTime, clock.changeMode());
    	clock.Set(12, 12, 0);
    	clock.changeMode();
    	assertEquals("00:00:00", clock.changeMode());
    	clock.Set(12, 12, 1);
    	clock.changeMode();
    	assertEquals("00:00:01", clock.changeMode());
    }

    @Test
    public void testTimeSecondUpperBorder() throws Exception {
    	clock.Set(12, 12, 58);
    	clock.changeMode();
    	assertEquals("00:00:58", clock.changeMode());
    	clock.Set(12, 12, 59);
    	clock.changeMode();
    	assertEquals("00:00:59", clock.changeMode());
    	clock.Set(12, 12, 60);
    	clock.changeMode();
    	assertEquals(defaultTime, clock.changeMode());
    }

    @Test
    public void testTimeMinuteLowerBorder() throws Exception {
    	clock.Set(12, -1, 12);
    	clock.changeMode();
    	assertEquals(defaultTime, clock.changeMode());
    	clock.Set(12, 0, 12);
    	clock.changeMode();
    	assertEquals("00:00:00", clock.changeMode());
    	clock.Set(12, 1, 12);
    	clock.changeMode();
    	assertEquals("00:01:00", clock.changeMode());
    }

    @Test
    public void testTimeMinuteUpperBorder() throws Exception {
    	clock.Set(12, 58, 12);
    	clock.changeMode();
    	assertEquals("00:00:58", clock.changeMode());
    	clock.Set(12, 59, 12);
    	clock.changeMode();
    	assertEquals("00:00:59", clock.changeMode());
    	clock.Set(12, 60, 12);
    	clock.changeMode();
    	assertEquals(defaultTime, clock.changeMode());
    }

    @Test
    public void testTimeHourLowerBorder() throws Exception {
    	clock.Set(-1, 12, 12);
    	clock.changeMode();
    	assertEquals(defaultTime, clock.changeMode());
    	clock.Set(0, 12, 12);
    	clock.changeMode();
    	assertEquals("00:00:00", clock.changeMode());
    	clock.Set(1, 12, 12);
    	clock.changeMode();
    	assertEquals("01:00:00", clock.changeMode());
    }

    @Test
    public void testTimeHourUpperBorder() throws Exception {
    	clock.Set(58, 12, 12);
    	clock.changeMode();
    	assertEquals("58:00:00", clock.changeMode());
    	clock.Set(59, 12, 12);
    	clock.changeMode();
    	assertEquals("59:00:00", clock.changeMode());
    	clock.Set(60, 12, 12);
    	clock.changeMode();
    	assertEquals(defaultTime, clock.changeMode());
    }


    /**
     *
     * Date tests
     *
     */

    @Test
    public void testDateDefault() throws Exception {
    	assertEquals("2000-January-1", defaultDate);
    }

    @Test
    public void testDateYearLowerBorder() throws Exception {

    }

    @Test
    public void testDateYearUpperBorder() throws Exception {

    }

    @Test
    public void testDateMonthLowerBorder() throws Exception {

    }

    @Test
    public void testDateMonthUpperBorder() throws Exception {

    }

    @Test
    public void testDateDayLowerBorder() throws Exception {

    }

    @Test
    public void testDateDayUpperBorder() throws Exception {

    }

}