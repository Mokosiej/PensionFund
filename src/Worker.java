public class Worker extends Person {

    public Worker(String name, int year, int age, double height, int amountOfChildren, String birthDate, double minSalary, double maxSalary) {
        super(name, year, age, height, amountOfChildren, birthDate, minSalary, maxSalary);
    }


    @Override
    public double calculateAverageSalary() {
        return MathHelper.calculateAverage(getMinSalary(), getMaxSalary());
    }
}