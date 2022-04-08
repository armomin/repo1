package bbSiteDemo

import java.text.SimpleDateFormat
import java.util.concurrent.TimeUnit

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import bsh.ParseException
import internal.GlobalVariable

/**
 * @author MOMIN
 *this keyword is used to get future Date , with reference to Date1 and Number Of Days (As Parameter)
 */

public class CalendarOperations {
	
	
	@Keyword
	def NextDate(String dateBefore, String days) {

		int number = Integer.parseInt(days);
		



		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		Calendar cal = Calendar.getInstance();
		try{
			cal.setTime(sdf.parse(dateBefore));
		}catch(ParseException e){
			e.printStackTrace();
		}
		cal.add(Calendar.DAY_OF_MONTH, number);
		String dateAfter = sdf.format(cal.getTime());


		
		System.out.println(dateAfter+" is the date after "+number+ " days");
		KeywordUtil.markPassed(dateAfter+" is the date after "+number+ " days")


		GlobalVariable.dateAfter=sdf.format(cal.getTime());
		
		
	}
	
	/**
	 * @author MOMIN
	 * 
	 * This Keyword Takes 2 Dates in mm/dd/yyyy format and return No. Of Days between both.
	 *
	 */
	
	@Keyword
	def findDifference(String startDate, String endDate)
	{
  
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
Date firstDate = sdf.parse(startDate);
Date secondDate = sdf.parse(endDate);

long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());

long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);


println diff +"  days is the difference between both Dates "
KeywordUtil.markPassed(diff +"  days is the difference between both Dates ")
	
	}
	
}


