public class Aspirant extends Student {


    public Aspirant(String firstName, String lastName, String group, double averagemark) {
        super(firstName, lastName, group, averagemark);

    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getGroup() {
        return super.getGroup();
    }

    @Override
    public void setGroup(String group) {

    }

    @Override
    public double getAveragemark() {
        return super.getAveragemark();
    }

    @Override
    public void setAveragemark(double averagemark) {
        super.setAveragemark(averagemark);
    }

    public void getScholarship() {
        if (5 <= getAveragemark()) {
            System.out.println("You recived a 2000 som scholarship");
        } else if (5 >= getAveragemark()) {
            System.out.println("You recived a 1900 som scholarship ");
        }
    }


}







