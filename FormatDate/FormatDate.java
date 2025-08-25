import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Le' d MMM 'de l''an' yyyy 'à' H'h'm'm' 'et' s's'",
                Locale.FRENCH);
        return dateTime.format(formatter);
    }

    public static String formatSimple(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
        return time.format(formatter);
    }

}