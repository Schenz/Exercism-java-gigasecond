import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {

    static final long SECONDS = 1_000_000_000;

    private LocalDateTime localDateTime;

    Gigasecond(LocalDate birthDate) {
        this.localDateTime = addSeconds(birthDate.atStartOfDay(), SECONDS);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.localDateTime = addSeconds(birthDateTime, SECONDS);
    }

    LocalDateTime addSeconds(LocalDateTime birthDate, long seconds) {
        return birthDate.plus(seconds, ChronoUnit.SECONDS);
    }

    LocalDateTime getDate() {
        return this.localDateTime;
    }

}
