import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.regex.*;

public class UserMainCode {
	public static int getValidDate(String s)
	{
		Pattern p1 = Pattern.compile("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}");
		Matcher m = p1.matcher(s);
		Pattern p2 = Pattern.compile("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}");
		Matcher m1 = p2.matcher(s);
		Pattern p3 = Pattern.compile("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}");
		Matcher m2 = p3.matcher(s);
		if(m.matches())
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
			sdf.setLenient(false);
			try
			{
				Date d1= sdf.parse(s);
				return 1;
			}
			catch(ParseException e)
			{
				return 0;
			}
		}
		else if(m1.matches())
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			sdf.setLenient(false);
			try
			{
				Date d1 = sdf.parse(s);
				return 1;
			}
			catch(ParseException e)
			{
				return 0;
			}
		}
		else if(m2.matches())
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			sdf.setLenient(false);
			try
			{
				Date d1 = sdf.parse(s);
				return 1;
			}
			catch(ParseException e)
			{
				return 0;
			}
		}
		return 0;
		
	}

	
}
