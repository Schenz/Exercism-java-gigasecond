import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {

    private LocalDateTime localDateTime;

    Gigasecond(LocalDate birthDate) {
        this.localDateTime = LocalDateTime
                .of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth(), 0, 0)
                .plus(1000000000, ChronoUnit.SECONDS);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.localDateTime = birthDateTime.plus(1000000000, ChronoUnit.SECONDS);
    }

    LocalDateTime getDate() {
        return this.localDateTime;
    }

}
