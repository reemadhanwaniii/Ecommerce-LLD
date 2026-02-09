package src.services.filterService;

import src.models.Product;

import java.util.List;
import java.util.stream.Collectors;

public class OrFilterCriteria implements Criteria{

    private final List<Criteria> criteriaList;

    public OrFilterCriteria(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    @Override
    public List<Product> satisy(List<Product> products) {
        /**
         * -> go to each product
         * -> pass each product to list of criterias
         * -> if it passes any criteria then add it to the list
         */
        return products.stream().filter(product -> criteriaList.stream().anyMatch(criteria ->  !criteria.satisy(List.of(product)).isEmpty()))
                .collect(Collectors.toList());
    }
}
