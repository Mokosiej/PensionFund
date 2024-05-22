public class Worker extends Person implements Employable {

    public Worker(String name, int year, int age, double height, int amountOfChildren, String birthDate, double minSalary, double maxSalary) {
        super(name, year, age, height, amountOfChildren, birthDate, minSalary, maxSalary);
    }


    @Override
    public double calculateAverageSalary() {
        return MathHelper.calculateAverage(getMinSalary(), getMaxSalary());
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                "year=" + year +
                ", age=" + age +
                ", height=" + height +
                ", numberOfChildren=" + amountOfChildren +
                ", birthDate=" + birthDate +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }

    @Override
    public void goToWork() {
        System.out.println("Я счастливо шагаю на работу");
    }
}