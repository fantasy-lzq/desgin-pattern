package behavior.strategy.order;

import java.math.BigDecimal;

/**
 * 折扣策略
 */
public interface DiscountStrategy {
    BigDecimal calDiscount(Order order);
}
