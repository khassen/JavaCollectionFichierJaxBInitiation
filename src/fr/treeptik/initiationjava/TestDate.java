package fr.treeptik.initiationjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		String date = "21/11/2011 16:00";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	
		Date date2 = dateFormat.parse(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date2);
		calendar.add(Calendar.DATE, 10);
		date2 = calendar.getTime();
		// transformer une date en une chaine de caractére.
		System.out.println(dateFormat.format(date2));

	}

}
