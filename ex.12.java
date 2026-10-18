
import java.util.ArrayList;

class Timetable {
    private String subject;
    private String faculty;
    private String timeSlot;

    Timetable(String subject, String faculty, String timeSlot) {
        this.subject = subject;
        this.faculty = faculty;
        this.timeSlot = timeSlot;
    }

    public String getSubject() {
        return subject;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
}

public class CollegeTimetable {
    public static void main(String[] args) {

        ArrayList<Timetable> timetable = new ArrayList<>();

        timetable.add(new Timetable("Java", "Dr. Kumar", "9:00 - 10:00 AM"));
        timetable.add(new Timetable("Data Structures", "Ms. Priya", "10:00 - 11:00 AM"));
        timetable.add(new Timetable("Operating System", "Mr. Arun", "11:15 AM - 12:15 PM"));
        timetable.add(new Timetable("Artificial Intelligence", "Ms. Divya", "1:00 - 2:00 PM"));

        System.out.println("       COLLEGE TIMETABLE");
        System.out.println("--------------------------------");

        for (Timetable t : timetable) {
            System.out.println("Subject : " + t.getSubject());
            System.out.println("Faculty : " + t.getFaculty());
            System.out.println("Time    : " + t.getTimeSlot());
            System.out.println("--------------------------------");
        }
    }
}
