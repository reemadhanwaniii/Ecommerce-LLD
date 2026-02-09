package src.services.filterService.strategies;

import src.services.filterService.Criteria;

public class EqualsToStrategy implements PriceComparisonStrategy {

    @Override
    public boolean compare(double productPrice, double filterPrice) {
        return productPrice == filterPrice;
    }
}
