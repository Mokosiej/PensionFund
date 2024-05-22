import java.util.Random;

public class Pensioner extends Person implements Employable {

    public static final double PENSIONER_CONSTANT_SALARY = 2000.0;


    public Pensioner(String name, int year, int age, double height, int amountOfChildren, String birthDate, double minSalary, double maxSalary) {
        super(name, year, age, height, amountOfChildren, birthDate, minSalary, maxSalary);
    }


    @Override
    public double calculateAverageSalary() {
        return MathHelper.calculateAverage(getMinSalary(), getMaxSalary(), Pensioner.PENSIONER_CONSTANT_SALARY);
    }

    @Override
    public String toString() {
        return "Pensioner{" +
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
        Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("Я вообще-то на пенсии");
        } else {
            System.out.println("Ладно, немного поработаю");
        }
    }
}








