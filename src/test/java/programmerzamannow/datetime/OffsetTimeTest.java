package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {

  @Test
  void create() {

    OffsetTime offsetTime1 = OffsetTime.now();
    OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
    OffsetTime offsetTime3 = OffsetTime.of(10, 10, 10, 10, ZoneOffset.ofHours(7));
    OffsetTime offsetTime4 = OffsetTime.parse("09:09:09.100+07:00");

    System.out.println(offsetTime1);
    System.out.println(offsetTime2);
    System.out.println(offsetTime3);
    System.out.println(offsetTime4);

    OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
    OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
    OffsetDateTime offsetDateTime3 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
    OffsetDateTime offsetDateTime4 = OffsetDateTime.parse("1980-09-17T10:10:10.100+05:00");

    System.out.println(offsetDateTime1);
    System.out.println(offsetDateTime2);
    System.out.println(offsetDateTime3);
    System.out.println(offsetDateTime4);
  }

  @Test
  void toLocalTime() {

    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);

    OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
    System.out.println(offsetTime);

    LocalTime localTime1 = offsetTime.toLocalTime();
    System.out.println(localTime1);

  }

  @Test
  void toLocalDateTime() {

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
    System.out.println(offsetDateTime);

    LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
    System.out.println(localDateTime1);

  }
}
