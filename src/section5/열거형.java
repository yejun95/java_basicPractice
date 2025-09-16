package section5;

import java.time.temporal.WeekFields;

enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class 열거형 {
    public static void main(String[] args) {
        Week week = Week.SUNDAY;
        System.out.println(Week.valueOf("MONDAY").ordinal());
        System.out.println(week.name());
        System.out.println(week.ordinal());

        for (Week w : Week.values()) {
            System.out.println(w.name());
        }
    }
}
