public class Main {

    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("Наш Пенсионный Фонд", 1990, 1000, 1500, "Poland, Warsaw");


        Worker worker = new Worker("Иван", 42, 20, 160, 1, "1982-04-20", 2000, 6000);
        Pensioner pensioner = new Pensioner("Мария", 68,15,170, 0, "1956-10-01", 700, 4500);
        Teenager teenager = new Teenager("Артем", 15, 170, 0, 0, "2009-06-30", 0, 0, "High School",10);



        double workerPension = pensionFund.calculatePension(worker);
        double pensionerPension = pensionFund.calculatePension(pensioner);
        double teenagerPension = pensionFund.calculatePension(teenager);


        System.out.println("Будущая пенсия для работника " + worker.getName() + ": " + workerPension);
        System.out.println("Будущая пенсия для пенсионера " + pensioner.getName() + ": " + pensionerPension);
        System.out.println("Будущая пенсия для подростка " + teenager.getName() + ": " + teenagerPension);
    }


}

