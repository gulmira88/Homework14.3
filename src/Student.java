public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averagemark = 4;

    public Student(String firstName, String lastName, String group, double averagemark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averagemark = averagemark;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAveragemark() {
        return averagemark;
    }

    public void setAveragemark(double averagemark) {
        this.averagemark = averagemark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averagemark=" + averagemark +
                '}';
    }

    public void getScholarship() {
        if (5 <= averagemark) {
            System.out.println("You recived a 2000 som scholarship");
        } else if (5 >= averagemark) {
            System.out.println("You recived a 1900 som scholarship ");

        }

    }
}







