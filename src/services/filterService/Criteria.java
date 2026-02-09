package src.services.filterService;

import src.models.Product;

import java.util.List;

public interface Criteria {
    List<Product> satisy(List<Product> products);
}
