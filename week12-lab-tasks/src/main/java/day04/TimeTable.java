package day04;

public class TimeTable {
    private String name;
    private String subject;
    private String className;
    private int hours;

    public TimeTable(String name, String subject, String className, int hours) {
        this.name = name;
        this.subject = subject;
        this.className = className;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    public int getHours() {
        return hours;
    }
}
