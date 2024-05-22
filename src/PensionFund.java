public class PensionFund {
    private static final double PENSION_RATE = 0.7;

    private String fundName;
    private int foundationYear;
    private int numberOfContributors;
    private double totalAssets;
    private String address;

    public PensionFund(String fundName, int foundationYear, int numberOfContributors, double totalAssets, String address) {
        this.fundName = fundName;
        this.foundationYear = foundationYear;
        this.numberOfContributors = numberOfContributors;
        this.totalAssets = totalAssets;
        this.address = address;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "fundName='" + fundName + '\'' +
                ", foundationYear=" + foundationYear +
                ", numberOfContributors=" + numberOfContributors +
                '}';
    }


    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getNumberOfContributors() {
        return numberOfContributors;
    }

    public void setNumberOfContributors(int numberOfContributors) {
        this.numberOfContributors = numberOfContributors;
    }


    public double calculatePension(Person person) {
        double averageSalary = person.calculateAverageSalary();
        return averageSalary * PENSION_RATE;
    }



}