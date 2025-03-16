package practice_6.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    private ArrayList<Double> costPerMonth;

    public CostCounter() {
        this.costPerMonth = new ArrayList<>();
    }

    public void addCosts(int month, Double costs) {
        costPerMonth.add(month - 1, costs);
    }

    public Double minCost() {
        AtomicReference<Double> min = new AtomicReference<>(costPerMonth.getFirst());
        costPerMonth.forEach(
                costsPerMonth -> {
                    if (costsPerMonth < min.get()) {
                        min.set(costsPerMonth);
                    }
                }
        );
                return min.get();
    }

    public Double getCosts(int month) {
        return costPerMonth.get(month-1);
    }

}
