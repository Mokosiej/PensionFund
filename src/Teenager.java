public class Teenager extends Person {
    private String schoolName;
    private int gradeLevel;

    public Teenager(String name, int year, int age, double height, int amountOfChildren, String birthDate, double minSalary, double maxSalary, String schoolName, int gradeLevel) {
        super(name, year, age, height, amountOfChildren, birthDate, minSalary, maxSalary);
        this.schoolName = schoolName;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public double calculateAverageSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "Teenager{" + super.toString() +
                ", schoolName='" + schoolName + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}

