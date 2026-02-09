package src.services.filterService;

import src.models.Product;
import src.services.filterService.strategies.PriceComparisonStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class PriceFilterCriteria implements Criteria {

    private final double price;
    private final PriceComparisonStrategy priceComparisonStrategy;

    public PriceFilterCriteria(double productPrice, PriceComparisonStrategy priceComparisonStrategy) {
        this.price = productPrice;
        this.priceComparisonStrategy = priceComparisonStrategy;
    }


    @Override
    public List<Product> satisy(List<Product> products) {
        return products.stream().filter(product -> priceComparisonStrategy.compare(product.getPrice(),this.price))
                .collect(Collectors.toList());
    }
}
