package src.services.filterService;

import src.models.Product;

import java.util.List;
import java.util.stream.Collectors;

public class AndFilterCriteria implements Criteria{
    private final List<Criteria> criteriaList;

    public AndFilterCriteria(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    @Override
    public List<Product> satisy(List<Product> products) {

        /**
         * -> Go to every single product
         * -> let the product pass through every criteria
         * -> if product fails any criteria don't add them in a list
         */

        return products.stream().filter(
                product -> criteriaList.stream().noneMatch(criteria -> criteria.satisy(List.of(product)).isEmpty())
        ).collect(Collectors.toList());

    }
}
