package ua.kliushenkov.hw7.Task1;

public class Aspirant extends Student {
    String sinceWork;

    protected Aspirant(String firstName, String lastName, String group, double averageMark, String sinceWork) {
        super(firstName, lastName, group, averageMark);
        this.sinceWork = sinceWork;
    }

    protected int getScholarship() {
        int scholarship = 180;
        if (averageMark == 5) {
            scholarship = 200;
        }
        return scholarship;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark + '\'' +
                ", sinceWork='" + sinceWork + '\'' +
                '}';
    }
}
