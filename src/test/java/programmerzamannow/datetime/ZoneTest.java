package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneTest {

  @Test
  void createZoneId() {

    ZoneId zoneId = ZoneId.systemDefault();
    System.out.println(zoneId);

    ZoneId zoneIdGMT = ZoneId.of("GMT");
    System.out.println(zoneIdGMT);

    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    availableZoneIds.forEach(id -> System.out.println(id));

  }

  @Test
  void createZoneOffset() {
    ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
    ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
    ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

    System.out.println(zoneOffset1);
    System.out.println(zoneOffset2);
    System.out.println(zoneOffset3);
  }
}
