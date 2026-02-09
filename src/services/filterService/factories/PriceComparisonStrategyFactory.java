package src.services.filterService.factories;

import src.services.filterService.strategies.*;
import src.services.filterService.utils.Operator;

public class PriceComparisonStrategyFactory {
    public static PriceComparisonStrategy getPriceComparisonStrategy(Operator strategy){
       switch (strategy) {
                case Operator.GREATER_THAN_EQUAL:
                    return new GreaterThanEqualsTo();
                case Operator.LESS_THAN_EQUAL:
                    return new LessThanEqualsToStrategy();
               case Operator.GREATER_THAN:
                   return new GreaterThanStrategy();
               case  Operator.LESS_THAN:
                   return new LessThanStrategy();
               case Operator.EQUAL:
                   return new EqualsToStrategy();
       }
        return null;
    }
}
