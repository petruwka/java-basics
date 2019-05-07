package java8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateAndTime {

    public static void main(String[] args) {
        // deprecated java.util.Date class
        Date date = new Date();

        // java.time package

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday = LocalDate.of(2019, Month.MAY, 6);

        LocalTime _13_00 = LocalTime.of(13, 0);
        System.out.println(_13_00);

        LocalDateTime today13 = LocalDateTime.of(today, _13_00);
        System.out.println(today13);

        LocalDate _2daysLater = today.plus(2, ChronoUnit.DAYS);
        System.out.println(_2daysLater);

        today.minusDays(2);
        System.out.println(today);

        ZonedDateTime zoned = ZonedDateTime.of(today13, ZoneOffset.ofHours(1));
        System.out.println(zoned);

        ZonedDateTime zonedDateTime = today
                .atTime(14, 14)
                .atZone(ZoneOffset.ofHours(2));

        System.out.println(zonedDateTime);


        Period period = Period.between(
                LocalDate.of(2016, 1,5),
                LocalDate.now()
        );
        System.out.println(period);

        Duration duration = Duration.of(40, ChronoUnit.MINUTES);

        ZonedDateTime zonedWith40Min = zonedDateTime.plus(duration);
        System.out.println(zonedWith40Min);

    }
}
