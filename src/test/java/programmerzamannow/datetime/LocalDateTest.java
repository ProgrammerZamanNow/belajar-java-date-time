package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

  @Test
  void create() {

    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(1980, Month.JANUARY, 10);
    LocalDate localDate3 = LocalDate.parse("1980-01-10");

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);

  }

  @Test
  void with() {

    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = localDate1.withYear(1980);
    LocalDate localDate3 = localDate1.withYear(1980).withMonth(1);

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);

  }

  @Test
  void modify() {

    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = localDate1.plusYears(10);
    LocalDate localDate3 = localDate1.minusMonths(10);

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }

  @Test
  void get() {
    LocalDate localDate1 = LocalDate.now();

    System.out.println(localDate1.getYear());
    System.out.println(localDate1.getMonth());
    System.out.println(localDate1.getMonthValue());
    System.out.println(localDate1.getDayOfMonth());
    System.out.println(localDate1.getDayOfWeek());
    System.out.println(localDate1.getDayOfYear());
  }
}
