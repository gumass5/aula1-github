package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1= new SimpleDateFormat ("dd/MM/yy");
		SimpleDateFormat sdf2= new SimpleDateFormat ("dd/MM/yy HH:mm:ss");
		
		Date y1=sdf1.parse("05/11/1996");
		Date y2=sdf2.parse("05/11/1996 23:42:34");
		Date y3=Date.from(Instant.parse("1996-11-05T15:55:42Z"));		
				
				System.out.println(sdf1.format(y1));
				System.out.println(sdf2.format(y2));
				System.out.println(y3);
				
				
	}

}
