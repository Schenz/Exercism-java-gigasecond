import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    static final long SECONDS = 1_000_000_000;

    private LocalDateTime localDateTime;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.localDateTime = addSeconds(birthDateTime, SECONDS);
    }

    LocalDateTime addSeconds(LocalDateTime birthDate, long seconds) {
        return birthDate.plusSeconds(seconds);
    }

    LocalDateTime getDate() {
        return this.localDateTime;
    }

}
