public class PensionFund {


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


    public double calculateFuturePension(Person person) {
        return 0.7 * person.calculateAverageSalary();
    }
}