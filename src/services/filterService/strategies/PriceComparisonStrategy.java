package src.services.filterService.strategies;

import src.models.Product;

public interface PriceComparisonStrategy {
    boolean compare(double productPrice,double filterPrice);
}
