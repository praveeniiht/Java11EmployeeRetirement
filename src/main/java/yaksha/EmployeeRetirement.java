package yaksha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeRetirement {
	public static ArrayList<String> retirementEmployeeList(HashMap<String, String> hm) {
		String s1 = "01/01/2014";
		int year;
		ArrayList<String> al = new ArrayList<String>();
		for (Map.Entry<String, String> map : hm.entrySet()) {
			String s = map.getValue();
			if (s.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				sdf.setLenient(false);
				try {
					Calendar c = Calendar.getInstance();
					Date d1 = sdf.parse(s1);
					Date d2 = sdf.parse(s);
					c.setTime(d1);
					int y1 = c.get(Calendar.YEAR);
					int m1 = c.get(Calendar.MONTH);
					int d11 = c.get(Calendar.DATE);
					c.setTime(d2);
					int y2 = c.get(Calendar.YEAR);
					int m2 = c.get(Calendar.MONTH);
					int d22 = c.get(Calendar.DATE);
					year = Math.abs(y2 - y1);
					if (m1 > m2)
						year--;
					else if (m2 == m1 && d11 > d22)
						year--;

					if (year >= 60) {
						String k = map.getKey();
						al.add(k);
					}
				} catch (ParseException e) {
					return al;
				}
			}
		}

		Collections.sort(al);
		return al;
	}
}
