/*
 * Muhammad Aaqib Jamili	
 * 991493230
 * 
 * */

package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {
	
	/*
	 * adding a failed test  
	 */
@Test
void testGetMilliSeconds() {
	int milliSeconds = Time.getMilliSeconds("10:59:59:005");
	assertTrue("The Milliseconds were not calculated properly", milliSeconds==5);
	
}
	
	/*
	 *  Test on good input. We expect  this test to return price in correct format.
	 */
	@Test
	public void testGetTotalSecondsGood() 
	{
		int seconds = Time.getTotalSeconds("05:05:05:100");
		assertTrue("The seconds were not calculated properly", seconds==18305);
	}
	/*
	 *  Test on bad input. We expect  this test to return price in Canadian Dollar.
	 */

	@Test
	public void testGetTotalSecondsBad() 
	{
	assertThrows(
	 StringIndexOutOfBoundsException.class, 
	 ()-> {Time.getTotalSeconds("10:00:90");});
	}
	
	/*
	 *  A method to check that method will still work on boundary input.
	 */
	@Test
	public void testGetTotalSecondsBoundary() 
	{
		int seconds = Time.getTotalSeconds("05:05:00:000");
		assertTrue("The seconds were not calculated properly", seconds>=0 || seconds <=59);
	}
	
	/*
	 *  Test on good input. We expect  this test to return price in correct format.
	 */

	@Test
	void testGetTotalMinutesGood() {
		
		int minutes = Time.getTotalMinutes("08:01:00:123");
		assertTrue("The minutes were not calculated properly", minutes==1);
		
	}
	
	/*
	 *  Test on bad input. We expect  this test to return price in Canadian Dollar.
	 */
	
	@Test
	public void testGetTotalMinutesBad() 
	{
	assertThrows(
	 StringIndexOutOfBoundsException.class, 
	 ()-> {Time.getTotalMinutes("06:62:12");});
	}
	
	/*
	 *  A method to check that method will still work on boundary input.
	 */
	@Test
	public void testGetMinutesBoundary() 
	{
		int minutes = Time.getTotalMinutes("05:59:05");
		assertTrue("The minutes were not calculated properly", minutes >=0 && minutes <=59);
	}
	
	/*
	 *  Test on good input. We expect  this test to return price in correct format.
	 */
	@Test
	void testGetTotalHoursGood() {
		int hours = Time.getTotalHours("05:05:05");
		assertTrue("The seconds were not calculated properly", hours==5);
	}
	
	/*
	 *  Test on bad input. We expect  this test to return price in Canadian Dollar.
	 */
	@Test
	public void testGetTotalHoursBad() 
	{
	assertThrows(
	 StringIndexOutOfBoundsException.class, 
	 ()-> {Time.getTotalHours("13:00:00");});
	}
	
	/*
	 *  A method to check that method will still work on boundary input.
	 */
	@Test
	public void testGetHoursBoundary() 
	{
		int hours = Time.getTotalHours("12:00:00");
		assertTrue("The seconds were not calculated properly", hours >=1 && hours <=12);
	}
}
