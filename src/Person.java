public abstract class Person {


    String name;
    int year;
    int age;
    double height;
    int amountOfChildren;
    String birthDate;
    double minSalary;
    double maxSalary;

    public static final int DEFAULT_WORKING_AGE = 18;


    public void Info() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + year);
        System.out.println("Cтаж работы: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Количество детей: " + amountOfChildren);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Минимальная зарплата: " + minSalary);
        System.out.println("Максимальная зарплата: " + maxSalary);

    }

    public Person(String name, int year, int age, double height, int amountOfChildren, String birthDate, double minSalary, double maxSalary) {
        this.name = name;
        this.year = year;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
        this.birthDate = birthDate;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public void greet() {
        System.out.println("Привет! Меня зовут " + name + ".");
    }


    public int calculateExperience() {
        return age - DEFAULT_WORKING_AGE;
    }

    abstract double calculateAverageSalary();


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Person{" +
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
}







