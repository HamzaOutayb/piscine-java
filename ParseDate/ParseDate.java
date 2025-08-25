import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ParseDate {
    private static final DateTimeFormatter Localformater = DateTimeFormatter.ISO_DATE_TIME;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH);

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate, Localformater);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate ==  null) return null;
      String newstringDate = stringDate.replace(" heures du soir, ", ":")
                .replace(" heures du matin, ", ":")
                .replace(" minutes et ", ":")
                .replace(" secondes", "");
        String[] parts = newstringDate.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2]);

        // Adjust PM hours
        if (stringDate.contains("soir") && hour < 12) {
            hour += 12;
        }

        return LocalTime.of(hour, minute, second);

    }

}
