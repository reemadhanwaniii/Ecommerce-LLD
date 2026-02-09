package src.services.filterService;

import src.models.Product;

import java.util.List;
import java.util.stream.Collectors;

public class BrandFilterCriteria implements Criteria {

    private final String brandName;

    public BrandFilterCriteria(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public List<Product> satisy(List<Product> products) {
        return products.stream().filter(
                product -> product.getBrand().getBrandName().equalsIgnoreCase(this.brandName)
        ).collect(Collectors.toList());
    }
}
