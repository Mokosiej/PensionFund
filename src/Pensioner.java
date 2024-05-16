public class Pensioner extends Person {

    public static final double PENSIONER_CONSTANT_SALARY = 2000.0;


    public Pensioner(String name, int year, int age, double height, int amountOfChildren, String birthDate, double minSalary, double maxSalary) {
        super(name, year, age, height, amountOfChildren, birthDate, minSalary, maxSalary);
    }


    @Override
    public double calculateAverageSalary() {
        return MathHelper.calculateAverage(getMinSalary(), getMaxSalary(), PENSIONER_CONSTANT_SALARY);
    }

}