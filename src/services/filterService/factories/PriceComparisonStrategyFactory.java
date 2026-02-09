package src.services.filterService.factories;

import src.services.filterService.strategies.*;

public class PriceComparisonStrategyFactory {
    public static PriceComparisonStrategy getPriceComparisonStrategy(String strategy){
        if(strategy.equals("GREATER_THAN_EQUAL")){
            return new GreaterThanEqualsTo();
        }else if(strategy.equals("LESS_THAN_EQUAL")){
            return new LessThanEqualsToStrategy();
        }else if(strategy.equals("EQUAL")){
            return new EqualsToStrategy();
        }else if(strategy.equals("GREATER_THAN")){
            return new GreaterThanStrategy();
        }else if(strategy.equals("LESS_THAN")){
            return new LessThanStrategy();
        }
        return null;
    }
}
