package behavior.strategy.order;

import java.math.BigDecimal;

/**
 * 团购订单
 */
public class GroupDiscountStrategy implements DiscountStrategy {

    BigDecimal groupDiscountCoefficient = new BigDecimal("0.75");

    @Override
    public BigDecimal calDiscount(Order order) {
        return order.getTotalAmount().multiply(groupDiscountCoefficient);
    }
}
