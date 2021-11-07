package Interview;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClassTimer {
    public static void main(String[] args) {
        System.out.println(new ClassTimer().solution("20:00", "06:00"));
    }

    public int solution(String A, String B) {
        // write your code in Java SE 8
        DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter halfFormat = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime start = LocalTime.parse(A, halfFormat);
        LocalTime end = LocalTime.parse(B, halfFormat);
        LocalDateTime origStart;
        LocalDateTime origEnd;
        int round = 0;

        if (start.isBefore(end)) {
            origStart = LocalDateTime.parse("01-01-2001 " + A, fullFormat);
            origEnd = LocalDateTime.parse("01-01-2001 " + B, fullFormat);
        } else {
            origStart = LocalDateTime.parse("01-01-2001 " + A, fullFormat);
            origEnd = LocalDateTime.parse("02-01-2001 " + B, fullFormat);
        }


        LocalDateTime sprintStart = LocalDateTime.parse("01-01-2001 00:00", fullFormat);

        while (sprintStart.isBefore(origEnd)) {
            if (sprintStart.isAfter(origStart) || sprintStart.equals(origStart)) {
                sprintStart = sprintStart.plusMinutes(15);
                if (sprintStart.isBefore(origEnd) || sprintStart.equals(origEnd)) {
                    round++;
                }
            } else {
                sprintStart = sprintStart.plusMinutes(15);
            }
        }
        return round;
    }
}
