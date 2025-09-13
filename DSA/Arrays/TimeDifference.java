package Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeDifference {
	 public static void main(String[] args) {
	        Date downTime = null;
	        Date upTime = null;
	        long diffHours = 0;
	        try {
	            SimpleDateFormat sdfformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	            downTime = sdfformat.parse("2024-02-14 22:00:00");
	            upTime = sdfformat.parse("2024-02-21 17:00:00");
	            long diff = upTime.getTime() - downTime.getTime();
	            System.out.println("Uptime " + 	upTime.getTime());
	            System.out.println("Downtime " + downTime.getTime());
	            diffHours = diff / (60 * 60 * 1000);
	            System.out.println("Time difference: " + diffHours + " hours");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
