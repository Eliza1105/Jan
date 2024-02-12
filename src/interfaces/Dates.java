package interfaces;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");
        String formattedDate = dateTimeFormatter.format(dateTime);
        System.out.println(formattedDate);

        dateTime= LocalDateTime.parse("2024-02-08T19:34");
        System.out.println(dateTime.format(dateTimeFormatter));

        //Сложение и вычитание дат дат

        Calendar calendar = new GregorianCalendar();
        Date dateNow = new Date();

        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yy");
        System.out.println(simpleDateFormat.format(dateNow));

        calendar.add(Calendar.DATE,22);
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        TimeZone timeZone= TimeZone.getDefault();
        System.out.println(timeZone);
        System.out.println(timeZone.getDisplayName());
    }
}

