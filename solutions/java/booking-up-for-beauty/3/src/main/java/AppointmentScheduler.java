import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    /*
     * Implement the AppointmentScheduler.schedule() method to parse a textual representation of an appointment date into the corresponding LocalDateTime:
     */
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        LocalDateTime datetime =  LocalDateTime.parse(appointmentDateDescription, formatter);
        return datetime;
    }

    /*
     * Implement the AppointmentScheduler.hasPassed() method that takes an appointment date and checks if the appointment was somewhere in the past:
     */
    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    /**
     * Implement the AppointmentScheduler.isAfternoonAppointment() method that takes an appointment date and checks if the appointment is in the afternoon (>= 12:00 and < 18:00):
     * @param appointmentDate
     * @return
     */
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour()>=12&&appointmentDate.getHour()<18;
    }

    /**
     * Implement the AppointmentScheduler.getDescription() method that takes an appointment date and returns a description of that date and time:
     * @param appointmentDate
     * @return
     */
    public String getDescription(LocalDateTime appointmentDate) {
        String day = appointmentDate.getDayOfWeek().toString().toLowerCase();
        day = day.replace(day.charAt(0), String.valueOf(day.charAt(0)).toUpperCase().toCharArray()[0]);
        String month = appointmentDate.getMonth().toString().toLowerCase();
        month = month.replace(month.charAt(0), String.valueOf(month.charAt(0)).toUpperCase().toCharArray()[0]);
        String monthDay = String.valueOf(appointmentDate.getDayOfMonth());
        String year = String.valueOf(appointmentDate.getYear());
        String time = String.valueOf(appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a")));
        return "You have an appointment on "+day+", "+month+" "+monthDay+", "+year+", at "+time;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDateTime.now().getYear(), 9, 15);
    }
}
