package src.services.filterService.strategies;

public class GreaterThanEqualsTo implements PriceComparisonStrategy{
    @Override
    public boolean compare(double productPrice, double filterPrice) {
        return productPrice >= filterPrice;
    }
}
