import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println("Current Date" +c.getTime());

        c.add(Calendar.DAY_OF_MONTH,5);
        System.out.println("Update Date:"+ c. getTime());
    }
}
