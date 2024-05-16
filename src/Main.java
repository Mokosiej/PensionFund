public class Main {
    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("Наш Пенсионный Фонд", 1990, 1000, 1500, "Poland, Warsaw");


        Worker worker = new Worker("Василий", 37, 18, 180, 3, "1987-02-29", 1000, 5000);
        Pensioner pensioner = new Pensioner("Петр", 63,30,174, 2, "1961-01-02", 900, 5500);


        double workerPension = pensionFund.calculateFuturePension(worker);
        double pensionerPension = pensionFund.calculateFuturePension(pensioner);


        System.out.println("Будущая пенсия для работника " + worker.getName() + ": " + workerPension);
        System.out.println("Будущая пенсия для пенсионера " + pensioner.getName() + ": " + pensionerPension);
    }
}


