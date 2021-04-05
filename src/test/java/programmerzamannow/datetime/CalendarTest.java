package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

  @Test
  void create() {

    Calendar calendar = Calendar.getInstance();

    Date date = calendar.getTime();
    System.out.println(date);

  }

  @Test
  void modifyCalendar() {

    Calendar calendar = Calendar.getInstance();

    calendar.set(Calendar.YEAR, 1980);
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    calendar.set(Calendar.DAY_OF_MONTH, 10);
    calendar.set(Calendar.HOUR_OF_DAY, 15);
    calendar.set(Calendar.MINUTE, 50);
    calendar.set(Calendar.SECOND, 30);
    calendar.set(Calendar.MILLISECOND, 100);

    Date date = calendar.getTime();
    System.out.println(date);
    System.out.println(date.getTime());

  }

  @Test
  void getCalendar() {

    Calendar calendar = Calendar.getInstance();

    System.out.println(calendar.get(Calendar.YEAR));
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendar.get(Calendar.MINUTE));
    System.out.println(calendar.get(Calendar.SECOND));
    System.out.println(calendar.get(Calendar.MILLISECOND));

  }
}
