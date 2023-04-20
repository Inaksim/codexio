import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static Shop instance;
    private List<Worker> workers;

    private Shop(){
        this.workers = new ArrayList<>();
    }

    public static Shop getInstance() {
        if(instance == null) {
            instance = new Shop();
        }
        return instance;
    }


    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    public List<Worker> getWorkers() {
        return this.workers;
    }

    public double getTurnover() {
        double turnOver = 0.0;
        for(Worker worker : this.workers) {
            if(worker instanceof SalesConsultant) {
                turnOver += ((SalesConsultant) worker).getMoney();
            }
            if(worker instanceof MarketingSpecialist) {
                turnOver += ((MarketingSpecialist) worker).getBudget();
            }
        }
        return turnOver;
    }
}

//The "Workers" List in the Shop class is now parameterized with "Worker" interface
//The extra semicolon after the of statement in the getTurnover() method is removed
//In the class Shop was created new method 'getWorkers'
//addWorker() method takes a "Worker" interface
//The methods sellProduct() and spendMoney() check if the passed-in value is grater than 0
