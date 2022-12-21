import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TotalCalories {
    private DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    public int calcCalories(int calories, String startDate, String endDate) {
        int days = 0;
        try {
            Date date1 = format.parse(startDate);
            Date date2 = format.parse(endDate);
            long difference = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return days * calories;
    }
    
}