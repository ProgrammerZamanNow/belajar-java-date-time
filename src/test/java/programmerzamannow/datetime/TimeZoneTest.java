package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {

  @Test
  void create() {

    TimeZone timeZoneDefault = TimeZone.getDefault();
    System.out.println(timeZoneDefault);

    TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT");
    System.out.println(timeZoneGMT);

    String[] availableIDs = TimeZone.getAvailableIDs();
    Arrays.asList(availableIDs).forEach(zoneId -> System.out.println(zoneId));

  }

  @Test
  void date() {

    Date date = new Date();
    System.out.println(date.toString());
    System.out.println(date.toGMTString());

  }

  @Test
  void calendar() {

    Calendar calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
    Calendar calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));

    calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
    System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));

  }
}
