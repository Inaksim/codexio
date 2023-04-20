public class SalesConsultant {

    private Shop workingShop;
    private double earnedMoney;

    public SalesConsultant() {
        this.workingShop = Shop.getInstance();
        this.workingShop.addWorker((Worker) this);
    }

    public void sellProduct(double price) {
        if(price > 0) {
            this.earnedMoney += price;
        }
    }

    public double getMoney() {
        return this.earnedMoney;
    }
}
