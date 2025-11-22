import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFeatures {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: "+ date);

        LocalTime time = LocalTime.now();
        System.out.println("Time: "+ time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date Time: "+ dateTime);

        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatPattern);
        System.out.println(formattedDate);

        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();


        System.out.println(month+" "+day);


        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println(currentZone);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);

        System.out.println(tokyoZone);
    }
}
