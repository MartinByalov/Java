package simpledateformat;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample {

	public static void main(String[] args) {

		Date dNow = new Date();

		SimpleDateFormat format = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current date is: " + format.format(dNow));
	}
}
