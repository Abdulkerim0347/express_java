package practice_6.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();

        costCounter.addCosts(1,7000.00);
        costCounter.addCosts(2,5970.00);
        costCounter.addCosts(3,8660.00);
        costCounter.addCosts(4,700.00);
        costCounter.addCosts(5,344.4);

        System.out.println(costCounter.minCost());
        System.out.println(costCounter.getCosts(3));
    }
}
