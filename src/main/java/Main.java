import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        int summ = 10;
        System.out.println("цена за 1 кв.м. = " + summ);

        List<Region> regionList = regionListGenerator(20);

        Consumer<List<Region>> cadastralAssistant = regions -> {
            regions.forEach(region -> {
                double checkPrice = region.getCost() / region.getArea();
                if (checkPrice > summ) {
                    System.out.printf("участок №%s площадью:%.2f стоимостью:%.2f удовлетоворяет условиям честности%n",
                            region.getRegionID(), region.getArea(), region.getCost());
                } else {
                    System.out.printf("участок №%s площадью:%.2f стоимостью:%.2f не удовлетоворяет условиям честности%n",
                            region.getRegionID(), region.getArea(), region.getCost());
                }
            });
        };

        cadastralAssistant.accept(regionList);
    }

    public static List<Region> regionListGenerator(int regionsCount) {
        List<Region> regionList = new ArrayList<>();
        for (int i = 1; i <= regionsCount; i++) {
            regionList.add(new Region(randomGenerator(10),
                    randomGenerator(10),
                    randomGenerator(100),
                    "" + i));
        }
        return regionList;
    }

    public static double randomGenerator(int convertationPoint) {
        return Math.random() * convertationPoint;
    }
}
