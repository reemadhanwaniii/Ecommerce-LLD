package src;

import src.models.Brand;
import src.models.Category;
import src.models.Product;
import src.services.filterService.*;
import src.services.filterService.factories.PriceComparisonStrategyFactory;
import src.services.filterService.utils.Operator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        create Brand

        Brand b1 = new Brand("Apple");
        Brand b2 = new Brand("Samsung");
        Brand b3 = new Brand("Oneplus");

//        create Category

        Category c1 = new Category("Electronics");

//        create products

        Product p1 = new Product("Samsung Galaxy s20",30000,b2,c1);
        Product p2 = new Product("Iphone 15",60000,b1,c1);
        Product p3 = new Product("Oneplus 17",12000,b3,c1);
        Product p4 = new Product("Iphone 17",100000,b1,c1);
        Product p5 = new Product("Samsung s20",15000,b2,c1);

       Criteria cr1 = new BrandFilterCriteria("samsung");
       Criteria cr2 = new BrandFilterCriteria("Oneplus");

       Criteria cr3 = new PriceFilterCriteria(22000,
               PriceComparisonStrategyFactory.getPriceComparisonStrategy(Operator.LESS_THAN_EQUAL));
       Criteria cr4 = new PriceFilterCriteria(50000,
               PriceComparisonStrategyFactory.getPriceComparisonStrategy(Operator.GREATER_THAN));

       Criteria cr5 = new OrFilterCriteria(List.of(cr1,cr3));
       Criteria cr6 = new AndFilterCriteria(List.of(cr1,cr3));

       List<Product> products = List.of(p1,p2,p3,p4,p5);
//       List<Product> result = cr1.satisy(products);
//        List<Product> result = cr2.satisy(products);
//        List<Product> result = cr3.satisy(products);
//        List<Product> result = cr4.satisy(products);

//        List<Product> result = cr5.satisy(products);

        List<Product> result = cr6.satisy(products);

       for(Product pr : result) {
           System.out.println(pr.getName());
       }


    }
}
